package com.lanchfirefox.cn;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
public class lanchfirefox {
		  
	    public static void main(String[] args) {  
	          
	        //System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");  
	    	System.setProperty("webdriver.firefox.bin", "F:\\Firefox\\firefox.exe");
	        System.setProperty("webdriver.gecko.driver", "F:\\Mia\\Selenium for Java tools\\geckodriver-v0.16.0-win64\\geckodriver.exe");  
	          
	        //��ʼ��һ����������ʵ����ʵ�����ƽ�driver  
	        WebDriver driver = new FirefoxDriver();  
	        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	        //��󻯴���  
	        driver.manage().window().maximize();  
	        // get()��һ��վ��  
	        driver.get("https://www.baidu.com"); 
	        //�������Եȴ�ʱ��  
	       
	          
	       
	        //getTitle()��ȡ��ǰҳ��title��ֵ  
	        System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());  
	          
	        //�رղ��˳������  
	        driver.quit();  
	          
	    }  
	  

}


