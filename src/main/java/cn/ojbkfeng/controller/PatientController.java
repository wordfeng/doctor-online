package cn.ojbkfeng.controller;

import cn.ojbkfeng.bean.Checked;
import cn.ojbkfeng.dao.CheckedMapper;
import cn.ojbkfeng.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    CheckedMapper checkedMapper;

    @RequestMapping(value = "/updateChecked",method = RequestMethod.GET)
    public void updateChecked(Checked checked){
//        checkedMapper.updateByExampleSelective(checked);
//        checkedMapper.updateByExample();
        checkedMapper.updateByChecked(checked);
    }











    /**
     * 挂号信息
     */
//    @RequestMapping("/patientservice")
//    public ReturnMsg getGuaHaoInfo(){
//
//        //TODO: 数据库插入挂号信息
//        return ReturnMsg.success();
//    }

}
