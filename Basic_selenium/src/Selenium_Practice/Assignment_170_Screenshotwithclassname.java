package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_170_Screenshotwithclassname {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Assignment_170_Screenshotwithclassname m=new Assignment_170_Screenshotwithclassname();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement a=driver.findElement(By.name("q"));
		a.sendKeys("india");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TakesScreenshot a1=driver;
		File s=a1.getScreenshotAs(OutputType.FILE);
		File des=new File("c:\\Users\\DELL\\OneDrive\\Desktop\\selenium ss\\aa"+m.getClass()+".png");
		FileHandler.copy(s, des);

	}

}
