package cn.json.com.Beans;

/**
 *  "temperature":"9℃~13℃",
 *                 "weather":"小雨-中雨转阴",
 *                 "weather_id":{
 *                     "fa":"21",
 *                     "fb":"02"
 *                 },
 *                 "wind":"北风3-5级",
 *                 "week":"星期日",
 *                 "date":"20181118"
 */
public class future {
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String temperature;
    private String weather;
    private String wind;
    private String week;
    private String date;

    @Override
    public String toString() {
        return "future{" +
                "temperature='" + temperature + '\'' +
                ", weather='" + weather + '\'' +
                ", wind='" + wind + '\'' +
                ", week='" + week + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
