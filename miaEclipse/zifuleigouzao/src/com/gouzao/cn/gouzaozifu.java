package com.gouzao.cn;
/*
 �ڶ����������г�ʼ��ʱ������Ĺ��캯��Ҳ������
 ��Ϊ ����Ĺ��캯��Ĭ�ϵ�һ����һ����ʽ����� super()
 super() ����ʸ����пղ����Ĺ��캯��  �������������еĹ��캯��Ĭ�ϵ�һ�ж���super()
 
 Ϊʲô�Ӻ���һ�����ʸ����еĹ��캯����
 
 ��Ϊ�����е�����  �������ֱ�ӻ�ȡ�� ������������ڽ���ʱ ��Ҫ�Ȳ鿴��������ζ���Щ������г�ʼ����
 ������������ڳ�ʼ��ʱ��Ҫ�ȷ������¸���Ĺ��캯��
 ������ʸ�����ָ���Ĺ��캯���������ֶ�����ָ���Ĺ��캯��
 
  ע�� super���һ��ŵ����캯���ĵ�һ��
 
 �����ʵ��������
  ����  ��������еĹ��캯��Ĭ�϶�����ʸ����пղ����Ĺ��캯��
  ��Ϊÿһ�����๹�캯���ڵĵ�һ�ж���һ����ʽ��super();
  
  ��������û�пղ����Ĺ��캯��ʱ����������ֶ�ͨ��super�����ʽ��ָ��Ҫ���ʸ����еĹ��캯��
  ��Ȼ  ����Ĺ��캯��Ҳ��ͨ��this()�����ʱ����еĹ��캯���� ���������ٻ���һ�����캯�����ʸ����еĹ��캯��
 */
class fu{ // object ������ĸ���
	
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
		this(); //���� this���ڷ��ʸ�����
	//super(); 
	System.out.println("Hizi");
	}
	zi(int x){
		//super ������಻�����Ĭ�ϵĸ��࣬������ֶ�ָ�����ʸ���ķ���
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

// Ӧ��

class person{
	String name;
	person(String name){
		this.name = name;
	}
	
}
class student extends person{
	student(String name){
		super(name);// ���ø����й��캯�� ��super();
	}
	 
	
	
}