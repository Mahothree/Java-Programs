package Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment_datafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Basic_selenium\\TestExcel\\Practice.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		Sheet s1=wb.getSheet("login");
				Row r1=s1.getRow(0);
				Cell c1=	r1.getCell(0);
				String s2=c1.getStringCellValue();
				System.out.println(s2);
		

	}

}
