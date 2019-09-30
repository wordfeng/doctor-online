package cn.ojbkfeng.controller;


import cn.ojbkfeng.bean.Employee;
import cn.ojbkfeng.bean.Msg;
import cn.ojbkfeng.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 处理员工CRUD请求
 */

@Controller
public class EmployeeController {

    /**
     * URI
     * /emps?pageNum=  分页查询所有员工默认1
     * /emp/{id} GET 查询
     * /emp     POST添加
     * /emp/{id} PUT修改
     * /emp/{id} DELETE删除
     */

    Logger logs = Logger.getLogger(EmployeeService.class.getClass());


    @Autowired
    EmployeeService employeeService;


    /**
     * 删除员工
     * id
     */
    @RequestMapping(value = "/emp/{empId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteEmp(@PathVariable("empId") Integer empId){
//        System.out.println("要删除！！"+empId);
        employeeService.deleteEmp(empId);
        return Msg.success();
    }



    /**
     * 修改员工信息
     * 员工唯一识别id
     *   $.ajax({
     *        url: "${APP_PATH}/emp/" + $("#update_emp_btn").attr("edit-emp-id"),
     *        type: "POST",
     *        data: $("#emp_update_model form").serialize()+"&_method=PUT",
     *   Tomcat 不会封装PUT请求体中的数据
     *   Tomcat 只封装POST形式的请求体入HTTPServletRequest
     *   org.apache.catalina.connector.Request--parseParameters()
     *   protected String parseBodyMethods="POST"
     *   if(!getConnector.isParseBodyMethod(getMethod())){
     *       success = true ;
     *       return;
     *   }
     *
     *   spring 用HTTPPutFormContentFilter解决
     */
    @RequestMapping(value = "/emp/{empId}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateEmp(Employee employee){
        System.out.println("============="+employee);

        employeeService.updateEmployee(employee);
        return Msg.success();
    }

    /**
     * 获取某个员工信息
     */
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getEmpInfo(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmpInfo(id);
        return Msg.success().add("empInfo", employee);
    }


    /**
     * 检查邮箱是否已被使用
     */
    @RequestMapping(value = "/checkEmail")
    @ResponseBody
    public Msg checkEmail(@RequestParam("email") String email) {

        logs.trace("======================="+email);
        //ajax前端请求校验  未添加前端ajax
        String reg = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
        if (email.matches(reg)==false) {
            return Msg.fail().add("email_fail", "email格式错误");
        }


        boolean result = employeeService.checkEmail(email);
        if (result == false) {
            return Msg.fail();
        } else {
            return Msg.success();
        }
    }


    /**
     * 添加新员工
     *
     * @return
     */
    @RequestMapping(path = "/emp", method = RequestMethod.POST)
    @ResponseBody
    public Msg addNewEmp(@Valid Employee employee, BindingResult result) {


//        System.out.println(employee);
        if (result.hasErrors()) {
            return Msg.fail();
        }

        if (!employeeService.checkEmail(employee.getEmail())) {
            return Msg.fail();
        }
        employeeService.addNewEmp(employee);
        return Msg.success();
    }


    /**
     * 需要Jackson包处理请求
     *
     * @param pageNum
     * @return
     */
    @RequestMapping(path = "/emps")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {
//        log.trace("dddddddddddddddddddddddddddddddd");

        //每页数据
        PageHelper.startPage(pageNum, 8);
        List<Employee> emps = employeeService.getAllEmps();
        //页数
        PageInfo page = new PageInfo(emps, 5);
        return Msg.success().add("pageInfo", page);
    }

    /**
     * 查询员工数据（分页查询）
     *
     * @return
     */
    @RequestMapping("/list")
    public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
/*        //引入分页插件pageHelper
        // 查询前调用，传入页码以及每页的大小
        //获取第pageNum页，5条内容*/
        PageHelper.startPage(pn, 8);
/*//        PageHelper.offsetPage(pageNum, 6);
        //startpage后紧跟的查询就是分页查询*/
        List<Employee> emps = employeeService.getAllEmps();
     /*   //pageInfo包装查询结果, 直接将pageinfo交给页面
        //结果封装了详细的分页信息
        //连续显示5页*/
        PageInfo page = new PageInfo(emps, 5);
        model.addAttribute("pageInfo", page);
        //返回到list.jsp展示
        return "list";
    }

}
