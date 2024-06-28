package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchandClick_firstMbl extends browserWindow_opening_closing {
	
@Test
	
	public void first_shoe_click()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
		WebElement mblclick=driver.findElement(By.xpath("(//div[@class=\"sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16\"])[1]"));
		mblclick.click();

}
}
