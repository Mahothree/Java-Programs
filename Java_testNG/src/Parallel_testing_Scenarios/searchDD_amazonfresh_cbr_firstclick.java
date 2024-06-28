package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class searchDD_amazonfresh_cbr_firstclick extends browserWindow_opening_closing {
@Test
	
	public void cucumber_firstclick()
	{
		WebElement dd=driver.findElement(By.xpath("//div[@id=\"nav-search-dropdown-card\"]/div/select"));
		Select s=new Select(dd);
		s.selectByVisibleText("Amazon Fresh");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("cucumber");
		search.sendKeys(Keys.ENTER);
		WebElement firstcucumber=driver.findElement(By.xpath("(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20\"])[1]"));
		firstcucumber.click();
		
		

}

}
