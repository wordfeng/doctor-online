package cn.ojbkfeng.test;

import cn.ojbkfeng.bean.Drugs;
import cn.ojbkfeng.bean.Employee;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * 使用spring测试模块提供的请求功能
 * 测试curd的正确性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //有了这个注解可以直接装配web的ioc
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
//file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml
public class MvcTest {

    //传入spring mvc 的ioc
    @Autowired //单独使用  只能装配ioc里面的内容  不能装配ioc
            WebApplicationContext context;
    //虚拟mvc请求，获取到处理结果
    MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testSearch() throws Exception{
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/search")
                .param("name","碳酸氢钠"))
                .andReturn();
        MockHttpServletRequest request = result.getRequest();
        Object medicine = request.getAttribute("medicine");
        System.out.println(medicine);


    }
    @Test
    public void testPage() throws Exception {
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/emps")
                .param("pageNum", "1"))
                .andReturn();
//        请求成功后请求域中会有pageinfo  可以取出pageinfo进行验证
        MockHttpServletRequest request = result.getRequest();
        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码：" + pageInfo.getPageNum());
        System.out.println("总页码：" + pageInfo.getPages());
        System.out.println("总记录数：" + pageInfo.getTotal());
        System.out.println("在页面需要连续显示的页码");
        int[] nums = pageInfo.getNavigatepageNums();
        for (int num : nums) {
            System.out.println(" " + num);
        }
        //获取员工数据
        List<Employee> list = pageInfo.getList();
        for (Employee employee : list) {
            System.out.println("ID: " + employee.getEmpId() + "==》" + employee.getEmpName());
        }
    }
}
