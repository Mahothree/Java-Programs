package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_128_Amazon_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		
		WebElement fname=driver.findElement(By.name("customerName"));
		fname.sendKeys("Mahothree");

		WebElement pno=driver.findElement(By.id("ap_phone_number"));
		pno.sendKeys("9849859883");
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Mahi@12");
		
		WebElement verifymbl=driver.findElement(By.id("continue"));
		verifymbl.click();
	}

}
