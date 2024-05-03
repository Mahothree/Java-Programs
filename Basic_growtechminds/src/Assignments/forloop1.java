package Assignments;

import java.util.Scanner;

public class forloop1 {
public static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
int a[]=new int[4];
System.out.println("enter numbers to add");
for(int i=0;i<a.length;i++) {
	a[i]=s1.nextInt();
	sum=sum+a[i];
}
System.out.println("sum of numbers="+sum);


		
	}

}
