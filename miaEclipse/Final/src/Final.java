/*
* final 最终  作为一个修饰符
* 1. 可以修饰类 函数 变量
* 2. 被final修饰类不可以被继承， 为了避免被继承，被子类复写功能
* 3. 被final修饰的方法不可以被复写
* 4. 被final修饰的变量是一个常量， 只能赋值一次，既可以修饰成员变量也可以修饰局部变量
*       在描述事物时一些事物的出现值是固定的，那么这时为了增强阅读性，都给这些值起个名字，而这个值不需要改变，所以加上final修饰
*       作为常量书写规范所有字母都大写，如果由多个单词组成，单词间通过下划线连接
* 5. 内部类定义在类中的局部位置上时 只能访问局部被final修饰的局部变量*/

class demo{
    final int x= 3;
    final double MY_PI =3.14;
    void show(){

    }
    void show1(){

        final  int y=4;
    }
}
class subDemo extends demo{
    void show(){}
}
public class Final {
}
