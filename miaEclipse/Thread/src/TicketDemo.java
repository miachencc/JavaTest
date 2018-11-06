/*
* 需求：卖票的程序
* 多个窗口同时买票
*IleagalthreadstatusException 无效的线程状态异常（已在运行的程序无需再次开启）
*
* 创建线程的第二种方法，实现Runnable接口
* 1. 定义类实现Runnable接口
* 2. 覆盖Runna接口中的run方法
*       将线程要运行的代码存放在run方法中
* 3. 通过Thread类建立线程对象
* 4. 将Runnable接口的子类对象，作为传递参数传递给Thread类的构造函数
*       为甚妖精Runnbale接口的子类对象传递给Thread的构造函数
*       因为，自定义的run方法所属的对象时Runn接口的子类对象
*       所以 要让线程去执行指定对象的run方法，就必须明确该run方法所属的对象
* 5. 调用Thread类的start方法开启线程并调用runnbale接口子类的run方法
*
* 实现方式和继承方式的区别：
*
* 继承
*（当类中有一些代码时多线程执行，并且有自己父类的时候，无法通用过继承解决）
*继承Thread类线程代码存放在 Thread子类run方法中
*
* 实现：
* 好处：避免了单继承的局限性，
* 在定义线程时，建议使用实现方式
* 线程代码存在在接口子类run方法中
* */
class Ticket implements Runnable{//extends Thread{

    private int tick =10000;//资源可以共享
    public void run(){
        while(true){
            if(tick>0){
                System.out.println(Thread.currentThread().getName()+"--sale:"+tick--);
            }
        }
    }
}
public class TicketDemo {
    public static void main(String[] args){

        Ticket t =new Ticket();

        Thread t1 = new Thread(t);//对象和线程联系起来，创建线程对象时明确运行那些代码 thread中有一个构造方法特殊能接受runnable类型的对象。thread（runnable target）
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
     /*   Ticket t1 = new Ticket();
       // Ticket t2 = new Ticket();
        //Ticket t3 = new Ticket();
       // Ticket t4 = new Ticket();

        t1.start();
        t1.start();
        t1.start();
        t1.start();*/
    }
}
