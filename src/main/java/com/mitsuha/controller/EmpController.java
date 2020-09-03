package com.mitsuha.controller;

import com.mitsuha.pojo.Emp;
import com.mitsuha.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yangliming
 * @classname EmpController
 * @description //TODO
 * @data 2020/8/30 18:17
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/emp")
    public ModelAndView getEmp(ModelAndView model){
        Emp emp = empService.getEmpByEmpno(7369);
        model.addObject("emp",emp);
        model.setViewName("emp");
        return model;
    }
}
