package com.lanchfirefox.cn;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
  
public class firstscript {
 
	  
	    public static void main(String[] args) {  
	          
	    	System.setProperty("webdriver.firefox.bin", "F:\\Firefox\\firefox.exe");
	        System.setProperty("webdriver.gecko.driver", "F:\\Mia\\Selenium for Java tools\\geckodriver-v0.16.0-win64\\geckodriver.exe");
	           
	         WebDriver driver = new FirefoxDriver();    
	              
	         driver.manage().window().maximize();    
	               
	         //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);       
	          
	         driver.get("https://www.baidu.com");    
	         //判断title是不是 百度一下，你就知道  
	           
	         try{  
	             String baidu_title = "百度一下，你就知道";  
	             assert baidu_title == driver.getTitle();  
	             System.out.println("Test Pass");  
	               
	         }catch(Exception e){  
	             e.printStackTrace();  
	         }  
	                
	         //关闭并退出浏览器    
	         driver.quit();    
	    }  
	  
}
