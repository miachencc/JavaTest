package com.thread.cn;
/*
* 死锁： 同步中嵌套同步
* */
class Ticket3 implements Runnable{

    Object obj=new Object();
    private  int ticket =1000;
    boolean flag = true;
    public void run(){

        if(flag) {
            while (true) {
                synchronized (obj){

                    show();// 同步代码块中有同步函数 this锁
                }

            }
        }
        else
            while(true)
                show();
    }
    public  synchronized  void show(){

        synchronized (obj) { //同步函数中有同步代码块 obj锁
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                System.out.println(java.lang.Thread.currentThread().getName() + "--code:" + ticket--);
            }
        }
    }

}
public class DeadLockDemo {
    public static void main(String[] args){

        Ticket3 t =new Ticket3();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t.flag=false;
        t2.start();


    }
}