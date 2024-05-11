package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println("enter array size");
		String a[]=new String[s1.nextInt()];
		System.out.println("please enter string inputs");
		String copya[]=new String[a.length];
		System.out.println("String copy before"+Arrays.toString(copya));
		for(int j=0;j<a.length;j++) {
			a[j]=s1.next();

		}
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++)
		{
			copya[i]=a[i];
			
		}
		System.out.println("String COpy"+Arrays.toString(copya));

	}

}
