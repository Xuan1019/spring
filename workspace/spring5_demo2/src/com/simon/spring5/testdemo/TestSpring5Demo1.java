package com.simon.spring5.testdemo;

import com.simon.spring5.collectiontype.Book;
import com.simon.spring5.collectiontype.Course;
import com.simon.spring5.collectiontype.Stu;
import com.simon.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

    @Test
    public void test2(){
        // 1.加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        // 2.获取配置创建的对象
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//IOC 操作Bean管理(bean作用域)。
//1、在 Spring里面,设置创建bean实例是单实例还是多实例
//默认是单实例duixiang
        System.out.println(book1);
        System.out.println(book2);

    }
    @Test
    public void testC3(){
        // 1.加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        // 2.获取配置创建的对象
        Course course = context.getBean("myBean", Course.class);

        System.out.println(course);

    }

}
