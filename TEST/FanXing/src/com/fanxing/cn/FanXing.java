package com.fanxing.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*为了解决该问题，在定义集合时，就直接明确集合中元素的的存储类型
* 这样，编译器在编译是，就可以对集合中存储的对象类型进行检查
* 一旦发现类型不匹配 就编译失败，这个技术就是泛型技术
*
* 好处：
* 1.将运行时期的问题转移到编译时期，可以更好的让程序员发现问题并解决
* 2. 避免了向下转型的麻烦
*
* 总结  泛型就是应用在编译时的一项安全机制
* 泛型的擦除： 编译器通过泛型 对元素类型进行检查，只要检查通过，就会生成class文件，但是在class文件中
* 就将泛型标识去除
*
* 泛型的表现：泛型技术在集合框架中应用范围很大。
*             什么时候需要些泛型？
*             1. 只要看到类或者接口在描述时右边定义<> 就需要泛型
*             2. 其实是容器在不明确操作元素的类型情况下，对外提供了一个参数
*             使用容器时，只要将具体的类型实参传递给该参数即可
*             泛型就是，传递型参数*/
public class FanXing {
    public static void main(String[] args){
        //为了运行时期不出现类型异常，可以再定义容器是，就明确容器中的元素；类型
        List<String> List = new ArrayList<String>();
        List.add("abc");
        List.add("cde");

        for(Iterator<String> it = List.iterator();it.hasNext();){
            String str = it.next();
            System.out.println(str.length());

        }
    }
}
