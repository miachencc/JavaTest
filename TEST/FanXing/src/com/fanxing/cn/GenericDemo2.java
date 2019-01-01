package com.fanxing.cn;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GenericDemo2 {
    public static void main(String[] args){
        Set<Person> set = new TreeSet<Person>(new ComparatorByName());
        set = new HashSet<Person>();
        set.add(new Person("zhangdan",9));
        set.add(new Person("yushi",19));
        set.add(new Person("dhencdan",13));
        set.add(new Person("dhencdan",19));

        for(Person s:set){
            System.out.println(s);
        }
    }
}
