package Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_noofdropdownoptions {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		Actions a=new Actions(driver);
		a.moveToElement(sign).perform();
		WebElement signbtn=driver.findElement(By.cssSelector("a[class=\"nav-action-signin-button\"]"));
		signbtn.click();
		Set<String> wid=driver.getWindowHandles();
		System.out.println(wid);
		Iterator<String> i=wid.iterator();
		String w1=i.next();
		String w2=i.next();
		driver.switchTo().window(w2);
		WebElement email=driver.findElement(By.cssSelector("input[id=\"ap_email\"]"));
		FileInputStream f1=new FileInputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Basic_selenium\\\\TestExcel\\\\Practice.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		Sheet s1=wb.getSheet("login");	}

}
