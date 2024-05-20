package Selenium_Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_119_SwitchCase_openingbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(1)
		{
		case 1:
			ChromeDriver driver1=new ChromeDriver();
			break;
			
		case 2:
			EdgeDriver driver2=new EdgeDriver();
			break;

			
		case 3:
			FirefoxDriver driver3=new FirefoxDriver();
			break;
			
		default:
		{
			System.out.println("printing default message");
		}
			

			
		}

	}

}
