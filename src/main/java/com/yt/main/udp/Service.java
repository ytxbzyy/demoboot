package com.yt.main.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by YT on 2019/1/11.
 */
public class Service {

    public static void main(String[] args)throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(8989);
        System.out.println(datagramSocket.getLocalPort());
        System.out.println(datagramSocket);
        byte[] bytesa = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytesa,bytesa.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),"utf-8"));
        String str = "返回数据";
        byte[] bytes = str.getBytes("utf-8");
        System.out.println(datagramPacket.getAddress().getHostName());
        System.out.println(datagramPacket.getPort());
        DatagramPacket rep = new DatagramPacket(bytes,bytes.length,datagramPacket.getAddress(), datagramPacket.getPort());
        datagramSocket.send(rep);
    }
}
