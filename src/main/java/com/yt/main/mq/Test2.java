package com.yt.main.mq;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by YT on 2019/1/9.
 */
public class Test2 {
    public static void main(String[] args)throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        Connection conection = factory.newConnection("127.0.0.1");
        Channel channel = conection.createChannel();
        channel.queueDeclare("test服务端",false,false,false,null);
        //创建消费者，在回调函数中处理结果
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println("从队列接受到：" + message);
            }
        };
        channel.basicConsume("test服务端", consumer);

    }
}
