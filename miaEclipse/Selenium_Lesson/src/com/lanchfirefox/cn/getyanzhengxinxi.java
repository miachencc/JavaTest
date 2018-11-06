package com.lanchfirefox.cn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class getyanzhengxinxi {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.bin", "F:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\Mia\\Selenium for Java tools\\geckodriver-v0.16.0-win64\\geckodriver.exe");  
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://pan.baidu.com");
		
		System.out.println("Before login=================");
		System.out.printf("title of current page is %s\n", driver.getTitle());
		System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();	
		}
		//获取登陆前的标题和URL
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_4__footerULoginBtn']")).click();		
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__userName']")).sendKeys("18232670603");	
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__password']")).sendKeys("8a8a35556");	
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__submit']")).click();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();	
		}
		
		driver.findElement(By.xpath("//p[@class='tip-button']")).click();
		//获取登陆后的标题和URL
		System.out.println("After login=================");
		System.out.printf("title of current page is %s\n", driver.getTitle());
		System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
		
		//获取登陆后的用户名
		String text = driver.findElement(By.xpath("//span[@class='user-name']")).getText();
		System.out.println(text);
		
		
	}

}
