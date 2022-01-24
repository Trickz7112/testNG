package org.baseclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinhotelApp4 {
	
	@Test
	public void pageFour() {
		WebElement firstname = AdactinhotelApp1.driver.findElement(By.id("first_name"));
		firstname.sendKeys("xyz");

		WebElement lastname = AdactinhotelApp1.driver.findElement(By.id("last_name"));
		lastname.sendKeys("bvd");


		WebElement address = AdactinhotelApp1.driver.findElement(By.id("address"));
		address.sendKeys("---------------");

		WebElement cardnumber = AdactinhotelApp1.driver.findElement(By.id("cc_num"));
		cardnumber.sendKeys("1234567891234567");

		WebElement cardtype = AdactinhotelApp1.driver.findElement(By.id("cc_type"));
		AdactinhotelApp1.selectClass(cardtype, 3);


		WebElement cardexpmonth = AdactinhotelApp1.driver.findElement(By.id("cc_exp_month"));
		AdactinhotelApp1.selectClass(cardexpmonth, 4);

		WebElement cardexpyear = AdactinhotelApp1.driver.findElement(By.id("cc_exp_year"));
		AdactinhotelApp1.selectClass(cardexpyear, 12);
			WebElement cvv = AdactinhotelApp1.driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys("203");
			
			
			AdactinhotelApp1.driver.findElement(By.id("book_now")).click();

	}
	@Before
	public void startTime() {
long starttime = System.currentTimeMillis();
System.out.println("4th page start time" + starttime);
	}

	@After
	public void endTime() {
long endtime = System.currentTimeMillis();
System.out.println("4th page endtime"+ endtime);
	}
	
@AfterClass
public static void closing() {
	AdactinhotelApp1.driver.quit();
}
	


}
