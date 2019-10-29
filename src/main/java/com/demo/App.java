package com.demo;

import com.demo.bean.MyBean;
import com.demo.bean.MyBeanInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext app;
    public static void main(String[] arg) {
//        app = new ClassPathXmlApplicationContext("bean.xml");
////        MyBeanInterface bean = (MyBeanInterface) app.getBean("mybean1");
        app = new AnnotationConfigApplicationContext(AutoMyBeanConfig.class);
        MyBeanInterface bean = app.getBean(MyBeanInterface.class);
        System.out.println(bean);
    }
}
