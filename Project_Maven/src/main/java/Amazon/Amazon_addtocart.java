package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_addtocart {
	WebDriver driver;
	@FindBy(css="#add-to-cart-button")
	WebElement addtocart;
	
	public void cart()
	{
		addtocart.click();
	}
	public Amazon_addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

}
