package com.collectiondemo1.com.set;

import com.collectiondemo1.com.bean.Student;
import com.collectiondemo1.com.com.comparator.ComparatorByname;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetdDemo2 {
    public static void main(String[] args){
        //初始化Treeset集合时明确一个比较器
        Set set3 = new TreeSet(new ComparatorByname());

        set3.add(new Student("yushi",44));
        set3.add(new Student("yushi",44));
        set3.add(new Student("saizhang",34));
        set3.add(new Student("lisi",12));
        set3.add(new Student("cisi",12));

        for(Iterator it3 = set3.iterator();((Iterator)it3).hasNext();){
            Student stu3 = (Student)it3.next();
            System.out.println(stu3.getAge()+"---"+stu3.getName());

        }
    }
}
