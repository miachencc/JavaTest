package com.collectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List list = new ArrayList();
        methodDemo(list);
    }

    public static void methodDemo(List list){

        //1 常规添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

        //2. 插入元素
        list.add(1,"hehe");

        //3.删除
        list.remove(1);

        //4. 获取
        System.out.println(list.get(2));
        System.out.println(list.indexOf("abc2"));

        //5.修改
        list.set(1,"kk");

        //取出集合中所有元素
        for (Iterator it =list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        //list集合特有的取出方式
        for(int i =0;i <list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
