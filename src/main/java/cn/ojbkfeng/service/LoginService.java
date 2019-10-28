package cn.ojbkfeng.service;


import cn.ojbkfeng.bean.DoctorExample;
import cn.ojbkfeng.bean.EmployeeExample;
import cn.ojbkfeng.dao.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class LoginService {

    @Autowired
    DoctorMapper doctor;

    /**
     * 检查医生是否已经登录
     * @param username
     * @param email
     * @return
     */
    public boolean checkOnline(String username, String email) {

        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andUserEmailEqualTo(email);
        long res = doctor.countByExample(example);
        return res == 0;
    }
}
