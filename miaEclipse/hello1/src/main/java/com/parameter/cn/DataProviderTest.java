package com.parameter.cn;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//dataprovider参数化
public class DataProviderTest {
	@Test(dataProvider = "data")
	public void testDataProvider(String name,int age) {
		System.out.println("name="+name+"; age="+age);
	}
	@DataProvider(name ="data")
	public Object[][] providerData(){
		Object[][] o =new Object[][] {
			{"zhangsdan",10},
			{"lisi",20}
		};
		return o;
	}
	
	@Test(dataProvider="methoddata")
	public void test1(String name,int age){
		System.out.println("test1 方法的name="+name+";age="+age);
	}
	@Test(dataProvider="methoddata")
	public void test2(String name,int age){
		System.out.println("test2 方法的name="+name+";age="+age);
	}
	@DataProvider(name ="methoddata")
	public Object[][] methodDataTest(Method method){
		Object[][] result=null;
		if(method.getName().equals("test1")) {
			result = new Object[][] {
				{"zjadan",20},
				{"lisi",27}
			};
		}else if(method.getName().equals("test2")){
			result = new Object[][] {
				{"wangwu",90},
				{"zhaliu",7}
		};
		}
		return result;
		
	}

}
