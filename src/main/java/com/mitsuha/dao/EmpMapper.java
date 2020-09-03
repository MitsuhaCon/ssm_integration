package com.mitsuha.dao;

import com.mitsuha.pojo.Emp;

public interface EmpMapper {
    Emp getEmpByEmpno(int empno);
}
