package com.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import com.test.com.util.GetHeader;

public class TestLogin {
    static String cookie;
    public static void main(String[] args){

        getResponse1();
        System.out.println(GetIssue());
    }
    public static Header[] getResponse1() {
        String url = "http://jira.lietou.com/login.jsp";
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair("os_username","chencong1"));
        param.add(new BasicNameValuePair("os_password","cehncong123"));
        try {
            httppost.setEntity(new UrlEncodedFormEntity(param, HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            HttpResponse httpResponse = httpClient.execute(httppost);
            HttpEntity entity = httpResponse.getEntity();
            int status= httpResponse.getStatusLine().getStatusCode();
            System.out.println("status="+status);
            //获取reponse头信息
          /*  Header[] header;
            header = httpResponse.getHeaders("Set-Cookie");
            if (header.length != 0){
                cookie = header[0].toString();
                System.out.println(header[0].toString());
            }
            return header;*/
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
    public static String GetIssue(){
        String url2 = "http://jira.lietou.com/rest/api/2/search?jql=project%20=%20H端神十%20AND%20creator%20=%20zhaon";
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url2);
        httpget.addHeader(new BasicHeader("Authorization", "Basic Y2hlbmNvbmcxOmNoZW5jb25nMTIz"));
        System.out.println(cookie);
        try {
            HttpResponse httpResponse = httpClient.execute(httpget);
            HttpEntity entity = httpResponse.getEntity();
            int status= httpResponse.getStatusLine().getStatusCode();
            System.out.println("status="+status);
            return EntityUtils.toString(entity);

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


