package Selenium_Practice;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_123_Launch_searchText_Click {

	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//title can be store in string vari12=driver.getTile();
		//System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
	}

}
