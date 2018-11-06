package com.grouptest.cn;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
	public void teacher1() {
		System.out.println("GroupOnClass3的teacher111运行");
	}
	public void teacher2() {
		System.out.println("GroupOnClass3的teacher222运行");
	}

}
