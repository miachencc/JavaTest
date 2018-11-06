package com.grouptest.cn;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
//������з����������
public class GroupOnMethod {
	
	@Test(groups = "server")
	public void test1() {
		System.out.println("���Ƿ������Ĳ��Է���1111");
	}
	
	@Test(groups = "server")
	public void test2() {
		System.out.println("���Ƿ������Ĳ��Է���222");
	}
	
	@Test(groups = "client")
	public void test3() {
		System.out.println("���ǿͻ�����Ĳ��Է���3333");
	}
	
	@Test(groups = "client")
	public void test4() {
		System.out.println("��ͻ�����Ĳ��Է���4444");
	}
	
	@BeforeGroups("server")
	public void beforeGroupsOnServer() {
		System.out.println("���Ƿ����������֮ǰ�ķ���");
	}
	
	@AfterGroups("server")
	public void afterGroupsOnServer() {
		System.out.println("���Ƿ����������֮��ķ���");
	}
	
	@BeforeGroups("client")
	public void beforeGroupsOnClient() {
		System.out.println("���ǿͻ���������֮ǰ�ķ���");
	}
	
	@AfterGroups("client")
	public void afterGroupsOnClient() {
		System.out.println("���ǿͻ���������֮��ķ���");
	}

}
