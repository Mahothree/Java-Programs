package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class coa_Scanner {
	static public int coa=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[3];
		Scanner s1=new Scanner(System.in);
		System.out.println("Names");
		for(int i=0;i<3;i++) 
		{
				names[i]=s1.next();
				System.out.println(names[i]);
				char []c= names[i].toCharArray();
				System.out.println(Arrays.toString(c));
				for(int j=0;i<names.length-1;j++) {

					boolean anws=Character.isAlphabetic(c[i]);
					if(anws==true) 
					{
					coa++;
			
					}
				}
				
				System.out.println("Count of alphabets-"+coa);	
		}
		
		
	}
}


