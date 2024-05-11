package Assignments;

import java.util.Scanner;

public class Assignment_24_Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=9;
		int c=10;
		int d=10;
		if(a>b&&a==c)
		{
			System.out.println("Logical && opertor");
		}
		if(a==b||a==d)
		{
			System.out.println("Logical Or '||' operator");
		}
		if(!!(a>b)) {
			System.out.println("Logical Not operator");
		}
		
	}

}
