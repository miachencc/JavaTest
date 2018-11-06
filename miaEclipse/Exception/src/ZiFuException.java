/*
* 异常子子父类覆盖中的体现：
* 1. 子类在覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法，只能抛出父类的异常或者该异常子类
* 2. 如果父类方法抛出多个异常，那么子类在覆盖该方法时，只能抛出父类异常的子集
* 3. 如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时也不可以抛出异常，
*    如果子类方法发生了异常，只能进行try处理绝对不能抛
* */

class AException extends java.lang.Exception{

}
class BException extends AException{

}
class CException{

}
/*
* Exception
*   -A
*     -B
*   -C
* */
class Fu{
    void show()throws AException{

    }
}
class Zi extends Fu{
    @Override
    void show() throws AException,BException{
        super.show();
    }
}
public class ZiFuException {
    public  static void main(String[] args){
        System.out.println("hello world");
    }
}
