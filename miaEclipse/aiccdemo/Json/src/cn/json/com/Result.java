package cn.json.com;

import java.util.List;

public class Result {
    private sk sk;
    private today today;
    //private List< future> future;

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
