package com.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
    /*将数据写入文件过程中
      使用字节输出流
      FileOutputStream
      */
    File dir = new File("tempfile");
    if(!dir.exists()){
        dir.mkdir();
    }
    //1.创建字节输出流对象，用于操作文件，在对象初始化时，必须对数据存储目的地
        //输出流所关联的目的地，如果不存在，会自动创建
        FileOutputStream fos = new FileOutputStream("tempfile\\fos.txt");
    //2. 调用输出流的写体系
        String string = "abccdefe";
        byte[] buffer = string.getBytes();
        fos.write("abdkgsklg".getBytes());
        //3. 释放资源
        fos.close();
    }
}
