package cn.ojbkfeng.controller;

import cn.ojbkfeng.utils.ReturnMsg;
import cn.ojbkfeng.service.DoctorService;
import cn.ojbkfeng.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

/**
 * /login.html        登录          POST            Done
 * /checkLogin        检查登录      POST
 */
@Controller
public class LoginController {

    @Autowired
    DoctorService doctorService;
    @Autowired
    LoginService loginService;

    @Autowired
    HttpServletRequest request;


    /**
     * 检查登录状态
     *
     * @return
     */
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public ReturnMsg checkLogin(@RequestParam String username, @RequestParam String email) {
        loginService.checkOnline(username, email);
        return ReturnMsg.success();
    }


    /**
     * 登录
     */
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) throws Exception{
        System.out.println(password + "  " + username);
        if (doctorService.checkUserAndPwd(username, password)) {
            return "login";
        }

        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        // 单位：秒  30天
        cookie.setMaxAge(60 * 60 * 24 * 30);
        response.addCookie(cookie);
        response.setStatus(HttpServletResponse.SC_OK);
//        return "redirect:index.html";可以直接返回html页面
        String result = "redirect:/html/doctorMain.html?name=" +  URLEncoder.encode(username,"UTF-8");

        return result;
    }


}
