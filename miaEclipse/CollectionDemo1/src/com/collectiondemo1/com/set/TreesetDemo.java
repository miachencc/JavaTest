package com.collectiondemo1.com.set;

import com.collectiondemo1.com.bean.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args){
        Set set2 = new TreeSet();
//        set.add("bcd");
//        set.add("abc");
//        set.add("abc");
//        set.add("cde");
//        set.add("def");
        set2.add(new Student("zhangsan",20)); //因为学生要排序就需要比较  而没有定义比较方法
        //比较方法，add方法中使用的是comparable接口的比较方法
        set2.add(new Student("yushi",44));
      //  set2.add(new Student("yushi",44));
        set2.add(new Student("saizhang",34));
    //    set2.add(new Student("lisi",12));
     //   set2.add(new Student("lisi",12));
        for (Iterator it1= set2.iterator();((Iterator) it1).hasNext();){
            Student stu1 = (Student)it1.next();
            System.out.println(stu1.getAge()+""+stu1.getName());
        }

    }
}
