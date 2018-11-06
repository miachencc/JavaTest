package com.integerdemo;
/*
* JDK1.5之后出现新特性
* */
public class IntegerDemo2 {
    public static  void sop(Object obj){
        System.out.println(obj);
    }
    public static void method(){
        Integer x = new Integer("123");
        Integer y = new Integer(123);

        sop("x==y:"+(x==y));//false 不同的对象
        sop("x/equals(y):"+x.equals(y));// true---Integer重写了Object类中的equals，表示比较数值是否相等
    }
    public static void main(String[] args){
       Integer x =4;//自动装箱  new Integer（4）
        x = x/*x.intValue()*/ +2;//x=2:x 进行了自动拆箱，变成了int类型，和2进行加法运算，再将和装箱赋值给x

        Integer m =128;
        Integer n =128;
        sop("m=n:"+(m==n));//false

        Integer a =127;
        Integer b =127;
        sop("a=b:"+(a==b));//true 因为a和b指向了同一个Integer对象，
                                // 因为当数值在byte无法范围内时，对于新特性，如果该数值已经存在，则不会再开辟新的空间

    }
}
