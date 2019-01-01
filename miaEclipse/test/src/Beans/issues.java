package Beans;

import java.util.ArrayList;
import java.util.List;

public class issues {
    private String expand;
    private int id;
    private String self;

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }




    private String key;

    public Beans.fields getFields() {
        return fields;
    }

    public void setFields(Beans.fields fields) {
        this.fields = fields;
    }

    private fields fields;

    @Override
    public String toString() {
        return "issues{" +
                "expand='" + expand + '\'' +
                ", id=" + id +
                ", self='" + self + '\'' +
                ", key='" + key + '\'' +
                ", fields=" + fields +
                '}';
    }
}
