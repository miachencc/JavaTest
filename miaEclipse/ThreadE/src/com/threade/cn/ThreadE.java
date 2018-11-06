package com.threade.cn;

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
public class ThreadE {
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

