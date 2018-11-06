
/*object: 所有类的父类，该类找那个定义的肯定是所有对象都具备的功能
 *
 *object中提供了对对象是否相同的比较方法，如果自定义类中也有比较相同功能，没有必要重新定义
 * 只要沿袭父类中的功能没建立自己特有内容即可*/
class Person{

}
class Demo{//extends object
    private int num;
    Demo(int num){
        this.num=num;
    }

    /*public boolean  equals(Object obj){

        String a="系统异常";

        if((obj instanceof Demo))
            return false;
        Demo d=(Demo)obj;//
        return this.num==d.num;
    }*/
    public String toString(){
        return "demo :"+num;
    }
}

public class ToString {
    public static void main(String[] args){


        Demo d1= new Demo(4);
        System.out.println(d1.toString());
       /* Class c = d1.getClass();
        System.out.println(c.getName() + "@"+Integer.toHexString(d1.hashCode()));
        System.out.println(d1.toString());*/
    }

}
