package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_155_CSS_Tagname_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement cssid=driver.findElement(By.cssSelector("textarea#APjFqb"));
		cssid.sendKeys("india");
		
	}

}
