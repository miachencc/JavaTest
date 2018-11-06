package com.ExtendDemo.cn;
/*子父类出现后类中成员的变化
* 类中成员：
* 1. 变量
* 如果子类中出现非私有的同名成员变量时，子类要访问本类中的变量，用this
* 子类要访问父类中的同名变量，用super
* super和this使用几乎一致
* this代表本类对象的引用
* super代表父类对象的引用
* 2. 函数
* 3. 构造函数*/
//变量例子
/*class Fu{
    int num = 4;

}
class Zi extends Fu{
    int num = 5;
    void show(){
        System.out.println(super.num);
    }
}
public class ExtendsDemo2 {
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
        //System.out.println(z.num+"..."+z.num); 打印的全是5
    }
}*/

/*
* 子父类中的函数
* 当子类出现和父类一样的函数时
* 当子类调用该函数，会运行子类函数的内容
* 如同父类函数被覆盖一样
*
* 这种情况是函数的另一个特性，重写（覆盖）
*
*当子类继承父类，沿袭了父类的功能，到子类找那个
* 但是子类虽具有该功能，但是功能的内容却和父类不一致
* 这时，没有必要定义新功能，而是使用覆盖特性，保留父类的功能定义，并重写功能内容
*
*覆盖：
* 1. 子类覆盖父类，必须保证子类权限大于父类权限才可以覆盖，否则编译失败。 public 默认 private
* 2. 静态只能覆盖静态
*
* 重载
* 只看同名函数的参数列表
* 重写
* 子父类方法一模一样，包括返回值类型*/
class Fu{
    void show(){
    System.out.println("fu show");
    }
    void speak(){
        System.out.println("vb");
    }
}

class Zi extends Fu{

    void show(){
        System.out.println("zi show");
    }


    void speak() {
        System.out.println("");
    }

}
public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.speak();
    }
}