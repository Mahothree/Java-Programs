package TestNG_ITestListener;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener1.class)
public class prog2 extends listener1{

	@Test
	
	public void amazonlister() {
		driver=new EdgeDriver();             
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
			WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("shoes");
			search.sendKeys(Keys.ENTER);
			WebElement shoeclick=driver.findElement(By.xpath("(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"])[1]"));
			shoeclick.click();
			Set<String> s1=driver.getWindowHandles();
			System.out.println(s1);
			Assert.assertEquals(s1.size(), 1,"not found child");
	}
}
