package cn.jsontest.com.JsonTestBeans;

public class Cat {
    private String name;
    private String sex;

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

    public Cat(String name, String sex) {
        super();
        this.name = name;
        this.sex = sex;
    }

    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", sex=" + sex + "]";
    }

}
