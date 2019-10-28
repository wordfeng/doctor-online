package cn.ojbkfeng.controller;

import cn.ojbkfeng.bean.Msg;
import cn.ojbkfeng.bean.Patient;
import cn.ojbkfeng.service.ZhenDuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


/**
 * /nextOne                            GET     更新病人看病状态                            Done
* /yanyu                               GET     谚语 提醒医生 为人名服务                    Done
 * /patients?doctorName=               GET     获取医生对应病人列表                        Done
 * /getPatientInfo?name= &phone=       GET     获取病人信息                                Done
 * /getDrugsInfo                       GET     获取药品信息
 * /getCuredPatient                    GET     获取治疗过的病人名字、性别以及电话号码
 * /getDoctorInfo                      GET     获取医生信息
 * /setResult
 */
@RestController
public class ZhenDuanController {

    @Autowired
    ZhenDuanService zhenDuanService;


    /**
     * 获取病人信息
     * @return
     */
    @RequestMapping(value = "/getPatientInfo",method = RequestMethod.GET)
    public Msg getPatientInfo(@RequestParam String name,@RequestParam String phone){
        System.out.println(zhenDuanService.getPatientInfo(name,phone)+"12131233323213");
        return Msg.success().add("patientInfo",zhenDuanService.getPatientInfo(name,phone));
    }


    /**
     * 将正在就诊的标记为已经就诊完毕 时间最小的
     * @param name
     * @param phone
     * @return
     */
    @RequestMapping(value = "/nextOne",method = RequestMethod.GET)
    public Msg nextOne(@RequestParam String name,@RequestParam String phone){
        Patient patient = new Patient();
        patient.setName(name);
        patient.setPhoneNumber(phone);
        zhenDuanService.updateCureStatus(patient);
        return Msg.success();
    }


    /**
     * 诊断台里面的标语信息  随机一条标语
     * @return
     */
    @RequestMapping(value = "/yanyu",method = RequestMethod.GET)
    public Msg getYanYu(){
        return Msg.success().add("biaoyu",zhenDuanService.getBiaoYu(new Random().nextInt(7)+1));
    }

    /**
     * 获取某医生对应的待诊病人信息
     * @param doctorName 医生名
     * @return 待诊病人列表 每次返回所有病人排名的前6个，以及总人数
     */
    @RequestMapping(value = "/patients",method = RequestMethod.GET)
    public Msg getPatients(@RequestParam(value = "doctorName", defaultValue = "贾名")  String doctorName){
        Msg result = Msg.success();
        result.add("totalPatient",zhenDuanService.countWaitingPatients());
        result.add("waitingPatient",zhenDuanService.getWaitingPatients());
        return result;
    }
}
