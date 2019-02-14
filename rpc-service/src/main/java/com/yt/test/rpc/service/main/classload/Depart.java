package com.yt.test.rpc.service.main.classload;

/**
 * Created by YT on 2019/1/2.
 */
public class Depart {

    private String departName;
    private String no;

    private User user;

    {
        System.out.println("depart。。。。static222。。。。。");
    }
    static {
        System.out.println("depart。。。。static。。。。。");
    }
    public Depart(){
        System.out.println("Depart...........");
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
