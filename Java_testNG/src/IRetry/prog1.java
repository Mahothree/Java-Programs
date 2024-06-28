package IRetry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class prog1 {

	@Test(retryAnalyzer=IRetry.IRetry_interface.class)
	public void amazon() {
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a=driver.findElement(By.name("fiywords"));

	//WebElement a=driver.findElement(By.name("field-keywords"));
				a.sendKeys("camera");
			driver.findElement(By.id("nav-search-submit-button")).click();
				
		
		
		
}
}
