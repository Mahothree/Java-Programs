package Selenium_Practice;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_120_Scanner_switch {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		

		switch(s1.nextInt())
		{
		case 1:
			System.out.println("case 1");

			ChromeDriver driver1=new ChromeDriver();
			break;
			
		case 2:
			System.out.println("case 2");
			EdgeDriver driver2=new EdgeDriver();
			break;
		
		case 3:
			System.out.println("case 3");

			FirefoxDriver driver3=new FirefoxDriver();
			break;
			
			default:
		
			System.out.println("printing default message");
		}
		
	}

}
