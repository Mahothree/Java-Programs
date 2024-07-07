package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_169_Screenshotwithgetdate {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			EdgeDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			WebElement a=driver.findElement(By.name("q"));
			a.sendKeys("india");
			a.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Date d1=new Date();
			String d2=d1.toString();
			
			System.out.println(d2);
			String date=d2.substring(8,10);
			String month=d2.substring(4,7);
			String year=d2.substring(d2.length()-8);
			String curr=date.concat(" ").concat(month).concat(" ").concat(year);
			System.out.println("Current timeln"+d1);
			TakesScreenshot a1=driver;
			File source=a1.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\selenium ss\\withdate\\pic"+curr+".png");
			FileHandler.copy(source, des);

			

	}

}
