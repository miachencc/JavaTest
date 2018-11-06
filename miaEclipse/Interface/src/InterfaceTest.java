

abstract class Student{
    abstract void study();
    void sleep(){
        System.out.println("sleep");
    }

}
interface  Smoking{
    void smoke();
}

class Zhang extends Student implements Smoking{
    @Override
    void study() {
        System.out.println("lisi study");
    }

    @Override
    public void smoke() {
        System.out.println("zs Smoke");
    }
}
class Li extends Student{
    @Override
    void study() {
        System.out.println("lisi study");
    }
}

public class InterfaceTest {
    public static void main(String[] args){

    }
}
