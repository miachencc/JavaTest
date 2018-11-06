package com.threadcom;
/*
* join
* 当A线程执行到了B电测还能够的join方法，A就会等待，等B线程都执行完，A才会执行
*
* join可以用来临时加入线程执行
* */
class Demo implements Runnable{
    @Override
    public void run() {
        for(int x=0;x<70;x++){
            System.out.println(Thread.currentThread().toString()+"...."+x);
            Thread.yield();
        }
    }
}
public class ThreadJoin {
    public static void  main(String[] args) throws  Exception{
        Demo d = new Demo();
        Thread t1 =new Thread(d);
        Thread t2 = new Thread(d);

        t1.start();
       // t1.setPriority(Thread.MAX_PRIORITY);

        t2.start();

        for(int x =0;x<80000;x++){
           // System.out.println(Thread.currentThread().toString()+"...."+x);
        }
        System.out.println("over");
    }
}
