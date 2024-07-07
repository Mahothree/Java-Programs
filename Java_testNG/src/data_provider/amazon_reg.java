package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebook_reg {
WebDriver driver;
		
	@DataProvider(name="login")
	
	public Object[][] login(){
		
		Object d1[][]=new Object[2][3];
		d1[0][0]="Mahothree";
		d1[0][1]="98787877";
		d1[0][2]="numhj";
		
				
		d1[1][0]="Anu";
		d1[1][1]="987872877";
		d1[1][2]="iun";
		
		
		return d1;
		
		}
		
	@Test(dataProvider="login")
	
		public void loginfacebook(String cname,String pno1,String pwd1) {
		 driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		
		WebElement fname=driver.findElement(By.name("customerName"));
		fname.sendKeys(cname);

		WebElement pno=driver.findElement(By.id("ap_phone_number"));
		pno.sendKeys(pno1);
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys(pwd1);
		
		WebElement verifymbl=driver.findElement(By.id("continue"));
		verifymbl.click();
		
	}
}
