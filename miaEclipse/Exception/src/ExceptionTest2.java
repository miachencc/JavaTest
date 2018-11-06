import com.sun.corba.se.impl.interceptors.PICurrent;

/*
* 有一个圆形和长方形
* 都可以获取面积。对于面积  如果出现非法数值，视为获取面积时出现的问题。
* 问题通过异常来表示
* 先要对程序进行基本设计
*
* */
class NoValueException extends RuntimeException{
    NoValueException(String msg){
        super(msg);
    }
}
interface Shape{
    void getArea();
}
class Circle implements Shape{
    private int radius;
    public static final double PI = 3.14;
    Circle(int radius){
        if(radius<=0)
            throw new NoValueException("程序出现非法值2");
        this.radius=radius;
    }

    @Override
    public void getArea() {

        System.out.println(radius*radius* PI);
    }
}
class Rec implements Shape {
    private int len,wid;
    Rec(int len,int wid){//throws NoValueException
        if(len<=0||wid<=0)
            throw new NoValueException("程序出现非法值");
        this.len=len;
        this.wid=wid;
    }

    @Override
    public void getArea() {
        System.out.println(len*wid);
    }
}
public class ExceptionTest2 {
    public static void main(String[] args){


            Rec r = new Rec(3, 4);
            r.getArea();

        /*catch(NoValueException e){
            System.out.println(e.toString());
        }*/
        Circle c= new Circle(-5);
        c.getArea();
        System.out.println("over");

    }

}
