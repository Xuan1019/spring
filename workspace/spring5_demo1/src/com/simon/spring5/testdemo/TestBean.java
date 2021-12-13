package com.simon.spring5.testdemo;

import com.simon.spring5.Book;
import com.simon.spring5.bean.Dept;
import com.simon.spring5.bean.Emp;
import com.simon.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testbean1() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();


    }

    @Test
    public void testbean2() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
        emp.add();
    }

}




