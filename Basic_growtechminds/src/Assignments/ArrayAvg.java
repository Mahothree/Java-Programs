package Assignments;

import java.util.Scanner;

public class ArrayAvg {
	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array size");
		int a[]=new int[s1.nextInt()];
		System.out.println("Enter array Values");

		for(int i=0;i<a.length;i++) {
			System.out.println("Enter array value for index->"+i);

			a[i]=s1.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println("Average of given array="+sum/a.length);
	}

}
