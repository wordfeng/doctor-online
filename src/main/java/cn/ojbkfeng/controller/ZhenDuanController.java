package cn.ojbkfeng.controller;

import cn.ojbkfeng.bean.Doctor;
import cn.ojbkfeng.bean.Drugs;
import cn.ojbkfeng.service.DoctorService;
import cn.ojbkfeng.utils.ReturnMsg;
import cn.ojbkfeng.bean.Patient;
import cn.ojbkfeng.service.ZhenDuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.List;
import java.util.Random;



/**
 * /nextOne/{name}/{phone}             GET     更新病人看病状态                            Done
 * /yanyu                              GET     谚语 提醒医生 为人名服务                    Done
 * /patients?doctorName=               GET     获取医生对应病人列表                        Done
 * /getPatientInfo?name= &phone=       GET     获取病人信息                                Done
 * /getCuredPatient                    GET     获取治疗过的病人名字、性别以及电话号码      Done
 * /getDoctorInfo                      GET     获取医生信息                                Done
 * /setResult                          GET     诊断结果入库
 * /search/{name}                      GET     搜索药品名字 以及对应的规格余数信息         Done
 *
 */
@RestController
public class ZhenDuanController {

    @Autowired
    ZhenDuanService zhenDuanService;

    @Autowired
    DoctorService doctor;


//    @RequestMapping(value = "/pindian",method = RequestMethod.GET)
//    public Map<String,String> getPindian(@PathVariable("name")String name){
//        HashMap<String,String> map = new HashMap<>();
//        return map;
//    }

    @RequestMapping(value = "/setResult",method = RequestMethod.GET)
    public void setResult(){

    }

    @RequestMapping(value = "/getDoctorInfo/{name}/{email}",method = RequestMethod.GET)
    public ReturnMsg getDoctorInfo(@PathVariable("name")String name, @PathVariable("email") String email){
        email=email+".com";
        return ReturnMsg.success().add("doctorInfo",doctor.getDoctorInfo(name,email));
    }



    /**
     * 搜索药品
     * @param name
     * @return
     */
    @RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
    public ReturnMsg search(@PathVariable("name") String name) {
//        return ReturnMsg.success().add("medicine", zhenDuanService.search(name));
        List<Drugs> search = zhenDuanService.search(name);
        if(search.isEmpty()){
            return ReturnMsg.fail("查无此药，请检查药名。");
        }
        return ReturnMsg.success().add("searches",search).add("total",search.size());
    }

    /**
     * 获取病人信息
     *
     * @return
     */
    @RequestMapping(value = "/getPatientInfo", method = RequestMethod.GET)
    public ReturnMsg getPatientInfo(@RequestParam String name, @RequestParam String phone) {
        return ReturnMsg.success().add("patientInfo", zhenDuanService.getPatientInfo(name, phone));
    }

    /**
     * 获取已经治疗好的病人
     * getCuredPatient
     */
    @RequestMapping(value = "/getCuredPatient",method = RequestMethod.GET)
    public ReturnMsg getCuredPatient(){
//        zhenDuanService
        return ReturnMsg.success()
                .add("CuredPatient",zhenDuanService.getCuredPatient())
                .add("total",zhenDuanService.getCountCuredPatient());
    }


    /**
     * 将正在就诊的标记为已经就诊完毕 时间最小的
     *
     * @param name
     * @param phone
     * @return
     */
    @RequestMapping(value = "/nextOne/{name}/{phone}", method = RequestMethod.GET)
    public ReturnMsg nextOne(@PathVariable String name, @PathVariable String phone) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setPhoneNumber(phone);
        zhenDuanService.updateCureStatus(patient);
        return ReturnMsg.success();
    }


    /**
     * 诊断台里面的标语信息  随机一条标语
     *
     * @return
     */
    @RequestMapping(value = "/yanyu", method = RequestMethod.GET)
    public ReturnMsg getYanYu() {
        return ReturnMsg.success().add("biaoyu", zhenDuanService.getBiaoYu(new Random().nextInt(7) + 1));
    }

    /**
     * 获取某医生对应的待诊病人信息
     *
     * @param doctorName 医生名
     * @return 待诊病人列表 每次返回所有病人排名的前6个，以及总人数
     */
    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public ReturnMsg getPatients(@RequestParam(value = "doctorName", defaultValue = "贾名") String doctorName) {
        ReturnMsg result = ReturnMsg.success();
        result.add("totalPatient", zhenDuanService.countWaitingPatients());
        result.add("waitingPatient", zhenDuanService.getWaitingPatients());
        return result;
    }
}
