package com.yt.main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by YT on 2018/11/23.
 */
@RestController
public class TestController {


    @Resource
    private Config config;

    @GetMapping(path = "dddd")
    public String testConfig(){
        return config.getTest();
    }

    @GetMapping(path = "test")
    public Object test2(){
        System.out.println("bbbbbbbbbb");
        for(int i =0;i<1000;i++){
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("BB==="+i);
        }
        return new Object();
    }
}
