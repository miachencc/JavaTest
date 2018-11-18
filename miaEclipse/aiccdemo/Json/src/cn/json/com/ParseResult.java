package cn.json.com;

import cn.json.com.Beans.WeatherBean;
import cn.json.com.Beans.future;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Iterator;
import java.util.List;

import static cn.json.com.GetJson.getResponse;

public class ParseResult {
    public static void main(String[] agrs){
        /* 简单的创建对象并取值
            JsonObject json = new JsonObject();
            json.addProperty("name",2);
            json.addProperty("Gender","woman");
            int code = json.get("name").getAsInt();
            String reason = json.get("Gender").getAsString();
            System.out.println(code);
            System.out.println(reason);
            */
        /*String result = "{\n" +
                "    \"resultcode\":\"200\",\n" +
                "    \"reason\":\"查询成功\",\n" +
                "    \"result\":{\n" +
                "        \"sk\":{\n" +
                "            \"temp\":\"11\",\n" +
                "            \"humidity\":\"82%\",\n" +
                "        },\n" +
                "        \"today\":{\n" +
                "            \"temperature\":\"11℃~16℃\",\n" +
                "            \"date_y\":\"2018年11月17日\",\n" +
                "        },\n" +
                "    \"error_code\":0\n" +
                "}";*/
        String result = getResponse();
        //一般不用此方法
        JsonObject resultJson =(JsonObject)new JsonParser().parse(result).getAsJsonObject();

       /* Gson gson = new Gson();
        String resultJson=gson.toJson(result);
        System.out.println(resultJson);
        */

        System.out.println(resultJson);
        int code = resultJson.get("resultcode").getAsInt();
        String reason = resultJson.get("reason").getAsString();
        int temp = resultJson.get("result").getAsJsonObject().get("sk").getAsJsonObject().get("temp").getAsInt();
        System.out.println(temp);

        //
        Gson gson = new Gson();
        WeatherBean WeatherBean = gson.fromJson(result, WeatherBean.class);
        System.out.println(WeatherBean.getError_code());
        System.out.println(WeatherBean.getResult().getFuture());

        List<future> futures = WeatherBean.getResult().getFuture();
        Iterator<future> futureIterator = futures.iterator();
        System.out.println("未来"+futures.size()+"天的天气如下：");
        while(futureIterator.hasNext()){
            future future =futureIterator.next();
           // String futurejson = gson.toJson(future);
            System.out.println(future.getWeek()+"温度："+future.getTemperature());
        }
        }
    }

