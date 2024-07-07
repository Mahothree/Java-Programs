package Maven_Package.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {
	WebDriver driver;
	@FindBy(id="email")
	WebElement username;

	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name=\"login\"]")
	WebElement loginbtn;
	
	public void un() {
		username.sendKeys("Mahothree123@gmail.com");
	}
	public void pwd() {
		password.sendKeys("Mahothree12");
	}
	public void loginclick() {
		loginbtn.click();
	}

	//initialization each element using page factory class inside  the constructor
	public Facebook_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
