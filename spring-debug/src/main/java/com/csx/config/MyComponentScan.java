package com.csx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.csx.selftag")
public class MyComponentScan {

    @ComponentScan("com.csx.selftag")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
