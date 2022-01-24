package org.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassMethods {
	public WebDriver driver;
	public void setupBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		}

	public void maximize() {
driver.manage().window().maximize();
	}
	public WebElement findElement(String name) {
WebElement element = driver.findElement(By.id(name));
return  element;
	}
	
public void sendKey(WebElement element, String name) {
	element.sendKeys(name);
		
}

public WebElement findElementbyName(String name) {
WebElement element = driver.findElement(By.name(name));
element.click();
return element;
}

public WebElement findElementbyXpath(String xpath) {
WebElement element = driver.findElement(By.xpath(xpath));
element.click();
return element;
}

public void dropDown(WebElement findElement,int id) {
	
Select s =new Select(findElement);
List<WebElement> options = s.getOptions();
options.get(id);

}
}

