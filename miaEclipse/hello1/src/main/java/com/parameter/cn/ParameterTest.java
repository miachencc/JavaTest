package com.parameter.cn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//ͨ��xml�ļ�����������Ӧ��xml�ļ�parameter
public class ParameterTest {
	@Test
	@Parameters({"name","age"})
	public void paramTest1(String name,int age) {
		System.out.println("name="+name+"; age="+age);
	}
}
