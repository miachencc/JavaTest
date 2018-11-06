/*
* 接口： 可以认为是一个特殊的抽象类
* 当抽象中的方法时抽象的，那么该类可以通过接口的方式表示
*
* class 用于定义类
* interface用于定义接口
*
* 接口定义时，格式特点：
* 1. 接口中常见定义，常量 抽象方法
* 2. 常量public static final
*    方法：public abstract
*记住 接口中的成员都是public
*
* 接口是不可以创建对象的，因为有抽象方法
* 需要被子类实现，子类对接口中的抽象方法全部覆盖后，子类才可以实例化
* 否则子类是一个抽象类
*
* 接口可以被类多实现，也是对多继承不支持转换形式，java支持多实现
* */

interface Inter{
    public static final int NUM=3;
    public abstract void show();
}
interface Inter1{

    public abstract void method();
}
class Demo{
    public  void function(){}
}

class Test extends Demo implements Inter,Inter1{
    @Override
    public void show() {
        System.out.println("show run");
    }

    @Override
    public void method() {

    }
}

interface A{
    void methodA();
}

interface B{
    void methodB();
}

interface C extends B,A{
    void methodC();
}

class D implements C{
    public void methodA(){}
    public void methodB(){}
    public void methodC(){}
}
public class Interface {
    public static void main(String[] args){
        Test test =new Test();
        System.out.println(test.NUM);
        System.out.println(Inter.NUM);
        System.out.println(Test.NUM);
        test.show();
        System.out.println("hello world");
    }
}
