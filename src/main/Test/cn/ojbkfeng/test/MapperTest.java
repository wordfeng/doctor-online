package cn.ojbkfeng.test;

import cn.ojbkfeng.bean.Department;
import cn.ojbkfeng.dao.DepartmentMapper;
import cn.ojbkfeng.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试dao层工作
 * 使用spring-test 5.x
 *
 * @ContextConfiguration指定spring配置文件的位置
 */

@RunWith(SpringJUnit4ClassRunner.class)
//"classpath:WEB-INF/dispatcherServlet-servlet.xml",
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})//,  "classpath:mybatis-config.xml"
public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;
//    @Autowired
//    EmployeeMapper employeeMapper;
//    @Autowired
//    SqlSession sqlSession;

    /**
     * DepartmentMapper
     */
    @Test
    public void TestCurd() {
        //创建spring ioc容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //从容器中获取mapper
//        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
        System.out.println(departmentMapper);
//        departmentMapper.insertSelective(new Department(1, "开发部"));
        departmentMapper.insertSelective(new Department(null, "器材部"));
//        employeeMapper.insertSelective(new Employee(null, "老王", "女", "yf0nuttiness@qq.com", 2));
//        批量插入多个员工
/*        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 100; i++) {
            String uid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(null, uid, "女", uid + "@qq.com", 2));
        }
        System.out.println("批量插入完成");*/


    }
}
