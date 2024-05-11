package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		System.out.println("Assignment 75");

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first word");
		String a=s1.next();
		System.out.println("Enter second word");
		String b=s1.next();
		char c1[]=a.toCharArray();
		char c2[]=b.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Both words are not Anagram");
		s1.close();
				
	}

}
