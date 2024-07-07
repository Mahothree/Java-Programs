package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_148_Autosearchoption_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(5000);
		List<WebElement> autosug=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=autosug.size();
		System.out.println(count);
		autosug.get(4).click();
	}

}
