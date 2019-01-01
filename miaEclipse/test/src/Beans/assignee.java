package Beans;

public class assignee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "assignee{" +
                "name='" + name + '\'' +
                '}';
    }
}
