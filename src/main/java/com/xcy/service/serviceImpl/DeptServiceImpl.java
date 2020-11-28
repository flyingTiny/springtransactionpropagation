package com.xcy.service.serviceImpl;

import com.xcy.dto.Dept;
import com.xcy.mapper.DeptMapper;
import com.xcy.service.DeptService;
import com.xcy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/15 22:25
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private StudentService studentService;

    @Transactional
    @Override
    public void deleteOuter(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = deleteInner(String.valueOf(Integer.valueOf(id) + 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(n);
        System.out.println(m);
    }

    @Transactional
    @Override
    public int deleteInner(String id) {
        int n = deptMapper.deleteById(id);
        System.out.println(1/0);
        return n;
    }

    @Transactional
    @Override
    public void requiredOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.requiredDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void requiredInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.requiredDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }

    @Transactional
    @Override
    public void newOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.newDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void newInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.newDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }

    @Transactional
    @Override
    public void nestedOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.nestedDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void nestedInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.nestedDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }


    @Transactional
    @Override
    public void mandatoryOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.mandatoryDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void mandatoryInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.mandatoryDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }

    @Transactional
    @Override
    public void neverOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.neverDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void neverInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.neverDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }

    @Transactional
    @Override
    public void supportsOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.supportsDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void supportsInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.supportsDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }

    @Transactional
    @Override
    public void notSupportedOuterErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.notSupportedDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(1 / 0);
    }

    @Transactional
    @Override
    public void notSupportedInnerErrorDelete(String id) {
        int n = deptMapper.deleteById(id);
        int m = 0;
        try {
            m = studentService.notSupportedDeleteError(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }


    @Override
    public List<Dept> list() {
        System.out.println(deptMapper.list().size());
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(deptMapper.list().size());
        return deptMapper.list();
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public List<Dept> listSerializable() {
        System.out.println(deptMapper.list().size());
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(deptMapper.list().size());
        return deptMapper.list();
    }


    @Override
    public int insert(Dept dept) {
        return deptMapper.insert(dept);
    }


}
