package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_150_pharmaauotosearchoptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=GSB_New_CX_FP&utm_adgroup=OTC_Healthcare&gad_source=1&gclid=Cj0KCQjwsPCyBhD4ARIsAPaaRf1zdo0zOgnh6KDC9CSfTGHyz1oW1SVz3NsgrjZsTlKmpa8hyQc674caAnKsEALw_wcB");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class=\"Input_input__AFI4R Typeahead_input__64Wro\"]"));
		search.sendKeys("montek");
		List<WebElement> autosearch=driver.findElements(By.xpath("//div[@class='Typeahead_results__y95O9 MedicineSearch_results__vsEUo MedicineSearch_results--withButton__dXPWq']/div/div"));
		Thread.sleep(3000);

		int count=autosearch.size();
		System.out.println(count);
		autosearch.get(5).click();

	}

}
