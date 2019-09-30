package cn.ojbkfeng.service;

import cn.ojbkfeng.bean.Department;
import cn.ojbkfeng.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门查询
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 返回所有部门信息
     * @return
     */
    public List<Department> getAllEmps(){
        return departmentMapper.selectByExample(null);
    }
}
