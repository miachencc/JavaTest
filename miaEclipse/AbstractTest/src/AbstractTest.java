
abstract class Employee{

    String name;
    String ID;
    double Salary;
    Employee(String name, String ID, double Salary)
    {
        this.name=name;
        this.ID=ID;
        this.Salary=Salary;
    }
    abstract public void work();
}

class Pro extends Employee{
    Pro(String name, String ID, double Salary)
    {
        super(name,ID,Salary);

    }
    public void work(){
        System.out.println("Pro Study" );
    }
}
class Manager extends Employee {

    int bonus;

    Manager(String name, String ID, double Salary, int bonus) {
        super(name, ID, Salary);
        this.bonus = bonus;

    }

    public void work() {
        System.out.println("manager Study");
    }


}

public class AbstractTest {
    public static void main(String[] args){
        Pro pro = new Pro("zjangsan","001JS",8900);
        pro.work();
        Manager manager = new Manager("zjangsan","001JS",8900,20000);
        manager.work();
        System.out.println("Hello World");
    }
}