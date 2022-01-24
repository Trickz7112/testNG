package org.baseclass;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinhotelApp2 {

	
@Test

public void pageTwo() {
	
WebElement dropdown1 = AdactinhotelApp1.driver.findElement(By.id("location"));
AdactinhotelApp1.selectClass(dropdown1, 2);


WebElement dropdown2 = AdactinhotelApp1.driver.findElement(By.id("hotels"));
AdactinhotelApp1.selectClass(dropdown2, 3);


WebElement dropdown3 = AdactinhotelApp1.driver.findElement(By.id("room_type"));
AdactinhotelApp1.selectClass(dropdown3, 4);

AdactinhotelApp1.driver.findElement(By.id("Submit")).click();

}

@Before
public void startTime() {
long starttime = System.currentTimeMillis();
System.out.println("2nd page start time" + starttime);
}

@After
public void endTime() {
long endtime = System.currentTimeMillis();
System.out.println("2nd page endtime"+ endtime);
}


}

	
