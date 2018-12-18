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
    public String test2(){
        return "bbbbbbbbbb";
    }
}
