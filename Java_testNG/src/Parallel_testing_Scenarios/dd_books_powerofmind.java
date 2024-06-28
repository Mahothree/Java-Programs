package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dd_books_powerofmind  extends browserWindow_opening_closing{

@Test
	
	public void book_powerofmind ()
	{
		WebElement dd=driver.findElement(By.xpath("//div[@id=\"nav-search-dropdown-card\"]/div/select"));
		Select s=new Select(dd);
		s.selectByVisibleText("Books");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("power of mind");
		search.sendKeys(Keys.ENTER);
		WebElement book=driver.findElement(By.xpath("(//div[@class=\"s-product-image-container aok-relative s-text-center s-image-overlay-grey puis-image-overlay-grey s-padding-left-small s-padding-right-small puis-flex-expand-height puis puis-v36tmkogwwueb520kjutkllt0dc\"])[1]"));
		book.click();
		
		

}
}
