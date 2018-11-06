package com.stringbuffer;
/*
* String Buffer是一个字符串缓冲容器
*
* 是一个容器
* 1. 而且长度是可变化的
* 2. 可以操作多个数据类型
* 3.最终会通过toString方法变成字符串
*
* C create U update Rread  D delete
* 1. 存储
*   StringBuffer append()将指定数据作为参数添加到已有数据结尾处
*   StringBuffer insert(index,数据）可以将数据插入到指定位置
* 2. 删除
*   StringBuffer delete(start,end)删除缓冲区的数据，包含头不包含尾
*   StringBuffer deletecharAt(index)删除指定位置的字符
* 3. 获取
*   char charAt(int index)
*   int indexOf(String str)
*   int lastIndexOf(string str)
*   length()
*   string subString(start,end)
* 4. 修改
*   StringBuffer replace(start,end,string)
*   void setCharAt(int index,char ch)
*
* 5. 反转
*   StringBuffer reverse
*
* 6. 将缓冲区中的指定数据，存储到指定数组中
*   void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
*
*   jdk1.5版本之后出现StringBuilder
*   StringBuffer是线程同步的
*   StringBuilder是线程不同步的
*
* */
public class Stringbuffer {
    public static void method_replace(){
        StringBuffer sb = new StringBuffer("hello java");
        //sb.replace(3,5,"pp");
        sb.setCharAt(4,'p');
        sop(sb.toString());
    }
    public static  void method_add(){
        StringBuffer sb = new StringBuffer();
        sb.append("abc").append(43).append(true);
        sb.insert(2,"kk");

        /*java.lang.StringBuffer sb1 = sb.append(34);
        sop((sb==sb1));
        sop(sb1.toString());*/
        sop(sb.toString());
    }
    public static  void method_delete(){
        StringBuffer sb = new StringBuffer("abcdef");
        //sb.delete(1,3);
        sb.deleteCharAt(2);
        //sb.delete(0,sb.length());
        sop("sb="+sb.toString());
    }
    public static void main(String[] args){

        StringBuffer sbg = new StringBuffer("cloud nine");
        char[] chs = new char[4];
        sbg.getChars(1,4,chs,1);
        for(int x =0; x<chs.length;x++){
            System.out.println(chs[x]);
        }
        method_replace();
        method_add();
        method_delete();



    }
    public static void sop(Object obj){
        System.out.println(obj);
    }

}
