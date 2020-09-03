package com.mitsuha.service;

import com.mitsuha.pojo.Emp;

/**
 * @author yangliming
 * @classname EmpService
 * @description //TODO
 * @data 2020/8/30 18:27
 */
public interface EmpService {
    Emp getEmpByEmpno(int empno);
}
