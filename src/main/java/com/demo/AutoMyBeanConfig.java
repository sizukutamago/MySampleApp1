package com.demo;

import com.demo.bean.MyBean;
import com.demo.bean.MyBeanInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoMyBeanConfig {
    @Bean
    public MyBeanInterface myBean() {
        return new MyBean("Auto Config");
    }
}
