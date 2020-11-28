package com.xcy.service;

import com.xcy.dto.Dept;

import java.util.List;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/15 22:15
 */
public interface DeptService {
    List<Dept> list();

    List<Dept> listSerializable();

    int insert(Dept dept);

    void deleteOuter(String id);

    int deleteInner(String id);

    void requiredOuterErrorDelete(String id);

    void requiredInnerErrorDelete(String id);

    void newOuterErrorDelete(String id);

    void newInnerErrorDelete(String id);

    void nestedOuterErrorDelete(String id);

    void nestedInnerErrorDelete(String id);

    void mandatoryOuterErrorDelete(String id);

    void mandatoryInnerErrorDelete(String id);

    void neverOuterErrorDelete(String id);

    void neverInnerErrorDelete(String id);

    void supportsOuterErrorDelete(String id);

    void supportsInnerErrorDelete(String id);

    void notSupportedOuterErrorDelete(String id);

    void notSupportedInnerErrorDelete(String id);
}
