package Amazon_testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Login_out_Before_After_Methods {
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
	   WebElement acnt=driver.findElement(By.linkText("Sign in"));
		acnt.click();
	
		 WebElement email=driver.findElement(By.name("email"));
		   email.sendKeys("mahothree123@gmail.com");
		   WebElement cont=driver.findElement(By.id("continue"));
		  cont.click();
		  WebElement pswd=driver.findElement(By.id("ap_password"));
		  pswd.sendKeys("Chinna@09");
		  WebElement signin=driver.findElement(By.id("signInSubmit"));
		  signin.click();
		}	
	@AfterMethod
	void logout() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot a1=(TakesScreenshot) driver;
		File sshot=a1.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\selenium ss\\aa."+Math.random()+"png");
		FileHandler.copy(sshot, des);
		
		
		 WebElement acntsignout=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		 Actions a=new Actions(driver);
		 a.moveToElement(acntsignout).perform();
		 WebElement signout=driver.findElement(By.id("nav-item-signout"));
		 signout.click();
	}
}
