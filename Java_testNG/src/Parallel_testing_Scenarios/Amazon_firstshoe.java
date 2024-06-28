package Parallel_testing_Scenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_firstshoe extends browserWindow_opening_closing {
	@Test
	
	public void first_shoe_click()
	{
	
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoeclick=driver.findElement(By.xpath("(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"])[1]"));
		shoeclick.click();
		Set<String> s1=driver.getWindowHandles();
		Assert.assertEquals(s1.size(), 2,"shoe click");
		
		
	}
}
