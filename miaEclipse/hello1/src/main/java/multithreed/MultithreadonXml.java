package multithreed;

import org.testng.annotations.Test;

public class MultithreadonXml {
	@Test
	public void test1(){
		System.out.println(1);
		System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
	}
	@Test
	public void test2(){
		System.out.println(2);
		System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
	}
	@Test
	public void test3(){
		System.out.println(3);
		System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
	}

}
