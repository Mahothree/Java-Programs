package Amazon_TestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon.AddressSel_proceedtobuy;
import Amazon.Amazon_addtocart;
import Amazon.Amazon_login_src;
import Amazon.Amazon_product;
import Amazon.Amazon_searching;
import Amazon.addtowishlish;

public class Address_selection_Proceedtobuy {
	@Test
	
	public void Deliveryaddress() {
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

		Amazon_product p1=new Amazon_product(driver);
		p1.product();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> i1=s.iterator();
		String win1=i1.next();
		String win2=i1.next();
		System.out.println(win1+","+win2);
		driver.switchTo().window(win2);
		addtowishlish wish=new addtowishlish(driver);
		wish.wishlist();
		WebElement viewwl=driver.findElement(By.xpath("//span[@id=\"huc-view-your-list-button\"]/span"));
		Assert.assertTrue(viewwl.isDisplayed());
		WebElement wlpopupclose=driver.findElement(By.xpath("//button[@class=\" a-button-close a-declarative\"]/i"));
		wlpopupclose.click();
		Amazon_addtocart cart=new Amazon_addtocart(driver);
		cart.cart();
		WebElement cout=driver.findElement(By.name("proceedToRetailCheckout"));
		Assert.assertTrue(cout.isDisplayed());
		cout.click();
		AddressSel_proceedtobuy Address=new AddressSel_proceedtobuy(driver);
		Address.adress();
		WebElement order=driver.findElement(By.xpath("//span[.='Order Total:']"));
		Assert.assertTrue(order.isDisplayed());


			
	}

}
