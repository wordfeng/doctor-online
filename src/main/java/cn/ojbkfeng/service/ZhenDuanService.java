package cn.ojbkfeng.service;

import cn.ojbkfeng.bean.BiaoYu;
import cn.ojbkfeng.bean.Drugs;
import cn.ojbkfeng.bean.Patient;
import cn.ojbkfeng.dao.BiaoYuMapper;
import cn.ojbkfeng.dao.DrugsMapper;
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
    @Autowired
    DrugsMapper drugs;

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


    /**
     * 获取等待病人总数
     * @return
     */
    public int countWaitingPatients() {
        return patientMapper.selectCountPatients();
    }

    /**
     * 根据姓名和手机号   获取病人信息
     * @param name
     * @param phone
     * @return
     */
    public Patient getPatientInfo(String name, String phone) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setPhoneNumber(phone);
        return patientMapper.selectPatientInfo(patient);
    }

    /**
     * 查找治疗好的病人
     * @return
     */
    public List<Patient> getCuredPatient(){
        return patientMapper.selectCuredPatient();
    }

    /**
     * 查找治疗好的病人的总数
     * @return
     */
    public int getCountCuredPatient(){
        return patientMapper.selectCountCuredPatients();
    }

    /**
     * 模糊查询药品信息
     * @param name
     * @return
     */
    public List<Drugs> search(String name) {
        return drugs.selectByKeyWords(name);
    }

//      <select id="selectByKeyWords" parameterType="cn.ojbkfeng.bean.Drugs" resultMap="BaseResultMap">
//    select
//            <include refid="Base_Column_List" />
//            from drug_storage
//    where  medicine like '%'
//            -- #{medicine,jdbcType=VARCHAR}
//  </select>
}
