package Assignments;

import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class try_MultipleCatches {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter array size");
				int n1= s1.nextInt();
				String name[]= new String[n1];
				
			
				try
				{
				name[0]="Ram";
				name[1]="Sita";
				name[2]="Laxman";
				name[3]="Hanuman";
				}
				catch(ArrayIndexOutOfBoundsException a)
				{
					System.out.println("Please enter correct array num");
				}
				catch(InputMismatchException b)
				{
					System.out.println("Please enter correct input");
				}
				
	
	
	}

}
