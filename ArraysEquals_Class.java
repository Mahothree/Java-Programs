package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEquals_Class {

	public static void main(String[] args) {
		
				int age[]=new int[3];
				int rollno[]=new int[3];
				String fname[]=new String[3];
				String lname[]=new String[3];
				Scanner s1=new Scanner(System.in);
				System.out.println("FirstName   LastName       age     RollNo    ");
				for(int i=0;i<3;i++) {
					System.out.println("Please enter all the details for person="+i);
					fname[i]=s1.next();
					lname[i]=s1.next();
					age[i]=s1.nextInt();
					rollno[i]=s1.nextInt();
				//	System.out.println(names[i]+"          "+age[i]);
					
				}
				System.out.println(Arrays.toString(fname)+"   "+Arrays.toString(lname)+"  "+Arrays.toString(age)+"   "+Arrays.toString(rollno));
				System.out.println("Arrays.equals for int="+Arrays.equals(age, rollno));
				//two strings equal
				System.out.println("Arrays.equals for String="+Arrays.equals(fname, lname));
				

			}

		

	}
//https://git-scm.com/downloads

