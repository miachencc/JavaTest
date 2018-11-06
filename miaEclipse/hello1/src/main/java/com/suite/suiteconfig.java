package com.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//套件测试
public class suiteconfig {
	@BeforeSuite
	public void beforesuite() {
	System.out.println("befroesuite运行了");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite运行了");
		}
	@BeforeTest
	public void beforetest() {
	System.out.println("befroetest运行了");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest运行了");
		}
	
	@BeforeClass
	public void beforeclass() {
	System.out.println("befroeclass运行了");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass运行了");
		}
}
