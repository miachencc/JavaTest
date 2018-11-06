package com.lanchfirefox.cn;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lanchbrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "F:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\Mia\\Selenium for Java tools\\geckodriver-v0.16.0-win64\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		 //WebDriver driver = new FirefoxDriver();  
		//driver.manage().window().setSize(new Dimension(480, 800));
		driver.manage().window().maximize();
		
		String URL1 = "https://youdao.com";
		//String URL2 = "https://baidu.com";
		
		driver.get(URL1);
		//driver.get(URL2);
		
		//获取有道词典输入框尺寸
		WebElement size = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(size.getSize());
		//获取有道词典输入框尺寸
		WebElement text = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(text.getText());
		//获取有道词典输入框其他属性
		WebElement ty = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(ty.getAttribute("type"));
		//返回结果元素是否可见，返回结果为True或者False
		WebElement dispaly = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(dispaly.isDisplayed());
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("submit"); //定位输入框，并输入内容
		//driver.findElement(By.xpath("////input[@name="q"]]")).click();   点击提交
		//driver.findElement(By.xpath("//input[@name='q']")).submit();   //回车快速提交
		
		//driver.navigate().refresh();  页面刷新
		//driver.navigate().back();  //页面后退
		//driver.navigate().forward();  //页面前进
		

			
		//driver.quit();
	}
	

}
