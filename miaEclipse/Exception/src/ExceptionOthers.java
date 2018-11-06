/*第一个格式
try{

}
catch(){

}
第二个格式：
try{

}
catch(){

}
finally{

}
第三个格式：
try{

}
finally{

}
记住一点：catch用于处理异常，如果没有catch就代表异常没有被处理过，
如果该异常是检测时的异常，那么必须声明*/
class Demo4{
    public void method(){
        //throw new java.lang.Exception();
        try{
            throw new java.lang.Exception();
        }
        catch(java.lang.Exception e){

        }
        finally{
            //关资源
        }
    }
}

public class ExceptionOthers {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}
