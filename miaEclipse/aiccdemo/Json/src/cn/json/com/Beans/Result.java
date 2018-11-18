package cn.json.com.Beans;

import cn.json.com.Beans.sk;
import cn.json.com.Beans.today;

import java.util.List;

public class Result {
    private cn.json.com.Beans.sk sk;
    private cn.json.com.Beans.today today;
    private List< future> future;

    public List<cn.json.com.Beans.future> getFuture() {
        return future;
    }

    public void setFuture(List<cn.json.com.Beans.future> future) {
        this.future = future;
    }



    public sk getSk() {
        return sk;
    }
    public void setSk(sk sk) {
        this.sk = sk;
    }

    public today getToday() {
        return today;
    }

    public void setToday(today today) {
        this.today = today;
    }
    public String toString() {
        return "\n\r {sk："+sk+"\n\r today:"+ today+ "}";
    }
   /*public List<future> getFuture() {
        return future;
    }

    public void setFuture(List<future> future) {
        this.future = future;
    }*/
}
