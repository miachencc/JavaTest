
/*内部类是定义在局部时，不可以被成员修饰符修饰
* 可以直接访问外部类中成员，因为还持有外部类中的引用
* 但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量*/
class Outer{
    int x = 3;
    void method(int a){

        int y =4;
        class Inner{//内部类定义在局部变量处   无法静态化
            void function(){
                System.out.println(Outer.this.x);
                System.out.println(y); //y被final
                System.out.println(a);//a被final
            }
        }

        Inner in = new Inner();
        in.function();
    }
}

public class Innerdemo {
    public static void main(String[] args){
        Outer out = new Outer();
        out.method(9);
        out.method(10);
    }
}
