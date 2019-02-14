package com.yt.test.rpc.service.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by YT on 2018/12/29.
 */
public class ClientMain {
    public static void main(String[] args) throws Throwable{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("F:\\hxjb\\1月加班\\aa.txt"));
        outputStream.writeUTF("aaaaaa");
        outputStream.writeUTF("bbbbbbbbb");
        outputStream.writeObject(new String("ddddddddddddddddd"));
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("F:\\hxjb\\1月加班\\aa.txt"));
        System.out.println(inputStream.readUTF());
        System.out.println(inputStream.readUTF());
        System.out.println(inputStream.readObject());
/*
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),8080);
        try {
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            try {
                output.writeUTF("aaa");
                output.writeUTF("toString()");
                output.writeObject(new String());
                output.writeObject(new String());
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                try {
                    Object result = input.readObject();
                    if (result instanceof Throwable) {
                        throw (Throwable) result;
                    }
                    System.out.println(result);
                } finally {
                    input.close();
                }
            } finally {
                output.close();
            }
        } finally {
            socket.close();
        }*/
    }
}
