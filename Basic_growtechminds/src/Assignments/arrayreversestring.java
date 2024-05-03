package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class arrayreversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		String a[]=new String[3];
		a[0]="aaa";
		a[1]="bbb";
		a[2]="ccc";
		String b[]=new String[a.length];
		String c[]=new String[a.length];
		System.out.println("String copy before"+Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
				
			}
		for(int j=a.length-1;j>=0;j--) {
			c[j]=a[k];
			k++;
		}
		
		System.out.println("a"+Arrays.toString(a));
		System.out.println("b"+Arrays.toString(b));
		System.out.println("c"+Arrays.toString(c));

		
	}

}
