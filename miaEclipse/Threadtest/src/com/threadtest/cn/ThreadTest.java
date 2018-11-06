package com.threadtest.cn;

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
public class ThreadTest {
    public static void main(String[] args){
        // System.out.println("hello world");
     /*  for(int a=0;a<2000;a++){
           System.out.println("hello world"+a);
       }*/

        ThreadDemo t1= new ThreadDemo("thread1-----");//创建好一个线程
        ThreadDemo t2= new ThreadDemo("thread2-----");
        t1.start();
        t2.start();


    }
}
