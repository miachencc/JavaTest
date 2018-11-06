package com.thread.cn;

/*
* 单例设计模式：
*
* 饿汉式
* class Single{
* private static Single s = new Singe();
* private Single(){};
* public static Single getInstance(){
*   return s;
* }
*
* }
*
* 懒汉式在多线程访问时，会产生安全问题
* 特点是延迟加载，在多线程会出现问题
* 加同步低效，解决办法，双重判断解决
* 加同步时 的锁是哪一个？ 该类的字节码文件对象
* calss Single{
*   private static Single s =null; //s是共享数据
*   private Single(){};
*

*   public  static Single getInstacne(){
*
*       if(s==null){
*       synchronized(Single.calss)
*       {
*           if(s==null)
*           {
*               s = new Single();
*           return s;
*           }
*       }
*   }
*   }
*
* }
*
* */

public class ThreadDanLi {
}
