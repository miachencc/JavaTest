
/*
* 因为项目中 会出现特有的问题
* 儿这些问题并未被java所描述并封装对象
* 所以对于这些特有的问题可以按照java的对问题封装的思想
* 将特有的问题，进行自定义的异常封装
*
* 自定义异常
*
* 需求; 在本程序总，对于除数是-1，也是为错误的是无法进行运算的
* 那么就需要对这个问题进行自定义描述
*
* 当在函数内部出现了throw抛出异常对象，就必须给出对应的处理动作
* 要么在内部try catch处理
* 要么在函数上声明让调用者处理
*
* 一般情况在函数内出现异常，函数上需要声明
*
* 发现打印的结果总只有异常的名称，却没有异常信息
* 因为自定义异常并未定义信息
*
* 如何定义异常信息呢？
* 因为父类中已经把异常信息的操作都完成了
* 所以子类在构造式时，将异常信息传递给父类  通过super语句就可以直接getMessage方法获取自定义的异常信息
*
*自定义异常
* 必须是自定义类继承exception
*
* 为什么继承exception
* 异常体系有一个特点，异常类和异常对象都会抛出，他们都具备可抛性。
* 这个可抛性是throwable体系中的独有特点，只有这个体系中的类和对象才可以被throws和throw操作。
*
*throws使用在函数上，后面跟异常类，可以多个，用逗号隔开
* throw用过在函数内，后面跟异常对象
* */

class FuShuException extends java.lang.Exception {
    //private String msg;
    FuShuException(String msg){
        super(msg);
    }
    //public String getMessage(){
      //  return msg;
   // }

    FuShuException(){
        super();
    }
    private int value;
    FuShuException(String msg,int value){
        super(msg);
        this.value=value;
    }
    public int  getValue(){
        return value;
    }
}

class Demo1{

    int div(int a,int b)throws FuShuException{
        if(b<0)
            throw new FuShuException("出现了除数是负数的情况--- /by fushu");//手动通过throw抛出异常对象
        return a/b;
    }
}
public class ExceptionDemo {
    public static void main(String[] args){
        Demo1 d1= new Demo1();
        try{
            int x = d1.div(4,-8);
            System.out.println("x="+x);
        }
        catch(FuShuException e){
            System.out.println(e.toString());
            System.out.println("除数出现负数了");

        }
    }

}
