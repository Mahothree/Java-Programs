package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_141_Drag_and_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("(//div[@id=\"container\"])[4]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"div2\"]"));

		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(drop, drag).perform();
		
	}

}
