package com.parameter.cn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//通过xml文件参数化，对应的xml文件parameter
public class ParameterTest {
	@Test
	@Parameters({"name","age"})
	public void paramTest1(String name,int age) {
		System.out.println("name="+name+"; age="+age);
	}
}
