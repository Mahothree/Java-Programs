package Maven_Package.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_Tc {

	@Test
	public void testcaselogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Facebook_login fb=new Facebook_login(driver);
		fb.un();
		fb.pwd();
		fb.loginclick();
		
	}
	
}
