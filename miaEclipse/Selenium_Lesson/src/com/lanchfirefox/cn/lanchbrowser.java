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
		
		//��ȡ�е��ʵ������ߴ�
		WebElement size = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(size.getSize());
		//��ȡ�е��ʵ������ߴ�
		WebElement text = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(text.getText());
		//��ȡ�е��ʵ��������������
		WebElement ty = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(ty.getAttribute("type"));
		//���ؽ��Ԫ���Ƿ�ɼ������ؽ��ΪTrue����False
		WebElement dispaly = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(dispaly.isDisplayed());
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("submit"); //��λ����򣬲���������
		//driver.findElement(By.xpath("////input[@name="q"]]")).click();   ����ύ
		//driver.findElement(By.xpath("//input[@name='q']")).submit();   //�س������ύ
		
		//driver.navigate().refresh();  ҳ��ˢ��
		//driver.navigate().back();  //ҳ�����
		//driver.navigate().forward();  //ҳ��ǰ��
		

			
		//driver.quit();
	}
	

}
