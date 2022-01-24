package org.baseclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AdactinhotelApp3  {

	@Test
	public void pageThree() {
		AdactinhotelApp1.driver.findElement(By.id("radiobutton_0")).click();

		AdactinhotelApp1.driver.findElement(By.id("continue")).click();
	}
	@Before
	public void startTime() {
long starttime = System.currentTimeMillis();
System.out.println("3rd pagestart time" + starttime);
	}

	@After
	public void endTime() {
long endtime = System.currentTimeMillis();
System.out.println("3rd page endtime"+ endtime);
	}
	
}
