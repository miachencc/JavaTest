package com.http;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HttpDemo {
    public static void main(String[] agrs){

        System.out.println(getResponse());
    }
    public static String getResponse() {
       // String url = "http://47.95.197.229:8080/aicc/first";
        String url = "http://localhost:8081/CServlet?username=cc&password=123456";
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);

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