package com.yt.test.rpc.service.main;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by YT on 2018/12/28.
 */
public class SocketMain {


    public static void main(String[] args) throws Exception{
        Map<String, Object> handlerMap = new ConcurrentHashMap<String,Object>();
        handlerMap.put("aaa",new Object());
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        ServerSocket serverSocket = new ServerSocket(8080,2,inetAddress);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("连接成功" + socket.getRemoteSocketAddress());
            // 获取input
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            try {
                // 获取引用
                String interfaceName = input.readUTF();
                //获取 方法名
                String methodName = input.readUTF();
                Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
                Object[] arguments = (Object[]) input.readObject();
                try {
                    Object service = handlerMap.get(interfaceName);
                    Method method = service.getClass().getMethod(methodName,parameterTypes);
                    Object result = method.invoke(service, arguments);
                    output.writeObject(result);
                } catch (Throwable t) {
                    output.writeObject(t);
                } finally {
                    input.close();
                }
            } finally {
                socket.close();
            }

        }
    }
}
