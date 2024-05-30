package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_launch_search_withKeys {

	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//title can be store in string vari12=driver.getTile();
		//System.out.println(driver.getTitle());
		driver.findElement(By.name("field-keywords")).sendKeys("camera");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}

}
