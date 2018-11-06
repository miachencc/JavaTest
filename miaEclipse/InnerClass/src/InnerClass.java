/*内部类的访问规则：
* 1. 内部类可以直接访问外部类的成员，包括私有
* 2.  外部类要访问内部类，必须建立内部对象
*
* 访问格式：
* 当内部类定义在外部类成员位置上而且非私有，可以在外部其他类中
* 可以直接建立内部类对象
* 格式
*
* 外部类名.内部类 变量名 = 外部类对象。内部类对象
* Outer.Inner in = new Outer().new Inner()
*
* 当内部类在成员位置上，就可被成员修饰符修饰，
* 比如： private 将内部类在外部类中进行封装
*       static 内部类就具备了静态的特性
*当内部类被静态修饰后，只能访问外部类中静态成员了，出现了局限
*
* 在外部其他类中，如何直接访问静态内部类的非静态成员
* new Outer.Inner().function();
*
* 在外部其他类中，如何直接访问静态内部类的静态成员
 * Outer.Inner.function();
 *
 * 注意防内部类中定义了静态成员，该内部类必须是static的
* 外部类中的静态方法  访问内部类时，内部类也必须是静态的
*
* 当描述事物时，事物的背部还有事物，该事物用内部类描述
* 因为内部事物在使用外部事物的内容
*
* class body{
*
* }
* */

class Outer{
    static private int x = 3;

  /*  class Inner{//内部类
        int x =4;
        void function(){
            int x= 6;
            System.out.println("inner:"+ Outer.this.x);
        }
    }*/
  static class Inner{
      static void function(){
          System.out.println("inner:"+ x);
      }
  }
    void method(){
        System.out.println(x);
        Inner in =new Inner();
        in.function();
        //直接访问内部类中成员

    }

    class Inner2{
      void show(){
          System.out.println("inner2 show");
      }
    }

    public static void method2(){
      Inner.function();

    }
}



public class InnerClass {
    public static void main(String[] args){
       /* Outer out= new Outer();
        out.method();
        Outer.Inner in = new Outer().new Inner();*/
       Outer.Inner.function();
       new Outer.Inner().function();

    }

}
