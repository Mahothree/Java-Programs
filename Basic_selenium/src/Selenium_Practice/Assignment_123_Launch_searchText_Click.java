package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_123_Launch_searchText_Click {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//title can be store in string vari12=driver.getTile();
		//System.out.println(driver.getTitle());
		WebElement a=driver.findElement(By.name("q"));
		a.sendKeys("india");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
	}

}
