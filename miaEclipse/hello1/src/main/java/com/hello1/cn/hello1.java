package com.hello1.cn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class hello1 {
	@Test//最基本的注解  用来把方法标记为测试的一部分
	public void testcase1() {
		System.out.println("这是测试用例");
	}
	@Test
	public void testcase2()
	{
		System.out.println("这是测试用例2");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod这是在方法之前运行的");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod这是在方法之后运行的");}
		
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass这是在类之前运行的");}
		
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass这是在类之后运行的");
	}
	@BeforeSuite //测试套件
	public void beforeSuite() {
		System.out.println("beforesuite之前运行的");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite之后运行的");
		
	}
	}
