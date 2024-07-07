package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_154_CSS_Classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement cssname=driver.findElement(By.cssSelector(".Pke_EE"));
		cssname.sendKeys("shoes");
		cssname.sendKeys(Keys.ENTER);
	}

}
