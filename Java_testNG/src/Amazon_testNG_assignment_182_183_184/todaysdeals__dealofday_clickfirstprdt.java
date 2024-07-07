package Amazon_testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class todaysdeals__dealofday_clickfirstprdt {

	
	WebDriver driver;
	@Test
	public void dealofday() {
	
		driver=new EdgeDriver();             
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
		WebElement tdydeals=driver.findElement(By.linkText("Today's Deals"));
		tdydeals.click();
		WebElement dealofday=driver.findElement(By.xpath("(//div[@class=\"a-carousel-viewport\"]/ol/li)[1]"));
		dealofday.click();
		WebElement prdt1=driver.findElement(By.xpath("(//div[@class=\"a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf\"])[1]"));
		prdt1.click();
		
		
}

}
