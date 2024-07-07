package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login_src {
	WebDriver driver;
	//Locating each element in a page
	@FindBy(name="email")
	WebElement emailname;
	
	@FindBy(id="continue")
	WebElement cont;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;
	//Creating method for each element of page
	
	public void email_TB()
	{
		emailname.sendKeys("mahothree123@gmail.com");
	}
	public void cont_btn()
	{
		cont.click();
	}
	public void pwd_TB()
	{
		pwd.sendKeys("Chinna@09");
	}
	public void signin_btn()
	{
		signinbtn.click();
	}
	
	//Initializing each element using pageFactory clss inside a constructor
	
	public Amazon_login_src(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	 

}
