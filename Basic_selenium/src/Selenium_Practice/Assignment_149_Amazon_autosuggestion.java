package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_149_Amazon_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		Thread.sleep(5000);
		List<WebElement> autosearch=driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		int count=autosearch.size();
		System.out.println(count);
		autosearch.get(4).click();
	}

}
