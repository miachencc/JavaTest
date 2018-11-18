package cn.jsontest.com;

import cn.jsontest.com.JsonTestBeans.Cat;
import cn.jsontest.com.JsonTestBeans.Dog;
import cn.jsontest.com.JsonTestBeans.Person;
import com.google.gson.Gson;

public class JsonTest {
    public static void main(String[] args) {
        Gson gson = new Gson();//实例化Gson对象

        Person person = new Person(1, "JunkChen", "male");//实例化Person对象
        person.setPhone(new long[]  {17802900000l});
        Cat cat = new Cat("wangwang", "female");//实例化Cat对象
        Dog dog = new Dog();//实例化Dog对象
        dog.setAge(20);//没有给name设置默认值，将对象转换成Json数据不展示name字段，因为没有默认值。如果是int类型则展示0，int有默认值
        person.setCat(cat);
        person.setObject(dog);
        System.out.println(gson.toJson(person));//将Person对象转换成Json对象数据
        System.out.println(gson.toJson(cat));
        System.out.println(gson.toJson(dog));
        System.out.println();

        String json = "{\"phone\":[17802900000, 17802900001],\"id\":1,\"cat\":{\"name\":\"wangwang\"},\"sex\":\"female\",\"name\":\"Junk\",\"object\":{\"name\":\"doggg\",\"age\":12}}";//Json格式的数据
        Person fromJson = gson.fromJson(json, Person.class);//使用Gson将Json数据转换成Person对象
        System.out.println(fromJson.toString());
        System.out.println(fromJson.getCat().getName());
        System.out.println();

        System.out.println(gson.fromJson(gson.toJson(fromJson.getObject()), Dog.class));
        // fromJson.getObject() 返回一个Dog对象
        //gson.toJson(fromJson.getObject()) 将对象转换成JSON数据String类型
        //
    }
}
