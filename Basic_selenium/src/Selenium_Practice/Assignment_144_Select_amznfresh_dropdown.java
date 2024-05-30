package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_144_Select_amznfresh_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement a=driver.findElement(By.id("nav-search-dropdown-card"));
	//	a.click();
		/*a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN);*/
	Select s=new Select(a);
	s.selectByVisibleText("Amazon fresh");

		
		
	}

}
