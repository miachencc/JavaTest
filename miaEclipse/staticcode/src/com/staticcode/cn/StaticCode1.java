package com.staticcode.cn;

public class StaticCode1 {
    static{
        System.out.println("b");
    }
    public static void main(String[] args){
        //StaticCodeDemo1.show();// 1. 类名调用静态方法，不需要建立对象
        StaticCodeDemo1 s =null;//2. 2.1 建立类类型变量，没有占用内存这时候不会调用这个类，静态代码块也不会执行
        s = new StaticCodeDemo1(); //2.2 建立对象时，用到了类中的空构造函数，所以会调用 a  但是不执行 show
        StaticCodeDemo1.show();// 2.3 此时执行a,show
        System.out.println("over");
    }

    static{
        System.out.println("c");
    }

}

class StaticCodeDemo1{
    StaticCodeDemo1(){}
    static{
        System.out.println("a");
    }
    public static void show(){
        System.out.println("show run");
    }

}
