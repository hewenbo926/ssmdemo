package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {

    @Test
    public void findByUserAndPasswordTest() throws IOException {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = applicationContext.getBean(UserMapper.class);
        User user = mapper.findUser("haohao", "haohao");
        System.out.println(user);
    }

    @Test
    public void test(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    @Test
    public void test1(){
        int i = 0 ;
        i+=10;
        System.out.println(i);
    }

}
