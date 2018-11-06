/*
* 异常：就是程序在运行时出现不正常情况
* 异常由来：问题也是现实生活中具体的事物，也可以你通过java类的形式描述，并封装成对象
*           其实就是java对不正常情况进行描述后的对象体现
*
*对于问题的划分：两种，一种是严重的问题，一种是非严重的问题
*
* 对于严重的 java通过error类进行描述
* 对于error一般不编写针对性的代码对其进行处理
*
* 对于非严重的问题，java通过Exception来进行描述
*
* error和exception中的共性内容
* 比如： 不正常情况的信息 引发原因
*
* Throwable
* --Error
* --exception
*
*
* 2. 异常的处理
* java提供了特有的语句进行处理
* try{
* 需要被检测的代码
*
* }
* catch(异常类 变量){
* 处理异常的代码（处理方式）
* }
* finally{
* 一定会执行的语句
*
* }
*
* 3, 对捕获到的异常对象获取异常信息*/
class Demo{
    int div(int a, int b){
        return a/b;
    }
}
class Throwable{

}
public class Exception {
    public static void main(String[] args){
        Demo d = new Demo();
        try{
            int x= d.div(4,0);
            System.out.println("x="+x);
        }
        catch(java.lang.Exception e){//exception e = new arithmeticexception()
            System.out.println("除零啦");
            System.out.println(e.getMessage());//异常信息
           System.out.println(e.toString());//异常名称  异常信息
            e.printStackTrace();//异常名称 异常信息 异常出现的位置
            //其实jvm默认的异常处理机制，就是在调用printStackTrace方法，打印异常的堆栈跟踪信息
        }

        System.out.println("over");
    }

}

