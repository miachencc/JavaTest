package duixiang;
/*
 ������ȳ�ʼ������  ��Ϊ ����ʽ
 Single�� һ���ڴ�ʹ������˶���
 class Single{
 	private static Single s = new Single{}
 	private Single(){}
 	public static Single getInstance(){
 		return s;
 	}
 }
 ���󱻵���ʱ���ų�ʼ����Ҳ������ʱ���أ���Ϊ ����ʽ
 Single����ڴ棬 ����û�д��� ֻ�е�����getinstance����ʱ���Ž�������
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
 * �̳У�
 * 1. ����˴���ĸ�����
 * 2. ��������֮������˹�ϵ�����������ϵ�������˶�̬������
 * 3. JAVA�����У�javaֻ֧�ֵ��̳У���֧�ֶ�̳У���Ϊ��̳����״�����ȫ����
 * ����������ж�������ͬ�Ĺ��ܣ����������ݲ�ͬʱ���������ȷ��Ҫ������һ��
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
