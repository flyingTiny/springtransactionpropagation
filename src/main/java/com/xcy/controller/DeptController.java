package com.xcy.controller;

import com.xcy.dto.Dept;
import com.xcy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/15 22:15
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //内部调用，inner事务不生效的
    @DeleteMapping("/dept/{id}/selfCall")
    public void deleteSelfCall(@PathVariable String id) {
        deptService.deleteOuter(id);
    }


    @DeleteMapping("/dept/{id}/{propagation}/{whereError}")
    public void delete(@PathVariable String id, @PathVariable String propagation, @PathVariable String whereError) {
        String choice = propagation.toLowerCase() + "/" + whereError.toLowerCase();
        switch (choice) {
            case "required/outer":
                //inner跟随回滚
                deptService.requiredOuterErrorDelete(id);
                break;
            case "required/inner":
                //outer跟随回滚
                deptService.requiredInnerErrorDelete(id);
                break;
            case "new/outer":
                //不影响inner
                deptService.newOuterErrorDelete(id);
                break;
            case "new/inner":
                //不影响outer
                deptService.newInnerErrorDelete(id);
                break;
            case "nested/outer":
                //inner跟随回滚
                deptService.nestedOuterErrorDelete(id);
                break;
            case "nested/inner":
                //不影响outer
                deptService.nestedInnerErrorDelete(id);
                break;
            case "mandatory/outer":
                //都会回滚
                deptService.mandatoryOuterErrorDelete(id);
                break;
            case "mandatory/inner":
                //都会回滚
                deptService.mandatoryInnerErrorDelete(id);
                break;
            case "never/outer":
                deptService.neverOuterErrorDelete(id);
                break;
            case "never/inner":
                deptService.neverInnerErrorDelete(id);
                break;
            case "supports/outer":
                deptService.supportsOuterErrorDelete(id);
                break;
            case "supports/inner":
                deptService.supportsInnerErrorDelete(id);
                break;
            case "notSupported/outer":
                deptService.notSupportedOuterErrorDelete(id);
                break;
            case "notSupported/inner":
                deptService.notSupportedInnerErrorDelete(id);
                break;
            default:
                System.out.println("Wrong choice!");
        }

    }


    //使用oracle时,应该是只支持Isolation.DEFAULT=Isolation.READ_COMMITTED，Isolation.SERIALIZABLE这两种
    //先准备好插入url，分别请求dept及deptSerializable,insert,查看事务隔离性的差别
    @GetMapping("/dept")
    public List<Dept> dept() {
        return deptService.list();
    }

    @GetMapping("/dept/serializable")
    public List<Dept> deptSerializable() {
        return deptService.listSerializable();
    }

    @PostMapping("/dept")
    public int insert(@RequestBody Dept dept) {
        System.out.println("insert dept");
        return deptService.insert(dept);
    }


}
