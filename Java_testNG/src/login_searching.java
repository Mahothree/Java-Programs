import java.io.File;
import java.io.IOException;
import java.time.Duration;
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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login_searching {
	WebDriver driver;

	@Test
	@Parameters("browser")
	void amazonlogin(String Nofbrowser) throws IOException {
	
	if(Nofbrowser.equals("Edge")) {
		driver=new EdgeDriver();             
		}
		if(Nofbrowser.equals("Chrome")) {
			driver=new ChromeDriver();
		} 
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("google"));
		
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
	  
	  
	  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	  search.sendKeys("shoes");
	  search.sendKeys(Keys.ENTER);
	  
	  
	  WebElement shoe1=driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-base a-text-center\"])[1]"));
	  shoe1.click();
	  
	  Set<String> s=driver.getWindowHandles();
		Iterator<String> i=s.iterator();
		String w1=i.next();
		String w2=i.next();
		System.out.println(w1+","+w2);
		
		driver.switchTo().window(w2);
		
	  
	  WebElement addtocart=driver.findElement(By.cssSelector("#add-to-cart-button"));
	 addtocart.click();
	 
	 WebElement gotocart=driver.findElement(By.xpath("//span[@class=\"a-button a-spacing-top-base a-button-span12 a-button-base celwidget\"]/span"));
	 gotocart.click();
	 
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
