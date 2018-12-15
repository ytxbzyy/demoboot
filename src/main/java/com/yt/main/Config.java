package com.yt.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by YT on 2018/11/23.
 */
@Configuration
public class Config {

    @Value(value = "${aaa}")
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
