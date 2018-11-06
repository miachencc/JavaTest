package com.staticcode.cn;
//常见面试题  主要考察 这三者的执行顺序，静态代码块，代码块，构造函数
class StaticCode2{
    int num =9;
    String name;
    StaticCode2(){
        System.out.println("c");
    }
    static{
        System.out.println("a");   //静态代码块给类初始化，静态代码块无法访问非静态变量"a"+ this.num)，
    }
    {
        System.out.println("b"+ this.num); //构造代码块给对象初始化
    }
    StaticCode2(int x){
        System.out.println("d"); //构造函数给给对应对象初始化
    }
    public static void show(){
        System.out.println("show run");
    }

    public void setName(String name) {
        this.name =name;
    }
}
public class StaticCodeTest {

    public static void main(String[] args){
        //new StaticCode2();// a,b,d
        StaticCode2.show();
        StaticCode2 s= new StaticCode2();
        s.setName("zhangsan");
    }

}

/*
*person p =new person("zhangsan",20)
* 这句话做了什么事情，
* 1. 因为new 用到了person.class，所以会先找到person.class文件并加载到内存中
* 2. 执行该类中的static代码块，如果有的话，给person.class类进行初始化
* 3. 在堆内存中开辟空间。并分配内存地址
* 4.在堆内存中建立对象的特有属性，并进行默认初始化
* 5. 对属性进行显示初始化
* 6. 对对象进行构造代码块初始化
* 7. 对对象进行对应的构造函数初始化
* 8. 将内存地址付给占内存中的p变量
* */

// 同一个类中 方法可以相互调用，非静态是省略的this.  静态是省略的 类名.
