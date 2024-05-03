package Assignments;

import java.util.Scanner;

public class Remove_O_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String ip1=s1.next();
		String a=ip1.replace('o',' ');
		System.out.println("\nAssignment 77");
		System.out.println("Replace string with o Alphabet="+a);
		System.out.println("\nAssignment 78");
		System.out.println("Replace 'O'letters with 'm'in string="+ip1.replace('o', 'm'));
		System.out.println("\nAssignment 79");
		System.out.println("\nRemove numerics in string="+ip1.replaceAll("[0-9]", ""));
		System.out.println("\nRemove Capitals="+ip1.replaceAll("[A-Z]", ""));;
		System.out.println("\nRemove small letters="+ip1.replaceAll("[a-z]", ""));


		
	}

}
