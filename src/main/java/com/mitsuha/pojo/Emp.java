package com.mitsuha.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author yangliming
 * @classname Emp
 * @description //TODO
 * @data 2020/8/30 18:11
 */
public class Emp implements Serializable {
    private String ename;
    private Integer empno;
    private BigDecimal sal;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", empno=" + empno +
                ", sal=" + sal +
                '}';
    }
}
