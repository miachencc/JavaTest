package com.suite;

import org.testng.annotations.Test;

public class ignoretest {
		@Test
		public void ignore1() {
			System.out.println("ignore1 ִ��");
		}
		@Test(enabled = false) //���Բ���
		public void ignore2() {
			System.out.println("ignore2 ִ��");
		}
		
		@Test(enabled = true)
		public void ignore3() {
			System.out.println("ignore3ִ��");
		}
}
