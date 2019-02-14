package com.test;

import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

import java.io.File;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

/**
 * Created by YT on 2019/1/24.
 */
public class Test {

    public static void main(String[] args) throws Exception{

        System.err.println("start================");
        ExecutionEnvironment env = ExecutionEnvironment.createRemoteEnvironment("localhost",8081,"E:\\spring\\boot\\out\\artifacts\\flinkdemo_jar\\flinkdemo.jar");
        System.out.println(env.getIdString());
        env.execute("11111111111111");
        /*//File file = new File("C:\\Users\\TYZ030\\Desktop\\181218121241.sql");
        final DataSource<String> dataSource = env.readTextFile("C:\\Users\\TYZ030\\Desktop\\新建文件夹 (2)\\aaa.txt");
        System.setOut(new PrintStream(new File("C:\\Users\\TYZ030\\Desktop\\医保编码\\text.txt")));
        List<String> stringList = dataSource.collect();
        stringList.forEach(s ->{
            System.err.println(s);
        });
        JobExecutionResult result = env.execute("text");
        System.err.println("end================");*/
    }
}
