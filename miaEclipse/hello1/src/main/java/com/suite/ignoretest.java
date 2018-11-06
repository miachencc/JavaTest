package com.suite;

import org.testng.annotations.Test;

public class ignoretest {
		@Test
		public void ignore1() {
			System.out.println("ignore1 Ö´ÐÐ");
		}
		@Test(enabled = false) //ºöÂÔ²âÊÔ
		public void ignore2() {
			System.out.println("ignore2 Ö´ÐÐ");
		}
		
		@Test(enabled = true)
		public void ignore3() {
			System.out.println("ignore3Ö´ÐÐ");
		}
}
