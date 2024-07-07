package Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment_177_Amazon_Login {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Basic_selenium\\TestExcel\\facebooklogins.xlsx");
			Workbook wb=WorkbookFactory.create(f1);
			String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
			String pd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
			
		 
		
			 WebElement email=driver.findElement(By.name("email"));
			   email.sendKeys(un);
			   WebElement cont=driver.findElement(By.id("continue"));
			  cont.click();
			  WebElement pswd=driver.findElement(By.id("ap_password"));
			  pswd.sendKeys(pd);
			  WebElement signin=driver.findElement(By.id("signInSubmit"));
			  signin.click();
			  
			  
			  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			  search.sendKeys("shoes");
			  search.sendKeys(Keys.ENTER);
			  
			  
			  WebElement shoe1=driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-base a-text-center\"])[1]"));
			  shoe1.click();
			  
			  Set<String> s=driver.getWindowHandles();
				Iterator<String> i=s.iterator();
				String w1=i.next();
				String w2=i.next();
				System.out.println(w1+","+w2);
				
				driver.switchTo().window(w2);
				
			  
			  WebElement addtocart=driver.findElement(By.cssSelector("#add-to-cart-button"));
			 addtocart.click();
			 
			 WebElement gotocart=driver.findElement(By.xpath("//span[@class=\"a-button a-spacing-top-base a-button-span12 a-button-base celwidget\"]/span"));
			 gotocart.click();
			 
			 WebElement acntsignout=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
			 Actions a=new Actions(driver);
			 a.moveToElement(acntsignout).perform();
			 WebElement signout=driver.findElement(By.id("nav-item-signout"));
			 signout.click();
			
			 
		

	}

}
