package com.xcy.service;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/17 21:53
 */
public interface StudentService {


    int requiredDelete(String id);

    int requiredDeleteError(String id);

    int newDelete(String id);

    int newDeleteError(String id);

    int nestedDelete(String id);

    int nestedDeleteError(String id);

    int mandatoryDelete(String id);

    int mandatoryDeleteError(String id);

    int neverDelete(String id);

    int neverDeleteError(String id);

    int supportsDelete(String id);

    int supportsDeleteError(String id);

    int notSupportedDelete(String id);

    int notSupportedDeleteError(String id);
}
