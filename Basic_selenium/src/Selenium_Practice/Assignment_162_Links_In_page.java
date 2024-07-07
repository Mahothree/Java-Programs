package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_162_Links_In_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> tag=driver.findElements(By.tagName("a"));
		int c=tag.size();
		System.out.println("count="+c);
		for(int i=0;i<c;i++) {
			WebElement url=tag.get(i);
			String s1=url.getAttribute("href");
			String txt=url.getText();
			System.out.println(s1+"/n"+txt);
		}
	}

}
