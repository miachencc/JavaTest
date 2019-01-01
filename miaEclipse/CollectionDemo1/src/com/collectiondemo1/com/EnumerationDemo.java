package com.collectiondemo1.com;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] agrs){
        /*
        * Enumerration取出元素的一种方式，枚举
        * 具备枚举取出方式的容器只有vector
        */

        Vector v = new Vector();
        v.add("abc");
        v.add("bcd");
        v.add("cde");
//        Enumeration en = v.elements();
//        while(en.hasMoreElements()){
//            System.out.println("Enumeration: "+en.nextElement());
//        }
        //获取枚举
        for(Enumeration en=v.elements();en.hasMoreElements();){
            System.out.println("Enumeration: "+en.nextElement());
        }

        //获取迭代
        for(Iterator iterator=v.iterator();iterator.hasNext();){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        for(Object obj:v){
            System.out.println(obj);
        }
    }
}
