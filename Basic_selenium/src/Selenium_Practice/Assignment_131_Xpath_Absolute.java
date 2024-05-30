package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_131_Xpath_Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Testing/Assignments/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.xpath("(html/body/input)[1]"));
		uname.sendKeys("Mahothree");
		WebElement hint=driver.findElement(By.xpath("(html/body/input)[2]"));
		hint.sendKeys("Name");
		WebElement pwd=driver.findElement(By.xpath("(html/body/input)[3]"));
		pwd.sendKeys("Mahothree");
		WebElement fname=driver.findElement(By.xpath("(html/body/form/input)[1]"));
		fname.sendKeys("Mahothree");
		//WebElement submit=driver.findElement(By.xpath("(html/body/form/input)[3]"));
		//submit.click();
		
		WebElement boycb=driver.findElement(By.xpath("(html/body/form/input)[4]"));
		boycb.click();
		WebElement girlcb=driver.findElement(By.xpath("(html/body/form/input)[5]"));
		girlcb.click();
		WebElement baby=driver.findElement(By.xpath("(html/body/form/input)[6]"));
		baby.click();
		//WebElement submit1=driver.findElement(By.xpath("(html/body/form/input)[7]"));
		//submit1.click();
		WebElement male=driver.findElement(By.xpath("(html/body/input)[4]"));
		male.click();
		WebElement fmale=driver.findElement(By.xpath("(html/body/input)[5]"));
		fmale.click();
		WebElement loc=driver.findElement(By.xpath("(html/body/input)[6]"));
		loc.click();
		WebElement signin=driver.findElement(By.xpath("(html/body/input)[7]"));
		signin.click();
	}

}
