package Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_searching {

	WebDriver driver;
	@FindBy(name="field-keywords")
	WebElement search;
	
	public void searching() {
		search.sendKeys("shoe"+Keys.ENTER);
	}
	
	public Amazon_searching(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}


