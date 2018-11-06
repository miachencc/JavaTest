package com.staticcode.cn;
/*
静态代码块：
格式：
static{
    静态代码块中的执行语句
}
特点：随着类的加载而执行，只执行一次，并优先于主函数。
用于给类初始化的
*/
class staticcodedemo{
    static{
        System.out.println("a");
    }
}

class staticcode {

    static{
        System.out.println("b");
    }
    public static void main(String[] args){
        new staticcodedemo();
        new staticcodedemo(); //不会再执行一次了，因为内存中已经加载过一次
        System.out.println("over");
    }

    static{
        System.out.println("c");
    }
}

//结果是b,c,a,over