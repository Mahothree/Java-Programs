package Assignments;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String ip1=s1.next();
		String ip=ip1.toLowerCase();
		String revip="";
		for(int i=ip.length()-1;i>=0;i--) 
		{
			char op=ip.charAt(i);
			revip=revip+op;
		}
		if(ip.equals(revip)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not palindrome");
		s1.close();
	}

}
