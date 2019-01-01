package com.collectiondemo1.com.linklist;
import java.util.LinkedList;

public class LinkedListDemmo {
    public static void main(String[] args){
        //创建一个链表对象
        LinkedList link= new LinkedList();

        //添加元素
        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");

        //获取元素
        System.out.println(link.getFirst());
        //删除元素
        System.out.println(link.removeFirst());
        //取出link中元素
        while(!link.isEmpty()){
            System.out.println(link.removeFirst());
        }
    }
}
