package com.integerdemo;

/*基本数据类型包装类
* byte   Byte
* short Short
* int Integer
* long Long
* boolean Boolean
* float Float
* double  Double
* char Character
*
* 基本数据类型对象包装类的最常见的作用
* 就是用于基本数据类型和字符串类型之间做转换
*
* 基本数据类型转成字符串
*   基本数据类型+""/
*   基本数据类型.tostring(基本数据类型值) eg： integer.toString(34)
*
* 字符串转成基本数据类型
* xxx a = Xxx.parseXxx(String)
* int a = Integer.parseInt(a)
* boolean a = Boolean.parseBoolean("true")
* ---------------------------------------
* 十进制转换成其他进制
*   toBinaryString
*   toHexString
*   toOctalString
* 其他进制转换成十进制
*   parse(String s, int radix)
*
* */

public class IntegerDemo {
    public static  void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){

        //整数类型的最大值
        //("int max ="+Integer.MAX_VALUE);
        //讲一个字符串转成整数
       /* int num = Integer.parseInt("34");
        long num1 = Long.parseLong("123");
        sop("num1="+(num1+4));*/

       int x = Integer.parseInt("3c",16);//根据进制转换成十进制
       sop("x="+x);
    }

}
