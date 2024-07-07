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

public class Assignment_168_Takescreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//title can be store in string vari12=driver.getTile();
		//System.out.println(driver.getTitle());
		WebElement a=driver.findElement(By.name("q"));
		a.sendKeys("india");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TakesScreenshot a1=driver;
		File s=a1.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\selenium ss\\aa.png");
		FileHandler.copy(s, des);
		

	}

}
