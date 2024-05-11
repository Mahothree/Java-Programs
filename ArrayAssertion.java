package Assignments;

import java.util.Scanner;

public class ArrayAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String a[]=new String[4];
	a[0]="anu";
	a[1]="mahi";
	a[2]="";
	a[3]="";

	for(int i=0;i<4;i++) {
		System.out.println("string at index->"+i);
		
		assert a[i].length()>0 :"String is empty";
		}

	}

}
