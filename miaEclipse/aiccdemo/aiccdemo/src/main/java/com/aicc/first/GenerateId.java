package com.aicc.first;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


    public class GenerateId {
        public static void main(String[] args){

            System.out.println(getResponse1());

        }

        public static String getResponse1() {
            String url = "http://10.110.13.3:7980/RPC/IPersonResumeParseService/generateResId4GodQTP";
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(url);



            JSONObject jsonParam = new JSONObject();
            jsonParam.put("clientId","10077");
            jsonParam.put("currentUserId","346");
            jsonParam.put("data","\"{\"userhId\":51002404,\"sceneName\":\"GodInterfaceQTP\",\"resId\":20439119}\"");


            StringEntity entity = null;//解决中文乱码问题
            try {
                entity = new StringEntity(jsonParam.toString());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httppost.setEntity(entity);

            try {
                HttpResponse httpResponse = httpClient.execute(httppost);
                HttpEntity entity1 = httpResponse.getEntity();
                int status = httpResponse.getStatusLine().getStatusCode();
                System.out.println(status);
                String respond = EntityUtils.toString(entity1);

                String[] stemp = respond.split(",");
                String[] a1 =stemp[2].split(":");
                String[] a2 =a1[1].split("}");
                String resId = a2[0];
                System.out.println(a1[0]+":"+resId);

                return resId;



            } catch (ClientProtocolException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

