package com.singledemo.cn;
/*
*设计模式: 解决某一类问题最行之有效的方法
* java中23中设计模式
* 单例设计模式：解决一个类在内存只存在一个对象
*
* 想要保证对象唯一
*1.  为了避免其他程序过多建立该类对象，先控制禁止其他程序建立该类对象
*2. 还为了让其他程序访问该对象，在本类中自定义一个对象
*3. 为了方便其他程勋对自定义对象的访问，可以对外提供一些访问方式
*
* 三步用代码体现
* 1. 将构造函数私有化
* 2. 在类中创建一个本类对象
* 3. 提供一个方法可以获取到该对象
*
* 对于事物该怎么描述，还怎么描述
* 当需要将该事物的对象
* */

class Single{
    private Single(){}

    private static Single s = new Single();

    public static Single getInstance(){
        return s;
    }
    public void show(){
        System.out.println("show run");
    }
    public static void display(){
        System.out.println("display run");
    }}
public class SingleDemo {

    public static void main(String[] args){
        Single ss = Single.getInstance();
        Single.getInstance().show();// 用来调用非静态方法
        ss.show();// 用来调用非静态方法
        Single.display();
        System.out.println("hello world");
    }

}


/*class student{

    private int age;

    private student(){};
    private static student s = new student();
    public static student getStudent(){
        return  s;
    }

    public  void  setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}*/