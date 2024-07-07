package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("(//a[@class=\"login_button\"])[1]"));
		login.click();
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("Mahothree");
		WebElement psd=driver.findElement(By.name("password"));
		psd.sendKeys("Mahothree");
 
		WebElement captch=driver.findElement(By.name("loginCaptchaValue"));
		captch.sendKeys("captch");
	}

}
