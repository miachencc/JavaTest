package asadasda;
/*��̬�����
 * t�ص㣺
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
		StaticdDemo.s = null;//������StaticdDmeo�� û�ж�Ӧ�����
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

//�������� ��̬���� ִ��˳����ϰ
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
		//StaticdDemo.s = null;//������StaticdDmeo�� û�ж�Ӧ�����
	}
	static {
		
		System.out.println("mia");
	}

}
class StaticCode
{
	int num =4;
	StaticCode(){
		System.out.println("b");//û�д�������֮��Ӧ�Ķ���
	}
	static {
		System.out.println("a");//1. ��̬���������ʼ����2. ����ֱ�ӷ���num����̬�����ֻ�ܷ��ʾ�̬����
	}
	{
		System.out.println("c"+this.num);//1. ��������������ʼ��
	}
	StaticCode(int x){
		System.out.println("d");// ���캯������Ӧ�Ķ�����г�ʼ��
	}
	
	public static void show(int x) {
		
		System.out.print("jjj");
	}
	
}
