/*
* 异常：
* 是什么？是对问题的描述，将问题进行对象的封装
*-------------------
* 异常体系：
* throwable
*   -error
*   -exception
*       -runtimeexcwption
* 异常体系特点：异常体系中的所有类以及建立的对象都具备可抛性
*               也就是说可以被throw和throws所操作
*               只有异常体系具备这个特点
* ------------------------------------------------
* throw和throws的特点
* throw定义在函数内，用于抛出异常对象
* throws定义在函数上，用于抛出异常类，可以用多个逗号隔开
*
* 当函数内有throw抛出异常对象，并未进行try处理，必须要在函数上声明，否则编译失败
* 注意 RuntimeException除外，也就是函数内如果抛出的是RuntimeException异常，函数上可以不用声明
*
* 如果函数声明了异常，调用者需要进行处理。处理方法可以throws可以try
*
* 异常有两种：
*   编译时被检测异常：该异常在编译时，如果没有处理（没有trows没有try）那么编译失败
*                   该异常被标识代表可以被处理
*   运行时异常（编译时不检测）： 在编译时不需要处理，编译器不检查
*                             该异常发生，建议不处理，让程序停止，需要对代码进行修正
*------------------------------
* 异常处理的语句：
* try{
*   需要被检测的代码
* }
* catch(){
* 处理异常的代码
* }
* finally{
* 一定会执行的代码
* }
* 有三种结合方式：
* 1. try catch
* 2. try finally
* 3. try catch finally
*
*
* finally中通常定义的是 关闭资源代码，因为资源必须释放
* finally只有一种情况不会执行，当执行到system.exit(0)系统退出;
*---------------------------
* 自定义异常：
*   定义类机场Exception或者RuntimeException
* 1. 为了让该类具备可抛性
* 2. 让该类具备操作异常的共性方法
*
* 当要定义自定义异常的信息时，可以使用父类已经定义好的功能，将异常信息传递给父类的构造函数
* class MyException extends Exception{
*   MyException(String mag)
*   {
*       super(msg);
*   }
* }

* 自定义异常的好处：
* 自定义异常时按照java的面向对象思想，将程序中出现的特有问题进行封装
*
* *-----------------------
* 异常的好处：
* 1. 将问题进行封装
* 2. 将正常流程代码和问题处理到吗想分离，方便于阅读
*
*
* 异常的处理原则：
* 1. 处理方式有2中try或者throws
* 2. 如果调用到抛出异常的功能时，抛出几个，就处理几个。
*       一个try对应多个catch
* 3. 多个catch，父类的catch放到最下面
* 4. catch内需要定义针对性的处理方式，不要简单的定义printStackTrace，输出语句，也不要不写。
*    当捕获的异常，本功能处理不了时，可以继续在catch中抛出
*    try{
*       throw new AException;
*    }
*    catch（AException e）{
*       throw e;
*    }
*    如果该异常处理不了，但并不属于该功能出现的异常
*    可以将异常转换之后，在抛出和该功能相关的异常
*
*    或者异常可以处理  但是需要将异常产生后和本功能相关的问题提供出去
*    让调用者知道并处理，也可以将捕获异常处理后，转换新的异常
*    try{
*       throw new AException;
*    }
*    catch(AException e){
*       //对AException处理
*       throw new BException();
*    }
*
*    比如汇款的例子。
* -------------------
* 异常的注意事项：
*   在子类覆盖时：
*   1. 子类抛出的异常必须是父类异常的子类或者子集
*   2. 如果父类或者接口没没有异常抛出时，子类覆盖出现异常，只能try不能抛*
*
*   参阅：
*   ExceptionTest.java 老师用电脑上课
*   ExceptionTest1.java图形面积*/

public class ExceptionSummary {
    public static void main(String[] args){

    }
}
