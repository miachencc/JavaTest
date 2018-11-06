package com.singledemo.cn;

/*
先初始化对象  称为 饿汉式
Single2类一进内存就已经创建好了对象
    class Single2{
    private Single2(){}
    private static Single2 s = new Single2();
    public  static  Single2 getInstance(){
        return s;
    }
} 单例设计模式*/


/* 对象时方法被调用时，才初始化，也叫做对象的延时加载 称为懒汉式
* single2进内存 对象还没有存在 只有调用了getinstance方法时才建立对象*/
class Single2{
    private Single2(){}
    private  static  Single2 s=null;
    public static Single2 getSingle() {

        if(s==null)
            s= new Single2();
        return s;
    }
}
public class SingleDemo2 {


}
