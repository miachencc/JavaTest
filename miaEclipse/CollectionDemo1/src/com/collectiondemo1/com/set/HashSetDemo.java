package com.collectiondemo1.com.set;

import com.collectiondemo1.com.bean.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set集合 不允许重复元素 和collection的方法相同，Set集合取出方法只有一个，
* --TreeSet:二叉树结构，可以对元素进行排序，不同步的
*       排序方式：需要元素具备比较功能，所以元素需要实现comparable接口
*       覆盖CompareTo方法
*       如何保证元素的唯一性？
*       参考比较方法的返回值是否是0，为0则是重复元素，不存储
*
* --HashSet：不保证顺序  哈希（散列）表结构
*   如何保证唯一性
*   元素必须覆盖hashcode和equals方法
*   覆盖hashCode方法是为了根据自身元素的特点确定哈希值
*   覆盖equals方法是为了解决哈希值冲突
*
*   需求中也有这样一种情况，元素具备的比较功能不是所需要的，也就是说不想按照自然排序时的方法，而是按照自定义的
*   排序方式，对元素进行排序，而且存储到treeset的元素万一没有比较功能，高如何排序呢？
*   这是，就只能用第二种比较方式，是让集合具备比较功能，定义一个比较器
*
*   实现comparator接口 覆盖comparator方法，将comparator接口的对象，
*   作为参数传递给treeSet集合的构造函数
*   比较器更为灵活，自然排序通常作为元素的默认排序
*
*   技巧：
*   jdk1.2以后出现集合框架中的常用子类对象，存在的规律。
*   前缀名是数据结构名，后缀名是所属体系名
*   ArrayList  数组结构 看到数据 就知道查询快，看到list就知道可以重复，可增删改查
*   LinkedList  链表结构 增删快 xxxFirst xxxlast xxx add get remove
*   Hashset   哈希表 就要想到元素必须覆盖hashcode和equals 查询速度快，不保证有序，看到set 就知道不可以重复
*   LinkedHashset 链表+哈希  实现有序，因为有链表
*   TreeSet 二叉树 可排序 就想要2中方式，一种是自然排序Comparable，一种是比较器Comparator
*
*
* */
public class HashSetDemo {
    public static void main(String[] args){
     /*   //创建一个set容器对象
        Set set = new HashSet(); //如果改成LinkedHashSet可实现有序
        //添加元素
        set.add("haha");
        set.add("abc");
        set.add("aba");
        set.add("aba");
        set.add("heihie");
        //只能用迭代器取出
        for(Iterator it = set.iterator();it.hasNext();){
            System.out.println(it.next());
        }*/

    /*
    * 往hashset中存储学生对象（姓名年龄）同姓名同年龄视为用一个人
    * 1. 描述学生
    * 2.定义容器
    * 3.将学生对象存储到容器中
    * 发现存储了同姓名 同年龄的学生是可以的 原因每一次存储学生对象都先调用hashcode方法获取 哈希值
    * 但调用的是Object中的hasdcode所以不同的对象 哈希值也不同
    *
    * 解决：
    * 根据学生对象自身创建
    * 覆盖hashCode方法*/

    Set set1 = new HashSet();

    set1.add(new Student("zhangsan",20));
    set1.add(new Student("yushi",44));
    set1.add(new Student("yushi",44));
    set1.add(new Student("saizhang",34));
    set1.add(new Student("lisi",12));
    set1.add(new Student("lisi",12));

    for (Iterator it = set1.iterator();it.hasNext();){
        Student stu = (Student) it.next();
        System.out.println(stu.getName()+"::"+stu.getAge());
    }

    }
}
