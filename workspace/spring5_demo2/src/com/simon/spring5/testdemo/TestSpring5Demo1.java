package com.simon.spring5.testdemo;

import com.simon.spring5.collectiontype.Book;
import com.simon.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

    @Test
    public void testCollection(){
        // 1.加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        // 2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        book.test();

    }

}
