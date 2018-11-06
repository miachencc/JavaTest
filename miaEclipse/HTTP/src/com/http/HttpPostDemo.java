package com.http;

import com.sun.javafx.tk.TKDragSourceListener;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class HttpPostDemo {
    public static void main(String[] args){

        System.out.println(getResponse1());
    }
    public static String getResponse1() {
        String url = "http://v.juhe.cn/toutiao/index";
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair("type","top"));
        param.add(new BasicNameValuePair("key","4e8d028dc6e5a6b93da20314ebda6a9b"));
        try {
            httppost.setEntity(new UrlEncodedFormEntity(param, HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try {
            HttpResponse httpResponse = httpClient.execute(httppost);
            HttpEntity entity = httpResponse.getEntity();
            //if(httpResponse.getStatusLine().getStatusCode() != 200){
            return EntityUtils.toString(entity);
            //return EntityUtils.toByteArray(entity);
            //}


        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
