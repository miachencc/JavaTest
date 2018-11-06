package duixiang;
/*
 这个是先初始化对象  称为 饿汉式
 Single类 一进内存就创建好了对象
 class Single{
 	private static Single s = new Single{}
 	private Single(){}
 	public static Single getInstance(){
 		return s;
 	}
 }
 对象被调用时，才初始化，也叫做延时加载，称为 懒汉式
 Single类进内存， 对象还没有存在 只有调用了getinstance方法时，才建立对象
 class Single{
 	private static Single s = null;
 	private Single(){}
 	public static Single getInstance(){
 		if(s==null)
 			s = new Single();
 		return s;
 	}
 }
 *
 */
/*
 * 继承：
 * 1. 提高了代码的复用性
 * 2. 让类与类之间产生了关系，有了这个关系，才有了多态的特性
 * 3. JAVA语言中：java只支持单继承，不支持多继承，因为多继承容易带来安全隐患
 * 当多个父类中定义了相同的功能，当功能内容不同时，子类对象不确定要运行哪一个
 * */
class Person{
	String name;
	int age;
	void study() {
		
		System.out.println("person");
	}
	
}
class Student extends Person{
	
	void study() {
		
		System.out.println("good study");
	}
}
class Worker extends Person{
	void study() {
		
		System.out.println("good work");
	}
}

public class jicheng {
	public static void main(String[] args) {
		Person a =  new Student();
		 Person b = new Worker();
		 a.study();
		 b.study();
		
	}

}
