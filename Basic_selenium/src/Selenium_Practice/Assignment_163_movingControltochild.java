package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_163_movingControltochild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.cssSelector("input[name=\"field-keywords\"]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoe1=driver.findElement(By.xpath("(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"])[1]"));
		shoe1.click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> i1=s.iterator();
		String s1=i1.next();
		String s2=i1.next();
		driver.switchTo().window(s2);
		WebElement buynow=driver.findElement(By.cssSelector("#buy-now-button"));
		buynow.click();
		WebElement email=driver.findElement(By.cssSelector("input[name=\"email\"]"));
		email.sendKeys("Mahothree123@gmail.com");
		WebElement cont=driver.findElement(By.cssSelector("#continue"));
		cont.click();
		WebElement pswd=driver.findElement(By.cssSelector("#ap_password"));
		pswd.sendKeys("Chinna@321");
		pswd.click();
		WebElement signin=driver.findElement(By.cssSelector("#signInSubmit"));
		signin.click();
		WebElement auth=driver.findElement(By.cssSelector("#auth-mfa-otpcode"));
		auth.sendKeys("332848");
	WebElement authsign=driver.findElement(By.cssSelector("#auth-signin-button"));
		authsign.click();
	}

}
