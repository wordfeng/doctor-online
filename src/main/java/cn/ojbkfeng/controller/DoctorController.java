package cn.ojbkfeng.controller;

import cn.ojbkfeng.bean.Doctor;
import cn.ojbkfeng.bean.Msg;
import cn.ojbkfeng.service.DoctorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    Logger log = Logger.getLogger(DoctorService.class.getClass());

    /**
     * 登录
     */
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
//    @ResponseBody
    public String login(@RequestParam String username, @RequestParam String password/*@PathVariable("username") String uername, @PathVariable("password") String password*/) {
//        log.trace(doctor);
        System.out.println(password + "  " + username);
        if (doctorService.checkUserAndPwd(username, password)) {
            return "login";
        }
        System.out.println("登录成功");
//        return "redirect:index.html";可以直接返回html页面
        return "emp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginshow() {
        return "login";
    }
}
