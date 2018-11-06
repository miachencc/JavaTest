/*
* runtimeException
* Exception中有一个特殊的子类异常，运行时异常。
* 如果在函数内容抛出该异常，函数上可以不用声明，编译一样通过
* 如果在函数上声明了该异常，调用者可以不用进行处理(try或者throws)，编译一样通过
*
* 之所以不用再函数上声明  是不需要让调用者处理
* 当该异常发生，希望程序停止，因为在运行时，出现了无法继续运算的情况
*
* 自定义异常
* 如果该异常的发生，无法再继续进行运算
* 就让自定义一行继承runtimeException
*
* 对于异常分两种：
* 1. 编译时被检测的异常
* 2. 编译时不被检测的异常，（运行时异常，RuntimeException以及其子类）
* */

class Demo2{

    int div(int a,int b){//throws ArithmeticException
        if(b==0)
            throw new ArithmeticException("被0除了");
        return a/b;
    }
}
public class ExceptionDemo2 {
    public static void main(String[] args) {
        Demo2 d1= new Demo2();

            int x = d1.div(4,0);
            System.out.println("x="+x);
            System.out.println("over");

        }
    }

