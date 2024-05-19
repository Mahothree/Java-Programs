package Selenium_Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class first_selenium extends Thread{

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		driver.get("https:\\www.google.com");
		System.out.println(driver.getWindowHandle()+"\n"+driver.getWindowHandles());
				
		driver.manage().window().maximize();
		try{Thread.sleep(5000);}
		catch(InterruptedException a) {}
		driver.close();
	}

}
