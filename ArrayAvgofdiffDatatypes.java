package Assignments;

import java.util.Scanner;

public class ArrayAvgofdiffDatatypes {
	static public double sum=0;
	public static void main(String[] args) {


		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array size of a");
		int a[]=new int[s1.nextInt()];
		System.out.println("Enter array size of b");
		double b[]=new double[s1.nextInt()];
		System.out.println("Enter array Values");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter array value for index a->"+i);
			System.out.println("Enter array value for index b->"+i);
			
			a[i]=s1.nextInt();
			b[i]=s1.nextDouble();
			sum=sum+a[i]+b[i];
			
		}
		System.out.println("Average of given array="+sum/(a.length+b.length));
	}

}
