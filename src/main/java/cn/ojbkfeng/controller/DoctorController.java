package cn.ojbkfeng.controller;

import cn.ojbkfeng.service.DoctorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @Autowired
    HttpServletRequest request;


    Logger log = Logger.getLogger(DoctorService.class.getClass());

//    /**
//     * 登录
//     */
//    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
////    @ResponseBody
//    public String login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {
//        System.out.println(password + "  " + username);
//        if (doctorService.checkUserAndPwd(username, password)) {
//            return "login";
//        }
//
//        HttpSession session = request.getSession();
//        session.setAttribute("username", username);
//        Cookie cookie = new Cookie("JSESSIONID", session.getId());
//        // 单位：秒  30天
//        cookie.setMaxAge(60 * 60 * 24 * 30);
//        response.addCookie(cookie);
//        response.setStatus(HttpServletResponse.SC_OK);
////        return "redirect:index.html";可以直接返回html页面
//        return "emp";
//    }


    @RequestMapping("/test")
    public String register(HttpServletResponse response) {

        String sessionId = request.getRequestedSessionId();
        System.out.println();
        request.getSession();

//        response.addCookie(cookies);

        return null;
    }

}
