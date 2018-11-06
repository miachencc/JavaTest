package com.threadcom;

public class ProducterCustomer {
    public static void main(String[] args){
        Res r = new Res();

        producer p =new producer(r);
        customer c= new customer(r);

        Thread t1= new Thread(p);
        Thread t2= new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Res{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name){
        while(flag)
            try{
                this.wait();
            }
            catch(Exception e){

            }
        this.name = name+count++;
        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
        flag =  true;
        this.notifyAll();
    }
    public synchronized void out(){
        while(!flag)
            try{
                this.wait();
            }
            catch(Exception e){

            }
        System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
        flag =  false;
        this.notifyAll();
    }
}
class producer implements Runnable{
    private Res r;
    producer(Res r){
        this.r=r;
    }
    @Override
    public void run() {
        while(true){
            r.set("商品");
        }
    }
}
class customer implements Runnable{
    private Res r;
    customer(Res r){
        this.r=r;
    }
    @Override
    public void run() {
        while(true){
            r.out();
        }
    }
}