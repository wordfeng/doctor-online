package cn.ojbkfeng.service;


import cn.ojbkfeng.bean.Doctor;
import cn.ojbkfeng.bean.DoctorExample;
import cn.ojbkfeng.dao.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorMapper doctorMapper;


    /**
     * 获取医生信息
     */
    public List<Doctor> getDoctorInfo(String name, String email){
        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        criteria.andUserEmailEqualTo(email);
        return doctorMapper.selectByExample(example);
    }

    /**
     * 检查登录信息是否正确
     * @param uername
     * @param password
     * @return
     */
    public boolean checkUserAndPwd(String uername, String password) {


        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(uername);
        criteria.andPasswordEqualTo(password);
        long res = doctorMapper.countByExample(example);
        return res == 0;
    }
}
