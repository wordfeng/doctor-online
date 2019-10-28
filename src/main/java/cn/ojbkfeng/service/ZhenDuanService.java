package cn.ojbkfeng.service;

import cn.ojbkfeng.bean.BiaoYu;
import cn.ojbkfeng.bean.Patient;
import cn.ojbkfeng.dao.BiaoYuMapper;
import cn.ojbkfeng.dao.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ZhenDuanService {

    @Autowired
    BiaoYuMapper biaoYuMapper;
    @Autowired
    PatientMapper patientMapper;

    /**
     * 查询时间排序最早挂号的6个病人信息
     * @return
     */
    public List<Patient> getWaitingPatients(){
        return patientMapper.selectWaitingPatients();
    }

    /**
     * 查询数据库中的标语
     * @param i
     * @return
     */
    public BiaoYu getBiaoYu(int i) {
       return biaoYuMapper.selectByPrimaryKey(i);
    }


    /**
     * 更新cure字段
     * 标志已经诊断  治疗完毕
     * @param patient
     */
    public void updateCureStatus(Patient patient) {
        patientMapper.updateCureTo1(patient);
    }

    public int countWaitingPatients() {
        return patientMapper.selectCountPatients();
    }

    public Patient getPatientInfo(String name, String phone) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setPhoneNumber(phone);
        return patientMapper.selectPatientInfo(patient);
    }
}
