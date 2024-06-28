import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Parallel_testing_Scenarios.browserWindow_opening_closing;

public class assert_firstshoe {
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
			System.out.println(s1);
			
			
			
		}

}
