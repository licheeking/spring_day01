package com.intergraph.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testUser() {
        //1加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2得到配置创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }
}
