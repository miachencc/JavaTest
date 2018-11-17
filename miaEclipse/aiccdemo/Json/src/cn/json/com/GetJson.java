package cn.json.com;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GetJson  {
    public static void main(String[] agrs){

        System.out.println(getResponse());
        //JSONObject resultjson = getResponse();
    }
    public static String getResponse() {
        // String url = "http://47.95.197.229:8080/aicc/first";
        String url = "http://localhost:8081/CServlet?username=cc&password=123456";
        String url2 ="http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=29c346aac27f4edc9d3c2a1ae573771a";
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url2);
        String result = null;
        try {
            HttpResponse httpResponse = httpClient.execute(httpget);
            HttpEntity entity = httpResponse.getEntity();

            // if(httpResponse.getStatusLine().getStatusCode() == 200){
            return EntityUtils.toString(entity);


        } catch (IOException e) {
            e.printStackTrace();
        }
               /* byte[] array = EntityUtils.toByteArray(entity);
            try {
                FileOutputStream fos = new FileOutputStream("F:\\cleangit\\miaEclipse\\HTTP\\1.1.txt");
                try {
                    System.out.println();
                    fos.write(array);

                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    fos.close();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();*/

        return null;

    }
}