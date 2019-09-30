package cn.ojbkfeng.service;


import cn.ojbkfeng.bean.Employee;
import cn.ojbkfeng.bean.EmployeeExample;
import cn.ojbkfeng.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.log4j.Logger;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 查询所有员工信息
     */
    public List<Employee> getAllEmps() {
        return employeeMapper.selectByExampleWithDept(null);
    }

    /**
     * 增加员工信息
     */
    public void addNewEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    /**
     * 检查email可用
     */
    public boolean checkEmail(String email) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        long result = employeeMapper.countByExample(example);
        return result == 0;
    }

    public Employee getEmpInfo(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    public void updateEmployee(Employee employee) {
        int i = employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public void deleteEmp(Integer id) {

        employeeMapper.deleteByPrimaryKey(id);
    }
}
