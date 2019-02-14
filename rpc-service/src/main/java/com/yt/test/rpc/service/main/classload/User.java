package com.yt.test.rpc.service.main.classload;

/**
 * Created by YT on 2019/1/2.
 */
public class User {

    private String name;
    private String age;

    {
        System.out.println("user。。。。static2222。。。。。");
    }

    static {
        System.out.println("user。。。。static。。。。。");
    }
    public User(){
        System.out.println("初始化.........");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
