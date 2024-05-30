package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_145_acntHoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement acnt=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions a=new Actions(driver);
		
		a.moveToElement(acnt).perform();

	}

}
