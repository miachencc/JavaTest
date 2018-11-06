
/*object: 所有类的父类，该类找那个定义的肯定是所有对象都具备的功能
*
*object中提供了对对象是否相同的比较方法，如果自定义类中也有比较相同功能，没有必要重新定义
* 只要沿袭父类中的功能没建立自己特有内容即可*/

public class ObjectDemo {
    public static void main(String[] args){


        Demo d1= new Demo(4);
        Demo d2= new Demo(6);

        Person p=new Person();

        System.out.println(d1.equals(p));//类型转换异常， p无法转换成demo
    }
}
class Person{

}
class Demo{//extends object
    private int num;
    Demo(int num){
        this.num=num;
    }

    public boolean  equals(Object obj){

        String a="系统异常";

        if((obj instanceof Demo))
            return false;
        Demo d=(Demo)obj;//
        return this.num==d.num;
    }
}