package com.DuoTai.cn;
/*
* 多态： 可以理解为事物体现的多种形态
* 人：男人 女人
* 动物： 猫 狗
* 猫 x =new 猫();
* 动物 x = new 猫();
* 1/ 多态的体现
*   父类的引用指向了自己的子类对象
*   父类的引用也可以接收自己的子对象
*
* 2. 多态的前提
*   必须是类与类之间有关系，要么继承 要么实现
*   通常还有一个前提，存在覆盖
*
* 3. 多态的好处
*   多态的出现大大提高了程序的扩展性
*
* 4. 多态的弊端：
* 提高了扩展性，但是只能使用父类的引用访问父类中的成员
*
* 5. 多态的应用
*
* 6. 多态的出现代码中的特点（多态使用的注意事项）*/

/*
* 动物： 猫 狗*/

import jdk.nashorn.internal.ir.CatchNode;

abstract class Animal{
    abstract void eat();
}

class cat extends Animal{
    @Override
    void eat() {
        System.out.println("eat fish");
    }
    public void catchMouse(){
        System.out.println("catch mouse");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("eat bone");
    }
    public void KanJia(){
        System.out.println("kan jia");
    }
}
public class DuoTai {
    public static void main(String[] args){
        /*cat c= new cat();
        c.eat();
        c.catchMouse();
        cat c1 = new cat();
        function(c1);//提高代码的复用性
        function(new Dog());*/
        //Animal c = new cat();
        function(new cat());
        function(new Dog());
        System.out.println("Hello World");
    }

    public static void function(Animal a){
        a.eat();
    }
    /*public static void function(cat c )
    {
        c.eat();
    }

    public static void function(Dog d )
    {
        d.eat();
    }*/
}

//-------------------------------------------
class DuoTaiDemo1{
    public static void main(String[] args){
      Animal a = new cat();//类型提升 向上转型
         /* a.eat();

        //如果想要调用猫的特有方法时 如何操作？
        //强制将父类的引用转成子类类型
        cat c = (cat)a;
        c.catchMouse();
        //千万不要出现这种操作，就是讲父类对象转成子类类型
        //我们能转换的是父类应用指向了自己的子类对象时，该应用可以被提升，也可以被强制转换
        //多态自始至终都是子类对象在做变化*/
       function(new Dog());
    }
    public static  void function(Animal a){
        a.eat();

        if (a instanceof cat)
        {
            cat c=(cat)a;
            c.catchMouse();
        }
        else if (a instanceof Dog)
        {
            Dog d =(Dog)a;
            d.KanJia();
        }

    }

}