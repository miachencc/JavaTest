package com.http;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
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
        String url = "http://10.110.13.22:7385/RPC/IAbtestService/isGoldCdkHcomp";
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);

        JSONObject jsonParam = new JSONObject();
        jsonParam.put("clientId","10077");
        jsonParam.put("currentUsreId","20887");
        jsonParam.put("data","{\n" +
                "\t\t\"hcompId\": 447\n" +
                "\t}");

        //表单方式
       /* List<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair("username","cc"));
        param.add(new BasicNameValuePair("password","4e8d028dc6e5a6b93da20314ebda6a9b"));*/

       // try {
        StringEntity entity = null;//解决中文乱码问题
        try {
            entity = new StringEntity(jsonParam.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httppost.setEntity(entity);
            //System.out.println();
            //httppost.setEntity(new UrlEncodedFormEntity(param, HTTP.UTF_8));
        /*} catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        try {
            HttpResponse httpResponse = httpClient.execute(httppost);
            HttpEntity entity1 = httpResponse.getEntity();
            int status = httpResponse.getStatusLine().getStatusCode();
            System.out.println(status);
            //if(httpResponse.getStatusLine().getStatusCode() != 200){
            String respond = EntityUtils.toString(entity1);
            //JSONObject result =JSONObject.fromObject(respond);
            return respond;
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
