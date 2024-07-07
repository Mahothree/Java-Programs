package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_147_Isenable_displayed_selected_JSAM {

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
		WebElement lname=driver.findElement(By.xpath("(//input)[5]"));
		WebElement boycb=driver.findElement(By.xpath("(//input)[7]"));
		WebElement girlcb=driver.findElement(By.xpath("(//input)[8]"));
		WebElement baby=driver.findElement(By.xpath("(//input)[9]"));
		if(lname.isEnabled()&&lname.isSelected()) {
			lname.sendKeys("odepalli");
		System.out.println("disabled");
		}
		else if(boycb.isSelected()&&girlcb.isSelected()&&baby.isSelected()){
			System.out.println("Not selected");
		}
		else {
			boycb.click();
			girlcb.click();
			baby.click();
		}
		
	}

}
