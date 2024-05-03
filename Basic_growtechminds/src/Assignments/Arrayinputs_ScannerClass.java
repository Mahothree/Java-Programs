package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinputs_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]=new int[3];
		String names[]=new String[3];
		Scanner s1=new Scanner(System.in);
		System.out.println("Assignment 63");
		System.out.println("Names                 age");
		for(int i=0;i<3;i++) {
			names[i]=s1.next();
			age[i]=s1.nextInt();
			System.out.println(names[i]+"          "+age[i]);
			
		}
		System.out.println(Arrays.toString(names)+"     "+Arrays.toString(age));
		
	}

}
