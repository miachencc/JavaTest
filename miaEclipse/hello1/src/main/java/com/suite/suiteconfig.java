package com.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//�׼�����
public class suiteconfig {
	@BeforeSuite
	public void beforesuite() {
	System.out.println("befroesuite������");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite������");
		}
	@BeforeTest
	public void beforetest() {
	System.out.println("befroetest������");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest������");
		}
	
	@BeforeClass
	public void beforeclass() {
	System.out.println("befroeclass������");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass������");
		}
}
