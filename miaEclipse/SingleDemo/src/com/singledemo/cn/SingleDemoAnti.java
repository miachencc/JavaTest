package com.singledemo.cn;
//多次创建对象的反例

class Single1{
    int num;
    public void  setNum(int num){
        this.num =num;
    }
    public int getNum(){
        return num;
    }
}
public class SingleDemoAnti {
    public static void main(String[] args){
        Single1 s1=new Single1();
        Single1 s2=new Single1();
        s1.setNum(30);
        System.out.println(s2.getNum());//无法保证类的唯一性，这块的num不等于30

    }
}
