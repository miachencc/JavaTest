package com;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOExceptionDemo {
    private static  final String LINE_SEPARATOR = System.getProperty("line_separator");
    public static void main(String[] args){

        FileOutputStream fos= null;

        try{
            fos = new FileOutputStream("tempfile\\fos.txt",true);//1. 空指针异常，对象创建不成功，fos=null 2. 将字节写入文件末尾处

            String string= LINE_SEPARATOR+"hello";
            fos.write(string.getBytes());

            }
        catch(IOException e){
            System.out.println(e.toString()+"------");
        }
        finally{
            if(fos!=null)
            try {
                    fos.close();
            } catch (IOException e) {
                throw new RuntimeException("关闭失败"+e);
            }
        }
    }
}
