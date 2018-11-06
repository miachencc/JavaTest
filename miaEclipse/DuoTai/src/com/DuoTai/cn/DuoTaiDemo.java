package com.DuoTai.cn;

/*
*
*
*
*
* */
abstract class Student{
    abstract void study();
    public void sleep(){
        System.out.println("lay on sleep");
    }
}

class baseStudent extends Student{
    void study(){
        System.out.println("base study");
    }

    @Override
    public void sleep() {
        System.out.println("sit on sleep");
    }
}

class advStudent extends Student{
    void study(){
        System.out.println("adv study");
    }
}
class doStu{
    public static void doSome(Student stu){

        stu.study();
        stu.sleep();
    }
}

public class DuoTaiDemo {
    public static void main(String[] args){
        /*baseStudent bs =new baseStudent();
        bs.study();;
        bs.sleep();
        advStudent as = new advStudent();
        as.study();
        as.sleep();*/
        doStu ds=new doStu();
        ds.doSome(new baseStudent());
        ds.doSome(new advStudent());
    System.out.println("hello world");
    }


}
