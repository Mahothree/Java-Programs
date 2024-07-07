package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressSel_proceedtobuy {
	WebDriver driver;
	@FindBy(xpath="//div[@class=\"a-row address-row list-address-selected\"]/span/div/label/input")
	WebElement addr;
	
	public void adress() {
		addr.click();
	}
	public AddressSel_proceedtobuy(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
}
