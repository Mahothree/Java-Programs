package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class searhcamera_click35thcamera extends browserWindow_opening_closing {
	
@Test
	
	public void click_35thcamera()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("camera");
		search.sendKeys(Keys.ENTER);
		WebElement camera22=driver.findElement(By.xpath("(//div[@class=\"s-product-image-container aok-relative s-text-center s-image-overlay-grey puis-image-overlay-grey s-padding-left-small s-padding-right-small puis-flex-expand-height puis puis-v36tmkogwwueb520kjutkllt0dc\"])[22]"));
		camera22.click();

}

}
