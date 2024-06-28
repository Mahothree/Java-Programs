import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_searching_Logout {
	WebDriver driver;
	@BeforeSuite
	void Bsuite() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	void btest() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	void bclass() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	void bmethod() {

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	   WebElement acnt=driver.findElement(By.linkText("Sign in"));
		acnt.click();
	
		 WebElement email=driver.findElement(By.name("email"));
		   email.sendKeys("mahothree123@gmail.com");
		   WebElement cont=driver.findElement(By.id("continue"));
		  cont.click();
		  WebElement pswd=driver.findElement(By.id("ap_password"));
		  pswd.sendKeys("Chinna@09");
		  WebElement signin=driver.findElement(By.id("signInSubmit"));
		  signin.click();
	}
	@Test
	void add() {
		System.out.println(20+30);
	}
	@Test
	void login_searching() {
		System.out.println(20);
	}
	@Test
	void login_searching_logout() {
		System.out.println(20);
	}
	@AfterSuite
	void asuite() {
		System.out.println("@AfterSuite");
	}
	@AfterTest
	void atest() {
		System.out.println("@AfterTest");
	}
	@AfterClass
	void aclass() {
		System.out.println("@AfterClass");
	}
	@AfterMethod
	void amethod() {
		System.out.println("@AfterMethod");
	}
}



