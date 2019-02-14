package com.yt.test.rpc.service.main;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by YT on 2018/12/28.
 */
public class ThreadTestMain {

    /**
     * corePoolSize: 线程池核心线程数量
                     如果池中线程数量少于核心线程池数量，则直接新建线程处理当前任务。
                     核心线程池空闲不会被回收。
                     当池中无空闲线程时，新任务将被添加到阻塞队列
     maximumPoolSize：线程池最大线程数量
                     当阻塞队列已满，并且有新任务还在入队时，创建新的线程处理，直到线程数大于maximumPoolSize。
                     超出corePoolSize部分的线程超过空闲时间后会被回收
                     当线程已经超出corePoolSize，并且队列容量已满，则拒绝入队。
     keepAliveTime unit：线程存活时间
                         当线程超出corePoolSize时生效
                         线程空余keepAliveTime后，将被回收
     workQueue：线程使用阻塞队列
     threadFactory：创建线程池工厂
                    用于控制创建线程或者销毁线程时加入其它逻辑
     handler：线程池拒绝策略
             直接丢弃（DiscardPolicy）
             丢弃队列中最老的任务(DiscardOldestPolicy)。
             抛异常(AbortPolicy)
             将任务分给调用线程来执行(CallerRunsPolicy)
     */
    /**
     * //TimeUnit.DAYS 日的工具类
     //TimeUnit.HOURS 时的工具类
     //TimeUnit.MINUTES 分的工具类
     //TimeUnit.SECONDS 秒的工具类
     //TimeUnit.MILLISECONDS 毫秒的工具类
     */
    /**
     * ThreadPoolExecutor(int corePoolSize,
     int maximumPoolSize,
     long keepAliveTime,
     TimeUnit unit,
     BlockingQueue<Runnable> workQueue,
     ThreadFactory threadFactory,
     RejectedExecutionHandler handler)
     */
    static ThreadPoolExecutor executorService = new ThreadPoolExecutor(1,1,1,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(8),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

//    static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws Exception{
        /*executorService.execute(new Runnable() {
            public void run() {
                System.out.println("bbbbbbbbbbb");
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("==");
            }
        });*/
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(4);
        arrayBlockingQueue.add("aaaa");
        arrayBlockingQueue.add("aaaabbb");
        arrayBlockingQueue.add("aaaaccc");
        arrayBlockingQueue.add("aaaaddd");
        String a = arrayBlockingQueue.poll().toString();
        System.out.println(a);
        a = arrayBlockingQueue.poll().toString();
        System.out.println(a);
        a = arrayBlockingQueue.poll().toString();
        System.out.println(a);
        a = arrayBlockingQueue.poll().toString();
        System.out.println(a);
        new Runnable(){

            public void run() {
                try {
                    Thread.sleep(3000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                arrayBlockingQueue.add("take");
                try {
                    String b = arrayBlockingQueue.take().toString();
                    System.out.println(b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.run();
        a = arrayBlockingQueue.take().toString();
        System.out.println(a);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111");


       /* ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(new ArrayList(2));
        concurrentLinkedQueue.add("aaa");
        concurrentLinkedQueue.add("aaabb");
        concurrentLinkedQueue.add("aaacc");
        concurrentLinkedQueue.add("aaadd");
        String a = concurrentLinkedQueue.poll().toString();
        System.out.println(a.toString());
        a = concurrentLinkedQueue.poll().toString();
        System.out.println(a.toString());
        a = concurrentLinkedQueue.poll().toString();
        System.out.println(a.toString());
        a = concurrentLinkedQueue.poll().toString();
        System.out.println(a.toString());
        a = concurrentLinkedQueue.poll().toString();
        System.out.println(a.toString());*/
        System.out.println("==============");
    }

    static class Test extends Thread{

        @Override
        public void run() {
            for (int i = 0 ; i < 100 ; i ++) {
                try {
                    Thread.sleep(100) ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }
}
