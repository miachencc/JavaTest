package com.grouptest.cn;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {
	public void stu1() {
		System.out.println("GroupOnClass2的stu111运行");
	}
	public void stu2() {
		System.out.println("GroupOnClass2的stu222运行");
	}

}
