package cn.jsontest.com.JsonTestBeans;

import java.util.Arrays;

public class Person {
    private int id;
    private String name;
    private String sex;
    private long[] phone;
    private Cat cat;
    private Object object;

    public Person() {
    }

    public Person(int id, String name, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long[] getPhone() {
        return phone;
    }

    public void setPhone(long[] phone) {
        this.phone = phone;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", sex=" + sex
                + ", phone=" + Arrays.toString(phone) + ", cat=" + cat
                + ", object=" + object + "]";
}

}
