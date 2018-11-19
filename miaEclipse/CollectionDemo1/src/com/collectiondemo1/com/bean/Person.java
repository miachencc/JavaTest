package com.collectiondemo1.com.bean;

public class Person {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//建立Person类自己判断对象是否相同的依据，必须覆盖Object类中的equals方法
    @Override
    public boolean equals(Object obj) {
        //为了提高效率 如果比较对象时同一个 直接返回true
        if (this==obj)
            return true;

        if (!(obj instanceof Person)) {
            throw new ClassCastException("Type Error");
        }
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age==p.age;
    }
}
