package com.thread.cn;

/*
* 进程：是一个正在执行中的程序
*       每一个进程执行都有一个执行顺序，该顺序是一个执行路径，或者叫一个控制单元
*
* 线程：就是进程中的一个独立的控制单元
*       线程在控制着进程执行
*
* 一个进程中至少有一个线程
*
* java VM启动时会有一个进程 java.exe
*
* 该进程至少一个线程负责java程序的执行
* 而且这个线程运行的代码存在于main方法中
* 该线程称为主线程
*
* 扩展其实更细节的说明jvm,jvm不只一个线程，还有一个负责垃圾回收机制的线程
*-----------------------------------------------
* 如何在自定义的代码中自定义一个线程？
*
* 通过对API的查找，java已经提供了对线程这类事物的描述，就Thread类
* 创建线程的第一种方式：继承Thread类
* 1. 定义类继承Thread
* 2. 复写Thread类中run方法，目的：将自定义的代码存储在run方法中，让线程运行
* 3. 调用现成的start方法
*       该方法有2个作用，启动线程，调用run、方法
*
* 发现运行结果每次都不同
* 因为多个线程都在获取CPU的执行权，CPU执行到谁，谁执行
* 明确一点；在某一时刻，只能有一个程序在运行（多核除外）
* cpu在做着快速的切换，已达到看上去是同时运行的效果
*
* 我们可以形象的把多线程的运行，在互相抢夺CPU的执行权
* 这就是多线程的特性： 随机性
*
* 为什么要覆盖run方法？？
*
*Thread用于描述线程的
* 该类就定义一个功能，用于存储要运行大代码，该存储功能就是run方法
* 也就是说 Thread类中的run方法，用于用于存储多线程运行的代码
* */

class ThreadDemo extends java.lang.Thread {
    private String name;
    ThreadDemo(String name){
        this.name =name;
    }
    public void run(){
        for(int x=0;x<100;x++){
            System.out.println("demo run"+name+x);
        }
        //System.out.println("demo run");
    }
}
public class Thread1 {
   public static void main(String[] args){
      // System.out.println("hello world");
       for(int a=0;a<100;a++){
           System.out.println("hello world"+a);
       }

       ThreadDemo t1= new ThreadDemo("thread1-----");//创建好一个线程
       ThreadDemo t2= new ThreadDemo("thread2-----");
       t1.start();
       t2.start();


   }

    public void start() {
    }
}
