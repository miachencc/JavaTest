package com.collectiondemo1;

import com.collectiondemo1.com.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 往ArrayList中存储自定义对象Person（name，age）
* 思路：
* 1. 描述Person
* 2.定义容器对象
* 3. 将多个Person对象 存储到集合中
* 4. 取出Person对象
* */
public class ArrayListDemo {
    public static void main(String[] args){

        //创建ArrayList集合
        ArrayList al = new ArrayList();

        //定义对象
        Person person = new Person("lisi",19) ;
        Person person1 = new Person("lisi2",29) ;
        //
        al.add(person);
        al.add(person1);
        al.add(new Person("zhangsan",34));
        al.add(new Person("zhangsan",77));
        al.add(new Person("zhangwu",34));
        al.add(new Person("lisi",19));

        //取出元素，2种迭代器 1种角标
        for (Iterator it = al.iterator();it.hasNext();){
            //it.next()取出的元素都是Object类型的
            Person p =(Person)it.next();
            System.out.println(p);
        }
        System.out.println("===============================");
        singleElement4(al);

        for (Iterator it = al.iterator();it.hasNext();){
            //it.next()取出的元素都是Object类型的
            Person p =(Person)it.next();
            System.out.println(p);
        }
    }
    /*思路：
  1. 最后唯一性的元素也很多，可以先定义一个人的容器用于存储这些唯一性元素
  2. 对原有容器进行元素获取，并到临时容器中去判断是否存在，容器本身基友这个功能判断是否存在
  3. 存在就不存储，不存在就存储
  4. 遍历完原容器后 临时容器中存储的就是唯一性元素
  */
    public static void singleElement4(List list){
        //创建
        List temp = new ArrayList();
        //遍历原容器
        for (Iterator it = list.iterator();it.hasNext();){
            Person p =(Person) it.next();
            //判断是否存在
            if (!temp.contains(p)){
                //不存在添加
                temp.add(p);
            }
        }      //清空原容器
        list.clear();
        //将临时容器元素存储到原容器中
        list.addAll(temp);
    }
}
