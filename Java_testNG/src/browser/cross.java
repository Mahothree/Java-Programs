package browser;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {
	WebDriver driver;

	@Test
	@Parameters("browser")
	void amazonlogin(String Nofbrowser) throws IOException {
	
	if(Nofbrowser.equals("edge")) {
		driver=new EdgeDriver();             
		}
		if(Nofbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		} 
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.name("field-keywords")).sendKeys("camera");
	driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
}

}
