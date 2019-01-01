package com.collectiondemo1.com.linklist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        /*
        * 通过实现一个堆栈，或者队列数据结构
        * 堆栈 先进后出  FirstInLastOut FILO
        * 队列 先进先出 FistInFistOut FIFO
        * */
        //创建自定义队列对象
        MyQueue queue = new MyQueue();
        //添加元素
        queue.myAdd("abc1");
        queue.myAdd("abc2");
        queue.myAdd("abc3");
        queue.myAdd("abc4");
        //获取所有元素
        while (!queue.isNull()){
            System.out.println(queue.myGet());
        }
    }
}
/*
* 描述一个队列数据结构 内部使用LinkedList
* */
class MyQueue{
    private LinkedList link1;
    MyQueue(){
        link1 = new LinkedList();
    }
    /*添加元素的方法*/
    public void myAdd(Object obj){
        link1.addFirst(obj);
    }
    /*获取队列元素方法*/
    public Object myGet(){
        return link1.removeLast();
    }
    public boolean isNull(){
        return link1.isEmpty();
    }
}
