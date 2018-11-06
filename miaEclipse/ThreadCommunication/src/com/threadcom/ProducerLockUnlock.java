package com.threadcom;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
JDK1.5中提供了多线程升级解决方案
* 将同步sychronized替换成现实Lock操作
* 将Object中的wait notify  notifyall替换成了condition对象，该对象可以通过Lok获取
*
* 该示例中，实现了本方只唤醒对方操作
* */
public class ProducerLockUnlock {
    public static void main(String[] args){
        Res1 r = new Res1();

        producer1 p =new producer1(r);
        customer1 c= new customer1(r);

        Thread t1= new Thread(p);
        Thread t2= new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Res1{
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition con_pro = lock.newCondition();
    private Condition con_cus = lock.newCondition();

    public  void set(String name)throws InterruptedException{
        lock.lock();
        try{
            while(flag)
                con_pro.await();
            this.name = name+count++;
            System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
            flag =  true;
            con_cus.signal();
        }

        finally{
            lock.unlock();//释放锁的操作一定要执行
        }


    }
    public  void out() throws InterruptedException{
        lock.lock();

            try{
                while(!flag)
                    con_cus.await();
                System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
                flag =  false;
                con_pro.signal();
            }
            finally {
                lock.unlock();
            }



    }
}
class producer1 implements Runnable{
    private Res1 r;
    producer1(Res1 r){
        this.r=r;
    }
    @Override
    public void run() {
        while(true){
            try{
                r.set("商品");
            }
            catch(Exception e){

            }

        }
    }
}
class customer1 implements Runnable{
    private Res1 r;
    customer1(Res1 r){
        this.r=r;
    }
    @Override
    public void run() {
        while(true){
            try{
                r.out();
            }
            catch(Exception e){

            }

        }
    }
}