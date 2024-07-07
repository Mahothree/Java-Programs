package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_157_CSS_AttrName_AttrValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);

	}

}
