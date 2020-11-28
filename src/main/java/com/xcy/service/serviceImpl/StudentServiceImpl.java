package com.xcy.service.serviceImpl;

import com.xcy.mapper.StudentMapper;
import com.xcy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/17 22:14
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    @Transactional
    @Override
    public int requiredDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional
    @Override
    public int requiredDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public int newDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public int newDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public int nestedDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional(propagation = Propagation.NESTED)
    @Override
    public int nestedDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public int mandatoryDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public int mandatoryDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }


    @Transactional(propagation = Propagation.NEVER)
    @Override
    public int neverDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional(propagation = Propagation.NEVER)
    @Override
    public int neverDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public int supportsDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public int supportsDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int notSupportedDelete(String id) {
        int n =  studentMapper.deleteByDId(id);
        return n;
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int notSupportedDeleteError(String id) {
        int n =  studentMapper.deleteByDId(id);
        System.out.println(1/0);
        return n;
    }



}
