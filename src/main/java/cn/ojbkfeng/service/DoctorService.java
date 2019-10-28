package cn.ojbkfeng.service;


import cn.ojbkfeng.bean.DoctorExample;
import cn.ojbkfeng.dao.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorMapper doctorMapper;



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
