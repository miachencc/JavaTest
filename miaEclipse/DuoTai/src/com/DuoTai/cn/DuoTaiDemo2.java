package com.DuoTai.cn;

class Fu{
    int NUM =5;
    void method1(){
        System.out.println("Fu method1");
    }
    void method2(){
        System.out.println("Fu method2");
    }
    static void method4(){
        System.out.println("Fu method4");
    }
}

class Zi extends Fu{
    int NUM = 8;//面试
    void method1(){
        System.out.println("Zi method1");
    }
    void method3(){
        System.out.println("Zi method3");
    }
    static void method4(){
        System.out.println("Zi method4");
    }
}
/*
* 多态中成员函数的特点：
* 在编译时期，参阅引用型变量所属类中是否有调用的方法，如果有，编译通过，如果没有编译失败
* 在运行时期，参阅对象所属的类中是否有调用的方法
* 简答总结是就是: 成员函数在多态中调用时，编译看左边，运行看右边
* ========================面试环节==============
*在多态中，成员变量的特点：
* 无论编译和运行，都参考左边（引用型变量所属的类）
*
* 在多态中 静态成员函数的特点
* 无论编译和运行 都
* 无论编译和运行 都
* */
public class DuoTaiDemo2 {
    public static void main(String[] args){

        Zi z= new Zi();
        z.method1();
        z.method2();
        z.method3();

        Fu f =new Zi();
        f.method1();  //Zi method1
        f.method2();//fu methods
        //f.method3(); 编译不过去，编译的时候对象还没建立。引用类型中没有method3方法

        ((Zi) f).method3();
        f.method4();// fu method4
        System.out.println(f.NUM);//5
    }
}
