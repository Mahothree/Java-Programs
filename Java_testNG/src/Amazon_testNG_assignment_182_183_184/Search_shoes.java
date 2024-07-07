package Amazon_testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search_shoes extends Login_out_Before_After_Methods{
	@Test
	void search() {
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
	}

}
