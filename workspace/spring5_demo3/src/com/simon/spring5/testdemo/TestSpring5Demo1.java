package com.simon.spring5.testdemo;


import com.simon.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

    @Test
    public void testService(){
        // 1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);

        userService.add();




    }


}
