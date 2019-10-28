package cn.ojbkfeng.controller;

import cn.ojbkfeng.bean.Msg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    /**
     * 挂号信息
     */
    @RequestMapping("/patientservice")
    public Msg getGuaHaoInfo(){

        //TODO: 数据库插入挂号信息
        return Msg.success();
    }

}
