package com.thread.cn;
/*
* 同步函数用的是哪一个锁呢：
* 函数需要被对象调用，那么函数都有一个所属对象引用，就是this
* 所以同步函数使用的锁是this
*
* 通过改程序进行验证：
* 使用2个线程来买票
* 一个函数在同步代码块中
* 一个函数在同步函数中
* --------------------------
* 如果同步函数被静态修饰后，
*
* 静态函数的
*
* Ticket2进内存，生成字节码文件对象。
*
* 静态进内存时，内存没有本类对象，但是一定有该类对应的字节码文件对象
* 类名.class 该对象的类型是calss
*
* 静态的同步方法，使用的锁是该方法所在类的字节码文件对象， 类名.class
* */

class Ticket2 implements Runnable{//extends Thread{

    Object obj=new Object();
    private static int ticket =100;//资源可以共享
    boolean flag = true;
    public void run(){

        if(flag) {
            while (true) {

                synchronized (Ticket2.class) {
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
        else
            while(true)
                show();
        }
    public static synchronized  void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            System.out.println(java.lang.Thread.currentThread().getName() + "--show:" + ticket--);
        }
    }

}
public class ThisLockDemo {
    public static void main(String[] args){

        Ticket2 t =new Ticket2();

        Thread t1 = new Thread(t);//对象和线程联系起来，创建线程对象时明确运行那些代码 thread中有一个构造方法特殊能接受runnable类型的对象。thread（runnable target）
        Thread t2 = new Thread(t);
       // Thread t3 = new Thread(t);
        //Thread t4 = new Thread(t);

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t.flag=false;
        t2.start();
      //  t3.start();
        //t4.start();

    }
}