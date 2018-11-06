package com.threadcom;
/*
* 线程间通讯：
* 其实就是多个线程在操作同一个资源
* 但是操作的动作不同
*
*
*是不是2个及以上线程
* 是不是同一个锁 obj不可以 this不可以 寻找共同对象
*
*等待唤醒机制：

 *
* 怎样让先输入在输出，不然容易出现输出null或者同一个输出
*
* 为什么这些操作线程的方法定义在object类中？
* 因为这些方法在操作同步中线程时，都必须要标识他们所操作线程只有的锁
* 只有同一个锁上的被等待线程，可以被同一个锁上notify唤醒
*不可以对不同的锁中线程进行唤醒
*
* 也就是说 等待和唤醒必须是同一个锁
*
* 而锁可以是是任意对象，所以可以被任意对象调用的方法定义Object类中；
* 任意对象能调用的方法wait notify notifyall 定义在object类中
*
*
* wait notify notifyall都使用在同步中，因为要对持有监视器（锁）的线程操作
* 所以要使用在同步中，因为只有同步才具有锁的概念。

*---------------------------------代码优化---------------
* 资源中的变量私有化。对外提供访问方法即可
* */
class Resource{

    private String name;
    private String sex;
    private boolean flag =false;

    public synchronized void set(String name,String sex){
        if(this.flag)
        {
            try{this.wait();}catch(Exception e){}
        }
        this.sex= sex;
        this.name =name;
        flag = true;
        this.notify();

    }
    public synchronized void out(){
        if(!this.flag)
        {
            try{this.wait();}catch(Exception e){}
        }
            System.out.println(name+"........."+sex);
            flag = false;
            this.notify();

    }
    }

class Input implements  Runnable{
    private Resource r;
    Input(Resource r){
        this.r=r;
    }
    Object obj =new Object();
    @Override
    public void run() {

        int x =0;
        while (true) {

                if (x == 0)
                    r.set("Mike","man");
                else
                    r.set("丽丽","女");
                x = (x + 1) % 2;


        }
    }
}
class Output implements  Runnable{

    private Resource r;
    Output(Resource r){
        this.r=r;
    }
    @Override
    public void run() {
        while(true){
                r.out();
        }
    }
}

public class ThreadCom {
    public static void main(String[] args){


        Resource r = new Resource();

        Input in= new Input(r);
        Output out=new Output(r);

        Thread t1=new Thread(in);
        Thread t2= new Thread(out);

        t1.start();
        t2.start();
    }
}
