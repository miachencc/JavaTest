package com.lanchfirefox.cn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;


public class zudingwei {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://pan.baidu.com");
		

		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();	
		}
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_4__footerULoginBtn']")).click();		
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__userName']")).sendKeys("18232670603");	
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__password']")).sendKeys("8a8a35556");	
		driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__submit']")).click();
		
		try {
			Thread.sleep(8000);
		}catch(InterruptedException e){
			e.printStackTrace();	
		}
		
		driver.findElement(By.xpath("//p[@class='tip-button']")).click();
		
		List<WebElement> node = driver.findElements(By.xpath("//span[@node-type='EOGexf']"));
		for (WebElement EOGexf:node) {
			String type = new String(EOGexf.getAttribute("type"));
			if(type.equals("EOGexf")) {
				EOGexf.click();
				try {
					Thread.sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();	
				}
			}
		}
	}

}
