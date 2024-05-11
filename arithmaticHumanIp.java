package Assignments;

import java.util.Scanner;

public class arithmaticHumanIp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter input for a and b");

		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		

		System.out.println("Add="+a+b);
		System.out.println("sub="+(a-b));
		System.out.println("div="+a/b);
		System.out.println("mul="+a*b);
		System.out.println("mod="+a%b);

		s1.close();
		
		
	}

}
