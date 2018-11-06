package com.collectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 1. add方法的参数类型是Object，以便于接收任意类型对象
* 2. 集合中存储的都是对象的引用（地址）
* 3. 什么是迭代器？
*       其实就是集合取出元素的方式
* */
public class CollectionDemo1 {
    public static  void sop(Object obj){
        System.out.println(obj);
    }
    public static void method_get(){

        ArrayList al= new ArrayList();
        al.add("java01");//add(Object obj)
        al.add("java02");
        al.add("java03");
        al.add("java04");

        Iterator it= al.iterator();//获取迭代器，用于去除集合中的元素
        while(it.hasNext())
            sop(it.next());

    }
    public static void method_base(){
        //创建一个集合的容器，使用Collection接口的子类，ArrayList
        ArrayList al= new ArrayList();

        //添加元素
        al.add("java01");//add(Object obj)
        al.add("java02");
        al.add("java03");
        al.add("java04");
        //4. 删除元素
        al.remove("java03");
        //清空集合
        //al.clear();

        //5. 判断元素 java03 是否存在
        sop("java03是否存在："+al.contains("java03"));
        sop("集合是否为空："+al.isEmpty());


        //2. 获取个数，集合长度
        sop("size="+al.size());

        //3. 打印集合
        sop(al);
    }
    public static void method_2(){

        ArrayList al= new ArrayList();


        al.add("java01");//add(Object obj)
        al.add("java02");
        al.add("java03");
        al.add("java04");

        ArrayList al2 = new ArrayList();
        al2.add("java05");//add(Object obj)
        al2.add("java02");
        al2.add("java06");
        al2.add("java04");

        al.retainAll(al2);//取交集，al中只会保留和al2中相同的元素
        sop("al:"+al);
        sop("al2:"+al2);
    }
    public static  void main(String[] args){

            method_get();

    }
}
