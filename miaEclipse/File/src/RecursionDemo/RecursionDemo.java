package RecursionDemo;

public class RecursionDemo {
    /*
    * 递归：函数自身调用自身，函数内部又使用到了该函数的功能
    * 什么时候使用？
    * 功能被重复利用，但是每次该功能使用参与运算的数据不同时，可以考虑递归方式解决
    *
    * 使用时注意，
    * 1. 一定要定义条件
    * 2. 注意递归次数过多会出现栈内存溢出 Exception in thread "main" java.lang.StackOverflowError
    *
    * */
    public static void main(String[] args){
        int sum= getSum(60000);
        System.out.println("sum=:"+sum);
    }
    public static int getSum(int num){
        if (num==1){
            return 1;
        }
        else{
            return num + getSum(num-1);//不断进栈，先进后出
        }

    }
    /*public static void method(){
        show();*/

}
