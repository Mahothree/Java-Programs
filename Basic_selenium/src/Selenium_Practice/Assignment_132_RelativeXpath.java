package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_132_RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Testing/Assignments/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.xpath("(//input)[1]"));
		uname.sendKeys("Mahothree");
		WebElement hint=driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("Name");
		WebElement pwd=driver.findElement(By.xpath("(//input)[3]"));
		pwd.sendKeys("Mahothree");
		WebElement fname=driver.findElement(By.xpath("(//input)[4]"));
		fname.sendKeys("Mahothree");
		//WebElement submit=driver.findElement(By.xpath("(//input)[6]"));
		//submit.click();
		
		WebElement boycb=driver.findElement(By.xpath("(//input)[7]"));
		boycb.click();
		WebElement girlcb=driver.findElement(By.xpath("(//input)[8]"));
		girlcb.click();
		WebElement baby=driver.findElement(By.xpath("(//input)[9]"));
		baby.click();
		//WebElement submit1=driver.findElement(By.xpath("(//input)[10]"));
		//submit1.click();
		WebElement male=driver.findElement(By.xpath("(//input)[11]"));
		male.click();
		WebElement fmale=driver.findElement(By.xpath("(//input)[12]"));
		fmale.click();
		WebElement loc=driver.findElement(By.xpath("(//input)[13]"));
		loc.click();
		WebElement signin=driver.findElement(By.xpath("(//input)[14]"));
		signin.click();
	}

}
