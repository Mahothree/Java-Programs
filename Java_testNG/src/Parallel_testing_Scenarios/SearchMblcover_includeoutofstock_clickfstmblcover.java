package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchMblcover_includeoutofstock_clickfstmblcover extends browserWindow_opening_closing {
@Test
	
	public void mblcover()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobilecover");
		search.sendKeys(Keys.ENTER);
		WebElement includeoutofstock=driver.findElement(By.linkText("Include Out of Stock"));
		includeoutofstock.click();
		

}

}
