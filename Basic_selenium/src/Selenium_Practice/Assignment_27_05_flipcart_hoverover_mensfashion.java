package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_27_05_flipcart_hoverover_mensfashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fshns=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
		Actions a=new Actions(driver);
		
		a.moveToElement(fshns);
		
		

	}

}
