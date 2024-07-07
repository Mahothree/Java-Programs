package Selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_Screenshot_Mathrandomname {

	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement a=driver.findElement(By.name("q"));
		a.sendKeys("india");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		for(int i=1;i<10;i++) {
		TakesScreenshot a1=driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\selenium ss\\pic"+Math.random()+".png");
		FileHandler.copy(source, des);

		}
	}

}
