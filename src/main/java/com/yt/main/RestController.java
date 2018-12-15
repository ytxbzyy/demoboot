package com.yt.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YT on 2018/11/23.
 */
@Controller(value = "abc")
public class RestController {

    @RequestMapping("/getUser")
    public String ddd(){
        System.out.println("============");
        RestController.class.getDeclaredAnnotations();
        return "阿斯顿发生地方";
    }
}
