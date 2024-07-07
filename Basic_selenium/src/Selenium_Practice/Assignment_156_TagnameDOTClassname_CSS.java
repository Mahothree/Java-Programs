package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_156_TagnameDOTClassname_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=GSB_New_CX_FP&utm_adgroup=OTC_Healthcare&gad_source=1&gclid=Cj0KCQjwsPCyBhD4ARIsAPaaRf1zdo0zOgnh6KDC9CSfTGHyz1oW1SVz3NsgrjZsTlKmpa8hyQc674caAnKsEALw_wcB");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.cssSelector("a.Navbar_labTests__2SoAH"));
		search.click();
		
	}

}
