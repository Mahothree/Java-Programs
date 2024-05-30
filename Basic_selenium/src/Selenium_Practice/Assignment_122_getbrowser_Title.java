package Selenium_Practice;

import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_122_getbrowser_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//title can be store in string var=driver.getTile();
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("btnK")).click();

	}

}
