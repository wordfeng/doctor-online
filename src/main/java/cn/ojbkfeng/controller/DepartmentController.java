package cn.ojbkfeng.controller;


import cn.ojbkfeng.bean.Department;
import cn.ojbkfeng.bean.Msg;
import cn.ojbkfeng.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 部门相关请求处理
 */
@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDeptsWithJson(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {

        return Msg.success().add("depts", departmentService.getAllEmps());
    }




}
