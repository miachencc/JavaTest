package cn.json.com.Beans;

public class sk {
    private int temp;
    private String humidity;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    public String toString() {
        return "\n\r {temp："+temp+"\n\r humidity:"+ humidity+ "}";
    }
}
