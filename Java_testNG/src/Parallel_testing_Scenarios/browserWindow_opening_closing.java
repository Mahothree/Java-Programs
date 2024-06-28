package Parallel_testing_Scenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class browserWindow_opening_closing {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	void Login(String Nofbrowser) {
		if(Nofbrowser.equals("edge")) {
		driver=new EdgeDriver();             
		}
		if(Nofbrowser.equals("chrome")) {
			driver=new ChromeDriver();
			}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void Closingapp() throws IOException {
		/*TakesScreenshot a1=(TakesScreenshot)driver;
		File a=a1.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\selenium ss\\scenarios."+Math.random()+"png");
		FileHandler.copy(a, des);
		*/
		//driver.quit();
		
		
	}
	

}
