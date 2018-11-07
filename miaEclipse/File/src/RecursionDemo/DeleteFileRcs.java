package RecursionDemo;

import java.io.File;

public class DeleteFileRcs {
    /*删除一个目录必须从里往外删*/
    public static void main(String[] args){

        File dir = new File("E:\\test");
        deleteDir(dir);
    }
    public  static  void deleteDir(File dir){
        //1. 列出当前目录下所有的文件夹及文件
        File[] files = dir.listFiles();

        //2. 对该数组进行遍历
        for(File file: files){
            //3. 判断是否有目录。如果有继续使用该功能遍历，递归；如果不是文件夹，直接删除
            if (file.isDirectory()){
                deleteDir(file);
            }
            else {
                System.out.println(file+":"+file.delete());
            }

            }
            System.out.println(dir+":"+dir.delete());
        }
    }

