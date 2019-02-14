package com.yt.main.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by YT on 2019/1/9.
 */
public class Test {

    public static void main(String[] args)throws Exception {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.newConnection("127.0.0.1");
        Channel channel = connection.createChannel();
        channel.queueDeclare("test服务端",false,false,false,null);
        //定义消息
        String message = "测试消息";
        // 发送消息
        channel.basicPublish("", "test服务端", null,message.getBytes("utf-8"));
        Thread.sleep(10000);
        // 断开连接
        channel.close();
        connection.close();

    }
}
