package Parallel_testing_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class electronics_majortab_redmebrand extends browserWindow_opening_closing {
@Test
	
	public void electronics_redmebrand()
	{
		WebElement electronics=driver.findElement(By.xpath("(//div[@id=\"nav-xshop\"]/a)[8]"));
		electronics.click();
		WebElement redme=driver.findElement(By.xpath("(//li[@class=\"a-spacing-micro\"])[11]/span/a/div"));
		redme.click();

}

}
