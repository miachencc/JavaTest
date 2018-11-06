package com.lanchfirefox.cn;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class IE {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "F:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\Mia\\Selenium for Java tools\\geckodriver-v0.16.0-win64\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		
		 //WebDriver driver = new FirefoxDriver();  
		//driver.manage().window().setSize(new Dimension(480, 800));
		driver.manage().window().maximize();
		
		//String URL1 = "https://pan.baidu.com";
		//String URL2 = "https://baidu.com";
		
		driver.get("https://pan.baidu.com");
		//driver.get(URL2);	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_4__footerULoginBtn']")).click();		
		//driver.quit();
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__userName']")).sendKeys("18232670603");	
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__password']")).sendKeys("8a8a35556");	
		
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__submit']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//p[@class='tip-button']")).click();
		Actions action = new Actions(driver);
		//action.contextClick(driver.findElement(By.xpath("//dd[@_position='1']"))).perform();鼠标右击
		//driver.findElement(By.xpath("//li[contains(text(),'打开')]")).click();
		
		action.doubleClick(driver.findElement(By.xpath("//dd[@_position='1']"))).perform();//鼠标双击
		
		action.clickAndHold(driver.findElement(By.xpath("//span[@class='user-name']"))).perform();

		driver.findElement(By.xpath("//a[@node-type='login-out']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//b[contains(text(),'取消')]")).click();
		
		
	}
	

}
