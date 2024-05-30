package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_139_hoverover_growtechminds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/hoverover");
		driver.manage().window().maximize();
		/*//first ques
		WebElement dropdown1=driver.findElement(By.xpath("(//div[@class=\"toolrip4\"])[1]"));
		Actions hover=new Actions(driver);
		hover.moveToElement(dropdown1).perform();
		WebElement prac3=driver.findElement(By.xpath("(//div[@onclick=\"myFunction4()\"])[3]"));
		prac3.click();
		//second ques
		WebElement dropdown2=driver.findElement(By.xpath("(//div[@class='toolrip6'])"));
		Actions hover1=new Actions(driver);
		hover1.moveToElement(dropdown2).perform();
		WebElement prac10=driver.findElement(By.xpath("//div[@class=\"popup6\"][10]"));
		prac10.click(); 
		third ques demo5 
				WebElement dropdown3=driver.findElement(By.xpath("//div[@class=\"toolrip7\"]"));
				Actions hover3=new Actions(driver);
				hover3.moveToElement(dropdown3).perform();
				WebElement prac1=driver.findElement(By.xpath("(//div[@class=\"popup7\"])[1]"));
				prac1.click();
				//four ques demo2 practice 6
				WebElement dropdown4=driver.findElement(By.xpath("(//div[@class=\"toolrip4\"])[2]"));
				Actions hover4=new Actions(driver);
				hover4.moveToElement(dropdown4).perform();
				WebElement prac6=driver.findElement(By.xpath("(//div[@class=\"popup4\"])[16]"));
				prac6.click();
				//four ques demo2 
				WebElement dropdown5=driver.findElement(By.xpath("(//div[@class=\"toolrip4\"])[2]"));
				Actions hover5=new Actions(driver);
				hover5.moveToElement(dropdown5).perform();
				WebElement prac8=driver.findElement(By.xpath("(//div[@class=\"popup4\"])[18]"));
				prac8.click();*/
				//four ques demo2 
				WebElement dropdown6=driver.findElement(By.xpath("(//div[@class=\"toolrip4\"])[2]"));
				Actions hover6=new Actions(driver);
				hover6.moveToElement(dropdown6).perform();
				WebElement prac9=driver.findElement(By.xpath("(//div[@class=\"popup4\"])[19]"));
				prac9.click();

	}

}
