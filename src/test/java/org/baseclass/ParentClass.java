package org.baseclass;

import org.openqa.selenium.WebElement;

public class ParentClass extends BaseClassMethods {
	public static void main(String[] args) {
		BaseClassMethods b=new BaseClassMethods();
		b.setupBrowser("https://facebook.com");
		b.maximize();
	b.findElementbyXpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
b.findElementbyName("firstname");
b.sendKey(b.findElementbyName("firstname"), "gsdgdsg");
	
	b.findElementbyXpath("//select[@id='day']").click();
	
	}

}
