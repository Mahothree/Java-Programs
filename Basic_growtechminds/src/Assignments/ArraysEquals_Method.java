package Assignments;

import java.util.Scanner;

public class ArraysEquals_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String name[]=new String[s1.nextInt()];
		for(int i=0;i<name.length;i++)
		{
			name[i]=s1.next();
			System.out.println("Name of first input"+i+"="+name[i]);
			
		}
	}

}
