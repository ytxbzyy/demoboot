package com.yt.main.thread;

/**
 * Created by YT on 2019/1/11.
 */
public class Test {

    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("========1:"+Thread.currentThread().getName());
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("========2:"+Thread.currentThread().getName());
                    }
                });
                thread1.start();
            }
        });
        thread.start();
    }
}
