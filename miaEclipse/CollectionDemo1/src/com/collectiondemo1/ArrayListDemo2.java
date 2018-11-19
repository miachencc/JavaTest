package com.collectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//取出重复元素
public class ArrayListDemo2 {
    public static void main(String[] args){
        List list3 = new ArrayList();

        list3.add("abc1");
        list3.add("abc1");
        list3.add("abc1");
        list3.add("abc3");
        list3.add("abc4");
        list3.add("abc4");
        list3.add("abc2");
        list3.add("abc6");

        System.out.println(list3);
        singleElement2(list3);
        System.out.println(list3);
    }

    //去除重复元素
    public static void singleElement(List list){
        for(int x=0;x<list.size()-1;x++){
            Object obj_x= list.get(x);
            for(int y=x+1;y<list.size();y++){
                if(obj_x.equals(list.get(y))){
                    list.remove(y);
                    y--;
                }
            }
        }
    }
/*思路：
  1. 最后唯一性的元素也很多，可以先定义一个人的容器用于存储这些唯一性元素
  2. 对原有容器进行元素获取，并到临时容器中去判断是否存在，容器本身基友这个功能判断是否存在
  3. 存在就不存储，不存在就存储
  4. 遍历完原容器后 临时容器中存储的就是唯一性元素
  */
        public static void singleElement2(List list){
           //创建
            List temp = new ArrayList();
            //遍历原容器
            for (Iterator it = list.iterator();it.hasNext();){
                Object object =(Object)it.next();
                //判断是否存在
                if (!temp.contains(object)){
                    //不存在添加
                    temp.add(object);
                }
            }
            //清空原容器
            list.clear();
            //将临时容器元素存储到原容器中
            list.addAll(temp);
        }
        public static void iteratorGet(List list){
        for (Iterator it = list.iterator();it.hasNext();){
            if (it.next().equals(it.next())){
                it.remove();
            }
        }
    }
}
