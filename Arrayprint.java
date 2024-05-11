package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array values of size 3");
		
		String a[]=new String[3];
		for(int i=0;i<3;i++) {
			a[i]=s1.next();
		}
		System.out.println("Array.tostring values="+Arrays.toString(a));
		s1.close();
	}

}
