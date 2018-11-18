package com.collectiondemo1;

import java.util.*;

public class ListIteratorDemo {

    public static void main(String[] args){
        List list1 = new ArrayList();

        list1.add("abc1");
        list1.add("abc2");
        list1.add("abc3");
        list1.add("abc4");

        //for 循环遍历会将添加的元素默认加到队尾，一般不再for循环中进行删除，重复元素会有问题
        for(int i =0; i<list1.size();i++){
            Object obj3 = list1.get(i);
            if(obj3.equals("abc2")){
                list1.add("haha");
            }
        }
        System.out.println(list1);
        //Iterator循环遍历将添加的元素加到当前的index
        ListIterator it2 = list1.listIterator();
        while (it2.hasNext()){
            Object obj2 = it2.next();
            if(obj2.equals("abc2")){
                it2.add("haha");
            }
        }

       /* Iterator it1 = list1.iterator();
        //希望在遍历过程中 如果遍历到abc2添加元素haha
        while(it1.hasNext()){
            Object obj = it1.hasNext();
           /** if (obj.equals("abc2"))
                list1.add("haha"); ConcurrentModificationExceptionCurrent迭代过程中使用了集合对象
            同时对元素进行了操作 导致了迭代的不确定性，引发异常

            解决办法：使用列表迭代器方法，可以实现在迭代过程中的增删改查
        }*/

    }
}
