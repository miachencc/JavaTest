package com.hello1.cn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class hello1 {
	@Test//�������ע��  �����ѷ������Ϊ���Ե�һ����
	public void testcase1() {
		System.out.println("���ǲ�������");
	}
	@Test
	public void testcase2()
	{
		System.out.println("���ǲ�������2");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod�����ڷ���֮ǰ���е�");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod�����ڷ���֮�����е�");}
		
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass��������֮ǰ���е�");}
		
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass��������֮�����е�");
	}
	@BeforeSuite //�����׼�
	public void beforeSuite() {
		System.out.println("beforesuite֮ǰ���е�");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite֮�����е�");
		
	}
	}
