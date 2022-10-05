package testNgDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class democlass {
	
		
		@Test
		public void login_Test()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement userName=driver.findElement(By.xpath("//input[@name=\"username\"]"));
			userName.sendKeys("Admin");
			WebElement passwordData=driver.findElement(By.xpath("//input[@name=\"password\"]"));
			passwordData.sendKeys("admin123");
			WebElement loginButton=driver.findElement(By.xpath("//div[@class=\"oxd-form-actions orangehrm-login-action\"]/button"));
			loginButton.click();
			Assert.assertEquals(driver.getTitle(),"OrangeHRM");
			driver.close();

			}



}
