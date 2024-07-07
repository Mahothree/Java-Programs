package Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_175_Facebooklogin_exceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			// TODO Auto-generated method stub
			EdgeDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");

			FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Basic_selenium\\TestExcel\\facebooklogins.xlsx");
			Workbook wb=WorkbookFactory.create(f1);
			String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
			String pd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();

					/*Row r1=s1.getRow(0);
					Cell c1=	r1.getCell(0);
					String s2=c1.getStringCellValue();
					System.out.println(s2);*/
					WebElement uname=driver.findElement(By.id("email"));
					uname.sendKeys(un);
					WebElement pwd=driver.findElement(By.id("pass"));
					pwd.sendKeys(pd);
					
					WebElement login=driver.findElement(By.name("login"));
					login.click();

	}

}
