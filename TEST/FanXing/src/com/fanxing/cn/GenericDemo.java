package com.fanxing.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {
    public  static void main(String[] args){
        //创建一个list集合，存储整数 List接口 和ArrayList类
//        List<String> li = new ArrayList<String>();
//        li.add("abc");
//        li.add("bcd");
//        li.add("cde");

        List<Integer> li = new ArrayList<Integer>();//集合中类型只能是类
        li.add(4);
        li.add(5);
        li.add(6);//自动装箱

        for (Iterator<Integer> it= li.iterator();it.hasNext();){
            Integer integer = it.next();
            System.out.println(integer);
        }
    }
}
