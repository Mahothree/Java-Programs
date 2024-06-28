package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class mouse_getby2daysorting_click1mouse extends browserWindow_opening_closing {
@Test
	
	public void first_mouse()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
		search.sendKeys(Keys.ENTER);
		WebElement getitby2days=driver.findElement(By.linkText("Get It in 2 Days"));
		getitby2days.click();
		WebElement a=driver.findElement(By.xpath("(//div[@class=\"s-product-image-container aok-relative s-text-center s-image-overlay-grey puis-image-overlay-grey s-padding-left-small s-padding-right-small puis-flex-expand-height puis puis-v36tmkogwwueb520kjutkllt0dc\"])[1]"));
		a.click();

}
}