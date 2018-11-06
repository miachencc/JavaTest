package com.thread.cn;
/*
* 线程都有自己默认的名称
*
* 原来线程都有自己的默认名称
* Thread-编号  该编号从0开始
*
* static currentThread()：获取当前线程对象
* getName():获取线程名称
*
* 设置线程名称： setName或者构造函数
*
* 线程状态图，5中状态
* 1. 被创建
* 2. start运行
* 3. 冻结 sleep或者wait(notify破解wait) 放弃了执行权
* 4.消亡 stop使run方法结束
* 5. 临时状态（阻塞） 具备执行资格但是没有执行权
* */
class ThreadDemo1 extends java.lang.Thread {
    //private String name;

    ThreadDemo1(String name){
        //this.name =name;
        super(name);
    }
    public void run(){
        for(int x=0;x<100;x++){
            System.out.println((java.lang.Thread.currentThread()==this)+"---"+this.getName()+x);
        }
        //System.out.println("demo run");
    }

}
public class ThreadTest1 {
    public static void main(String[] args){
        // System.out.println("hello world");
        for(int a=0;a<100;a++){
            System.out.println("hello world"+a);
        }

        ThreadDemo1 t1= new ThreadDemo1("thread1--");//创建好一个线程
        ThreadDemo1 t2= new ThreadDemo1("thread2--");
        t1.start();
        t2.start();


    }
}
