package asadasda;
/*静态代码块
 * t特点：
 **/
/*public class Mia {
	static {
		System.out.println("a");
	}
	public static void main(String[] args) {
		// TODO Auto-generated metshod stub
		//System.out.println("Hello");
		//new StaticdDemo();
		//StaticdDemo.show();
		s = new StaticdDemo();
		StaticdDemo.s = null;//不调用StaticdDmeo类 没有对应的输出
	}
	static {
		
		System.out.println("c");
	}

}
class StaticdDemo
{
	static {
		System.out.println("Hellobbb");
		
	}
	public static void show() {
		
		System.out.print("DDD");
	}
	
}*/

//构造代码块 静态代码 执行顺序练习
public class Mia {
	
	public static void main(String[] args) {
		new StaticCode(4);// a c  d 
		new StaticCode();
		              .show(1);
		//s.show(1);
		
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		//new StaticdDemo();
		//StaticdDemo.show();
		//s = new StaticdDemo();
		//StaticdDemo.s = null;//不调用StaticdDmeo类 没有对应的输出
	}
	static {
		
		System.out.println("mia");
	}

}
class StaticCode
{
	int num =4;
	StaticCode(){
		System.out.println("b");//没有创建过与之对应的对象，
	}
	static {
		System.out.println("a");//1. 静态代码块给类初始化，2. 不能直接访问num，静态代码块只能访问静态变量
	}
	{
		System.out.println("c"+this.num);//1. 构造代码块给对象初始化
	}
	StaticCode(int x){
		System.out.println("d");// 构造函数给对应的对象进行初始化
	}
	
	public static void show(int x) {
		
		System.out.print("jjj");
	}
	
}
