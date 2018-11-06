package com.thread.cn;


class Test implements Runnable{
    private boolean flag;
    Test(boolean flag){
        this.flag= flag;

    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.locka){

                System.out.println("if locka");
                synchronized (MyLock.lockb){
                    System.out.println("if lockb");
                }
            }
        }
        else {
            synchronized (MyLock.lockb){
                System.out.println("else lockb");
                synchronized (MyLock.locka){
                    System.out.println("else locka");
                }
            }
        }
    }
}

class MyLock{
    static Object locka = new Object();
    static Object lockb = new Object();
}
public class DeadLockDemo2 {
    public static void main(String[] args){
           //Test t =new Test(true);

           Thread t1 =new Thread(new Test(true));
           Thread t2 =new Thread(new Test(false));

    }
}
