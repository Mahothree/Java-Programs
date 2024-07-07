package Amazon_TestCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon.Amazon_login_src;
import Amazon.Amazon_searching;

public class Login_TC {

	@Test
	public void login_amzn() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Amazon_login_src Al=new Amazon_login_src(driver);
		Al.email_TB();
		Al.cont_btn();
		Al.pwd_TB();
		Al.signin_btn();
		Assert.assertEquals("Login failed","Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",driver.getTitle());
		Amazon_searching s1=new Amazon_searching(driver);
		s1.searching();
		Assert.assertEquals("shoe search failed","Amazon.in : shoe",driver.getTitle());

		
	}
}
