package cn.json.com;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
        System.out.println(resultJson);
        int code = resultJson.get("resultcode").getAsInt();
        String reason = resultJson.get("reason").getAsString();
        int temp = resultJson.get("result").getAsJsonObject().get("sk").getAsJsonObject().get("temp").getAsInt();
        System.out.println(temp);

        //
        Gson gson = new Gson();
        WeatherBean WeatherBean = gson.fromJson(result, WeatherBean.class);
        System.out.println(WeatherBean.getError_code());

    }
}
