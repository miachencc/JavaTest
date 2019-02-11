package com.fanxing.cn;

public class GenerateDemo9{

    public static void main(String[] args){
        /*泛型的上限应用

        演示泛型限定在api中的体现
         * Tresset的构造函数
         * TreeSet（Collection<? extend E> coll）】
         *
         * 一般向集合中存储元素时，如果集合定义了E类型通常情况下应该存储E类型的对象
         * 对E的子类型也可以接受，所以这时可以将反省从E 改为？ Extend E*/
        Collection<Student> coll=new ArrayList<Student>();
        coll.add(new Student("abc",12));
        coll.add(new Student("abc1",14));
        coll.add(new Student("abc2",13));

        TreeSet<Person> ts= new TreeSet<Person>(coll);
        ts.add(new Student("qqq",44));

        /*
        * 泛型的下限应用
        * 什么时候会用到下限应用
        *当从容器中取出元素操作时，可以用E类型接受也可以用E的副类型接受
        * */

        //创建一个比较器
         Comparator<Student> comparator= new Comparator<Student>(){

             public int compare(Student o1,Student O2){

                 int temp = o1.getAge()-o2.getAge();
                 return temp==0?o1.getName().compareToo2.getName():temp;
             }
         }

        TreeSet<Student> ts = new TreeSet<Student>(comparator);
        ts.add(new Student("qqq",44));
        ts.add(new Student("qqq",45));
        ts.add(new Student("qqq",44));
        ts.add(new Student("qqq",34));



    }
}
class MyTreeSet<E>{


     MyTreeSet() {

    }
    MyTreeSet(Collection<? extends E> c){ //可以接收E或者其子类型的集合  上限应用

    }
}

class YourTreeSet<E>{

    YourTreeSet(Comparator<E> comparator){

    }
}