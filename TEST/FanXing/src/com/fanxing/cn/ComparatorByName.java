package com.fanxing.cn;

import java.util.Comparator;
//按照姓名排序
public class ComparatorByName implements Comparator<Person > {


    @Override
    public int compare(Person o1, Person o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return temp==0?o1.getAge()-o2.getAge():temp;
    }
}
