package com.grouptest.cn;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
	public void stu1() {
		System.out.println("GroupOnClass1��stu111����");
	}
	public void stu2() {
		System.out.println("GroupOnClass1��stu222����");
	}
}
