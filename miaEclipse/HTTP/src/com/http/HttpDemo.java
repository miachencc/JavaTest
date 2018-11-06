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

        getResponse();
    }
    public static String getResponse() {
        String url = "http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=29c346aac27f4edc9d3c2a1ae573771a";
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);

        try {
            HttpResponse httpResponse = httpClient.execute(httpget);
            HttpEntity entity = httpResponse.getEntity();

            //if(httpResponse.getStatusLine().getStatusCode() != 200){
                //return EntityUtils.toString(entity);
                byte[] array = EntityUtils.toByteArray(entity);
            try {
                FileOutputStream fos = new FileOutputStream("F:\\eCLIPSE\\miaEclipse\\HTTP\\1.1.txt");
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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}