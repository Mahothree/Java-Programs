package Assignments;

import java.util.Scanner;

public class Arraywith41Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ip[]=new int[3];
		System.out.println("Assignment 74::check given no is present in array");
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number to be verified");
		int ip2=s1.nextInt();
		
		System.out.println("enter array list");

		for(int i=0;i<3;i++) {
			ip[i]=s1.nextInt();
			
		}
		for(int j=0;j<3;j++) {
		if(ip2==ip[j])
		{
			System.out.println("Number to be validated is present "+ip2);
		
		}
		}
		
		s1.close();
}
}