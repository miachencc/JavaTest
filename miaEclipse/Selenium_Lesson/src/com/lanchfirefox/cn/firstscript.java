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
	         //�ж�title�ǲ��� �ٶ�һ�£����֪��  
	           
	         try{  
	             String baidu_title = "�ٶ�һ�£����֪��";  
	             assert baidu_title == driver.getTitle();  
	             System.out.println("Test Pass");  
	               
	         }catch(Exception e){  
	             e.printStackTrace();  
	         }  
	                
	         //�رղ��˳������    
	         driver.quit();    
	    }  
	  
}
