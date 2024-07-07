package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product {
	WebDriver driver;
	@FindBy(xpath="(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"])[1]")
	WebElement prdt1;

	public void product() {
		prdt1.click();
	}
	
	public Amazon_product(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
