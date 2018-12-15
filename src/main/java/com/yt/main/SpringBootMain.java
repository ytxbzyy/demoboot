package com.yt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by YT on 2018/11/23.
 */
@SpringBootApplication
public class SpringBootMain {

    public static void main(String[] args) {
       ApplicationContext applicationContext = SpringApplication.run(SpringBootMain.class);
       String[] dd = applicationContext.getBeanDefinitionNames();
       for(String aa:dd){
           System.out.println(aa);
       }
    }
}
