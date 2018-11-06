package com.gouzao.cn;
/*
 在对子类对象进行初始化时，父类的构造函数也会运行
 因为 子类的构造函数默认第一行有一条隐式的语句 super()
 super() 会访问父类中空参数的构造函数  而且子类中所有的构造函数默认第一行都是super()
 
 为什么子函数一定访问父类中的构造函数？
 
 因为父类中的数据  子类可以直接获取， 所以子类对象在建立时 需要先查看父类是如何对这些对象进行初始化的
 所以子类对象在初始化时，要先访问以下父类的构造函数
 如果访问父类中指定的构造函数，可以手动定义指定的构造函数
 
  注意 super语句一般放到构造函数的第一行
 
 子类的实例化过程
  结论  子类的所有的构造函数默认都会访问父类中空参数的构造函数
  因为每一个子类构造函数内的第一行都有一句隐式的super();
  
  当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定要访问父类中的构造函数
  当然  子类的构造函数也可通过this()来访问本类中的构造函数， 子类中至少会有一个构造函数访问父类中的构造函数
 */
class fu{ // object 所有类的父类
	
	int  num = 2;
	fu(){
	// super
	System.out.println("Hi fu");
	
	}
	 fu(int x){
		 System.out.println("Hifu4");
	 }
	
}	

class zi extends fu{
	zi(){
		this(); //有了 this不在访问父类了
	//super(); 
	System.out.println("Hizi");
	}
	zi(int x){
		//super 如果子类不想访问默认的父类，则必须手动指定访问父类的方法
		super(4);
		System.out.println("Hizi2");
	}
	
}	

public class gouzaozifu {
	public static void main(String[]args) {
		//zi z = new zi();	
		zi z = new zi(4); 
		System.out.println(z.num);
	} 

}

// 应用

class person{
	String name;
	person(String name){
		this.name = name;
	}
	
}
class student extends person{
	student(String name){
		super(name);// 调用父类中构造函数 用super();
	}
	 
	
	
}