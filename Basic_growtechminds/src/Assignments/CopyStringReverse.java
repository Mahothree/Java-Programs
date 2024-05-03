package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class CopyStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter array size");
		String a[]=new String[s1.nextInt()];
		System.out.println("please enter string inputs");
		String b[]=new String[a.length];
		String c[]=new String[a.length];
		for(int l=0;l<a.length;l++) {
		a[l]=s1.next();
		}
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
				
			}
		for(int j=a.length-1;j>=0;j--) {
			c[j]=a[k];
			k++;
		}
		System.out.println("input array"+Arrays.toString(a));
		
		System.out.println("copied array"+Arrays.toString(b));
		
		System.out.println("String  COpy reverse"+Arrays.toString(c));

		s1.close();

	
	}
}
