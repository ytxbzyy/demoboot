package com.yt.main.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by YT on 2019/1/11.
 */
public class Client {

    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        System.out.println(datagramSocket.getLocalPort());
        String str = "发送数据";
        byte[] bytesa = str.getBytes("utf-8");
        DatagramPacket datagramPacket = new DatagramPacket(bytesa,bytesa.length,InetAddress.getByName("localhost"),8989);
        datagramSocket.send(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),"utf-8"));
        byte[] bytes = str.getBytes("utf-8");
        DatagramPacket rep = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(rep);
        System.out.println(new String(rep.getData(),"utf-8"));
    }
}
