package com.thread.cn;
/*
* 多线程的运行出现了安全问题
* 问题的原因： 当多条语句在操作听一个线程共享数据时，一个线程对多条语句执行了一部分 还没有执行完
*             其他线程参与进来，导致了共享数据的错误
* 解决办法：
* 对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中， 其他线程不可以参与执行
*
* Java对于多线程的安全问题 提供专业的解决方式
*
* 就是同步代码块
*
* synchronized(对象){
* 需要被同步的代码块
* }
* 哪些代码需要同步（哪些代码在操作共享数据）
*
* 对象如同锁，持有锁的线程可以在同步中执行
* 没有持有锁的线程即使获取CPU的执行权，也进不去，因为没有获取锁
*
* 同步的前提：
* 1. 必须要有2个或者2个以上的线程
* 2. 必须是多个线程使用同一个锁
*
 * 必须保证同步中有一个线程在运行
*
* 好处： 解决了多线程的安全问题
*
* 弊端：多个线程判断锁，较为消耗资源
* */
class Ticket1 implements Runnable{//extends Thread{

    Object obj=new Object();
    private int tick =10000;//资源可以共享

    public void run(){
        while(true) {

            synchronized (obj) {
                if (tick > 0) {
                    try {
                        Thread.sleep(100000);
                    } catch (Exception e) {

                    }
                    System.out.println(java.lang.Thread.currentThread().getName() + "--sale:" + tick--);
                }
            }
        }
    }
}
public class ThreadSecurity {
    public static void main(String[] args){

        Ticket1 t =new Ticket1();

        Thread t1 = new Thread(t);//对象和线程联系起来，创建线程对象时明确运行那些代码 thread中有一个构造方法特殊能接受runnable类型的对象。thread（runnable target）
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}