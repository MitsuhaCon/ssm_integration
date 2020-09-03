package com.mitsuha.service;

import com.mitsuha.dao.EmpMapper;
import com.mitsuha.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangliming
 * @classname EmpServiceImpl
 * @description //TODO
 * @data 2020/8/30 18:28
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @Override
    public Emp getEmpByEmpno(int empno) {
        return empMapper.getEmpByEmpno(empno);
    }
}
