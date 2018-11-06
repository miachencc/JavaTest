package com.stringdemo;
/*s1和s2的区别
s1在内存中有一个对象
s2在内存中有2个对象


*/
public class StringDemo {
    public static void main(String[] args){
        String s1 = "abc";//s1是一个类类型变量，“abc"是一个对象， 字符串最大的特点：一旦初始化就不可以被改变

        //s1 = "kk";

        String s2 = new String("abc");
        System.out.println(s1);//这种情况不是abc变化了  而是s1对象的地址变化了
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); //比较的内存地址值. 复写了object类中的eauqals方法，该方法用来判断字符串是否相同

    }

}
