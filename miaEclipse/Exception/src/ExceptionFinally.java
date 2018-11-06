/*
* finally非常重要
* finally代码块： 定义一定执行得到代码，通常用于关闭资源
*
* */
class FuShuException1 extends java.lang.Exception {
    FuShuException1(String msg){
        super(msg);
    }
}
class Demofinally{
    int div(int a,int b) throws FuShuException1{
        if(b<0)
            throw new FuShuException1("除数为负数");
        return a/b;
    }
}
public class ExceptionFinally {
    public static void main(String[] args){
        Demofinally d = new Demofinally();

        try{
            int x =d.div(4,-9);
            System.out.println("X="+x);
        }
        catch(FuShuException1 e){
            System.out.println(e.toString());
            return;
        }
        finally {
            System.out.println("finally");//finally存放的是一定会被执行的代码
        }
        System.out.println("over");
    }
}
