package multithreed;

import org.testng.annotations.Test;
//多线程注解
public class MultiThreedOnAnnotation {
	@Test(invocationCount = 10,threadPoolSize = 3)
	public void test() {
		System.out.println(1);
		System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
	}
}
