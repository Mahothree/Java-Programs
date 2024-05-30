package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_126_FacebookLogin_ID_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("mahothree123@gmail.com");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("Mahothree12@");
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//login.sendKeys(Keys.ENTER);


	}

}
