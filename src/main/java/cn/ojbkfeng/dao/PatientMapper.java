package cn.ojbkfeng.dao;

import cn.ojbkfeng.bean.Drugs;
import cn.ojbkfeng.bean.Patient;
import cn.ojbkfeng.bean.PatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {
    long countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    Patient selectByPrimaryKey(Integer id);
    List<Patient> selectWaitingPatients();

    int selectCountPatients();
    int selectCountCuredPatients();

    Patient selectPatientInfo(Patient record);

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    void updateCureTo1( Patient record);

    /**
     * 查找已经治好的人
     * @return
     */
    List<Patient> selectCuredPatient();
}