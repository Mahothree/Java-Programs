package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_127_Facebook_Register_UsingName_ID_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		//createnewacnt.sendKeys(Keys.ENTER);
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Mahothree");

		WebElement sname=driver.findElement(By.name("lastname"));
		sname.sendKeys("odepalli");

		WebElement mblemail=driver.findElement(By.name("reg_email__"));
		mblemail.sendKeys("mahothree123@gmail.com");
		
		
		WebElement npwd=driver.findElement(By.id("password_step_input"));
		npwd.sendKeys("Mahothree@12");

		WebElement GenderF=driver.findElement(By.name("sex"));
		GenderF.click();
	//used link text as click not working with id/name
		WebElement Signupbtn=driver.findElement(By.linkText("Sign Up"));
		Signupbtn.click();
		


		
		
	}

}
