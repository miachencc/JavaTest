package com.ExtendDemo.cn;

/*
* 将共性特征提取出来，进行单独的描述
* 只要让学生和工人与单独描述的这个类有关系，就可以了
*
* 继承：
* 1. 提高了代码的复用性
* 2. 让类与类之间产生了关系，有了这个关系，才有了多态的特性
*
* 千万不要为了获取其他类的功能，简化代码儿继承
* 必须是类与类之间有所属关系才可以继承，所属关系is a
*
* java只支持单继承，不支持多继承
* 因为多继承容易带来安全隐患
*例子： 当多个父类中定义了相同功能，但功能类型不同时子类对象不确定运行哪一个
*
* 但是java保留了这中机制，并用另一种体现形式来完成展示，多实现
*
* java支持多层继承
*
* class A{
*   void show(){
*       System.out.println("a")
*   }
* }
*
* class B{
 *   void show(){
 *       System.out.println("b")
 *   }
 * }
 *
 * class C extends A,B{
 *   C c = new c();
 *   c.show();
 * }
 *
 * 想要使用体系，先查阅体系父类的描述，因为父类中定义的是该体系的共性功能
 * 通过了解共性功能就可以知道该体系的基本功能
 *那么这个体系已经基本使用了
 * 那么在具体调用时，更要创建最子类的对象，为什么呢
 * 一是因为有可能父类不能创建对象
 * 二是创建子类对象可以使用更多的功能，包括基本的也包括特有的
 *
 * 简单一句话 查阅父类功能 创建子类对象使用功能
 *
 *
 * 聚集关系; has a
 * 分为
 * 聚合：
 * 组合：
 * */
class Person{
    String name;
    int age;
}

class Student extends Person{

    void  study(){
        System.out.println("good study");
    }
}

class Worker extends Person{

    void  work(){
        System.out.println("good work");
    }
}
public class ExtendDemo {

}
