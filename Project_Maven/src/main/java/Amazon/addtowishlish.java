package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtowishlish {
	WebDriver driver;
	@FindBy(id="wishListMainButton")
	WebElement wishlistbtn;
	
	
	public void wishlist() {
		wishlistbtn.click();
	}
	public addtowishlish(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
