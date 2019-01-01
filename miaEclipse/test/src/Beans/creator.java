package Beans;

public class creator {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "creator{" +
                "name='" + name + '\'' +
                '}';
    }
}
