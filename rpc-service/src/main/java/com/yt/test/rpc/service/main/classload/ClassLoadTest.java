package com.yt.test.rpc.service.main.classload;


import sun.misc.URLClassPath;

/**
 * Created by YT on 2019/1/2.
 */
public class ClassLoadTest {

    public static void main(String[] args) throws Exception{
//        URLClassPath urlClassPath = new URLClassPath();
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clazz = classLoader.loadClass("com.yt.test.rpc.service.main.classload.Depart");
        System.out.println(clazz.getSimpleName());

      /* Class clazz1 =  Class.forName("com.yt.test.rpc.service.main.classload.Depart");
        System.out.println(clazz1.getSimpleName());*/
      /*  Object o = clazz1.newInstance();
        System.out.println(o.toString());*/

    }
}
