package com.stringdemo;
/*String类是用于描述字符串事物
* 那么他就提供了多个方法对字符串进行操作
*常见的操作有哪些？
* 1. 获取
*   1.1 字符串中包含的字符数  字符串长度
*   int length() 获取长度
*   1.2 根据位置获取位置上某个字符
*   char charAt（int index）
*   1.3 根据字符获取该字符串的位置
*   int Indexof(int ch)返回的是ch在字符串中第一次出现的位置
*   int IndexOf(int ch, int fromIndex)从fromIndex指定位置开始获取ch在字符串中出现的位置
*   int IndexOf(String str)返回的是str在字符串中第一次出现的位置
*   int IndexOf(int ch, int fromIndex)从fromIndex指定位置开始获取ch在字符串中出现的位置
*
* 2. 判断：
*   2.1 字符串中是否包含某一个子串
*       boolean contains()
*       特殊之处： IndexOf(str)可以所以str第一次出现的位置，如果返回-1，表示该str不在字符串中存在
*                 所以也可以用于对指定字符串的判断是否包含
*                 if (IndexOf(Str)!=-1)
*
*                 而且该方法既可以判断 又可以获取出现的位置
*
*   2.2 字符喜欢中是否有内容 原理 判断长度是否为0
*       boolean isEmpity()
*   2.3 字符串是否以指定内容开头
*       boolean startsWith()
*   2.4 字符串中是否以指定内容结尾
*       boolean endsWith()
*   2.5 判断字符串的内容是否相同  复写了Object类中的equals方法
*       boolean equals(str);
*   2.6 判断内容是否相同，并忽略大小写
*       boolean equalsIgnoreCase();
*
* 3. 转换
*   3.1 将字符数组转成字符串
*       构造函数： String(char[])
*                 String(char[],offset,count):将字符数组中的一部分转成字符串
*       静态方法： static String copyValueOf(cahr[]);
*                 copyValueOf(char[] data, int offset, int count)
*
*                 staic String valueOf(char[])
*   3.2 将字符串转成字符数组
*           char[] toCharArray();
*
*   3.3 将字节数组转成字符串
*               String(byte[])
 *                 String(byte[],offset,count):将字节数组中的一部分转成字符串
*   3.4 将字符串组转成字节数组
*             byte[] getBytes();
*
*   3.5 将基本数据类型转成字符串
*       String valueOf(int)
*       String valueOf(double)
*
*       3+""/String valueOf(3)
*
*   3.2/3,4特殊： 字符数组和字节数组在转换过程中，是可以指定编码表的
*
*
*4. 替换
*   String replace(oldchar,newchar);
*
*5.切割
*   String[] split(regex)
*
*6. 子串
* 获取字符串中的一部分
*   String substring(begin);
*   String substring(begin,end);
*
*7. 转换 去除空格  比较
*   7.1 将字符串转成大写或者小写
*       String toUpperCase()
*       String toLowerCase()
*   7.2 将字符串两端的多个空格去除
*       String trim()
*   7.3 将两个字符串进行自然顺序的比较
*       int compareto(string)
* */
public class StringDemo2 {
    public static void method_7(){
        String s = "  Hello Java  ";
        sop(s.toLowerCase());
        sop(s.toUpperCase());
        sop(s.trim());

        String s1 ="arc";
        String s2 ="aaa";
        sop(s1.compareTo(s2));
    }
    public  static  void method_substring(){
        String s = "woaiccyeah";
        sop(s.substring(7));//从指定位置开始到结尾，字符串角标越界异常
        sop(s.substring(2,5));//包含头，不包含尾 s.substring(0,s.length)
    }
    public static  void method_split(){
        String s = "zhangsan,lisi,wangwu";
        String[] arr = s.split(",");

        for(int x =0;x<arr.length;x++){
            sop(arr[x]);
        }
    }
    public  static void replace(){
        String s = "hello java";
        String s2 = s.replace('a', 'n');//如果要替换掉额字符不存在，返回的还是原字符串
        String s3 = s.replace("java","World");
        sop("s2="+s2);
        sop("s="+s);
        sop("s3="+s3);
    }
    public static void method_transfer(){
        char[] arr = {'a','b','c','d','e','f'};

        String s = new String(arr,1,3);
        sop("s="+s);

        String str1="zfdfgsdg";

        char[] chr = str1.toCharArray();
        for(int x =0; x< str1.length();x++){
            sop("chr="+chr[x]);
        }

    }

    public  static void method_get(){
        String str= "abcdefa";
        //长度
        sop(str.length());
        //根据所以获取字符
        sop(str.charAt(4));//当访问到字符串中不存在定位角标时，会发生StringIndexOutBoundException

        //根据字符获取索引
        sop(str.indexOf('f'));//如果没有找到返回-1

        //反向索引
        sop(str.lastIndexOf("e"));
    }
    public  static void method_is(){
        String str = "ArrayDemo.java";

        //包含
        sop(str.contains("Demo"));

        //为空
        sop(str.isEmpty());
        //开头
        sop(str.startsWith("Arr"));
        //结尾
        sop(str.endsWith("java"));
    }

    public  static  void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){

        method_7();
        method_substring();
        method_split();
        replace();
        method_transfer();
        method_get();
        method_is();

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 ="abc";

        System.out.println(s1==s2);//false
        System.out.println(s2==s3);
        System.out.println(s1==s3);//true   常量池已经存在不会再开辟新的空间，指向了同一个对象


    }

}
