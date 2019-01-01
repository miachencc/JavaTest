package com.collectiondemo1.com.bean;

import java.util.Objects;

public class Student implements Comparable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//学生具备了比较功能，该功能时自然排序使用的方法
// 自然排序就以年龄的升序为主

    @Override
    public int compareTo(Object o) {
        Student stu2 = (Student)o;
       /* if(this.age>stu2.age)
            return 1;
        if (this.age<stu2.age)
            return -1;
        return 0;*/
        /*同年龄的是同一个人，视为重复元素，要判断的要素有2个
既然是按照年龄进行排序，所以先判断年龄，在判断姓名
* 既然是同姓名
* */
        int temp = this.age - stu2.age;
        return temp==0?this.name.compareTo(stu2.name):temp;

    }

    /*覆盖hashcode方法，根据对象自身的特点定义哈希值*/
  /*  @Override
    public int hashCode() {

        return this.age;
    }*/
/*需要定义对象自身按断内容相同的*/
   /* @Override
    public boolean equals(Object obj) {
        if (this ==obj){
            return true;
        }
        if (!(obj instanceof  Student)){
            throw new ClassCastException(obj.getClass().getName()+"类型错误");
        }

        Student stu =(Student)obj;
        return this.name.equals(stu.name)&& this.age==age;
    }*/
}
