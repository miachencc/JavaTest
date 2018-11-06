package com.thread.cn;
/*
* 银行一个金库
*
* 2个储户 分别存300元  每次存100元
*
* 改程序是否有安全问题，如何解决？
*
* 如何找问题：
* 1. 明确哪些代码时多线程运行代码 run add
* 2. 明确共享数据  b sum
* 3. 明确多线程运行代码中哪些语句是操作共享数据的
*
* 同步有两种表现形式，同步代码块 及 同步函数
* */
class bank{
    private  int sum;
    Object obj =new Object();
    public synchronized  void  add(int n){
      //  synchronized (obj) {
            sum = sum + n;
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread() + "sum =" + sum);
        //}
    }
}
class Cus implements Runnable{

    private bank b =new bank();
    @Override
    public void run() {
        for(int x=0;x<3;x++){
            b.add(100);
        }
    }
}
public class SynFunction {
    public static void main(String[] args){
        Cus c =new Cus();

        Thread t1 =new Thread(c);
        Thread t2 =new Thread(c);

        t1.start();
        t2.start();
    }

}
