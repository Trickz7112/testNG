package org.baseclass;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinhotelApp1 {
static	WebDriver driver;

public static void selectClass(WebElement name , int id) {
Select s=new Select(name);
s.selectByIndex(id);
}


	@BeforeClass
public static void browserLaunch() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
}
	
	@Test
	public  void loginInfo() {
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("trickz7112");
WebElement passwordbox = driver.findElement(By.id("password"));
passwordbox.sendKeys("Passkey@123");
driver.findElement(By.id("login")).click();

	}

	
	

	
	@Before
	public void startTime() {
long starttime = System.currentTimeMillis();
System.out.println("1st page start time" + starttime);
	}

	@After
	public void endTime() {
long endtime = System.currentTimeMillis();
System.out.println("1st page endtime"+ endtime);
	}
	
	

}
