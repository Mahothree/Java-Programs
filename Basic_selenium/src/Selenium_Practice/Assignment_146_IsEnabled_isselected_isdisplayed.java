package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_146_IsEnabled_isselected_isdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new 		ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.className("gLFyf"));
		if(search.isDisplayed()&&search.isSelected()||search.isEnabled() ) {
			search.sendKeys("india");
			search.sendKeys(Keys.ENTER);
		}
		
	}

}
