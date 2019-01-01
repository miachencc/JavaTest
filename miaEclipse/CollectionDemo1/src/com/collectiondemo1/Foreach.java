package com.collectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Foreach {
    public static void main(String[] args){
        /*用于遍历Collection数组或数组
        for（元素类型 变量；collection 容器or数组）
        * */
        Collection coll= new ArrayList();
        coll.add("abc");
        coll.add("bcd");
        coll.add("cde");

//        for(Iterator it=coll.iterator();it.hasNext(); ){
//            Object obj = it.next();
//            System.out.println(obj);
//        }
        for(Object obj:coll){
            System.out.println(obj);
        }
        //对于数组的遍历，如果不操作角标，可以使用增强fo循环，如果要操作角标，使用传统的for
        /*区别
        * 增强for必须有被遍历的目标该目标，只能是collection或数组
        * */
        int[] arr ={23,44,56,78};
        for (int x:arr){
            System.out.println("x="+x);
        }
    }
}
