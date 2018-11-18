package cn.json.com.Beans;

public class today {
    private String temperature;
    private String date_y;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDate_y() {
        return date_y;
    }

    public void setDate_y(String date_y) {
        this.date_y = date_y;
    }

    @Override
    public String toString() {
        return "\n\r {temperature："+temperature+"\n\r date_y:"+ date_y+ "}";
    }
}
