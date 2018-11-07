package com;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        //获取一个想要的指定文件集合，获取javase_code(包含子目录)下所有的.java文件对象。并存储到集合中
        /*
        * 1. 包含子目录 递归
        * 2. 递归过程中需要过滤器
        * 3. 满足条件的都添加到集合中
        * */
        File dir = new File("D:\\mia\\GitMia\\JavaTest\\miaEclipse\\AbstractClass");
        List<File> list = fileList(dir);
        for(File file:list){
            System.out.println(file);
        }

    }
    //获取指定过滤器条件的文件集合
    public static List fileList(File dir){
        // 定义集合
        List<File> list = new ArrayList<File>();
        FileFilter filter = new FileFilterBySufix(".java");

        getFileList(dir,list,filter);
        return list;

    }
    /*
    * 对指定的目录进行递归
    *
    * 多级目录下都要用到相同的集合和过滤器，不要在递归方法中定义，而是不断的进行传递
    *
    * @param dir 需要遍历的目录
    * @param list 用于存储符合条件的File对象
    * @param filter 接受指定的过滤器
    * */
    public static void getFileList(File dir, List<File> list, FileFilter filter){

        //通过ListFile方法，获取当前dir下所有的文件和文件夹

        File[] files = dir.listFiles();
        //遍历该数组
        for(File file:files){
            //判断是文件夹 如果是进行递归，不是对文件进行过滤
            if(file.isDirectory()){
                getFileList(file,list,filter);
            }
            else{
                //通过过滤器对文件进行过滤
                if(filter.accept(file)){
                    list.add(file);
                }
            }
        }
    }
}
