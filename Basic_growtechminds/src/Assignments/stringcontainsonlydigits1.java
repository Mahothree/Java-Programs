package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class stringcontainsonlydigits1 {

	static public int coa=0;
	static public int con=0;
	static public int cos=0;
	static public int cosc=0;
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter input=");
		String name=s1.next();
		char []c= name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<name.length();i++) {
			boolean nums=Character.isDigit(c[i]);
					
			if(nums==true)
			{
				con++;
			}
			
		}
		System.out.println("Count of digits-"+con);
		if(con==name.length()) {
		System.out.println("String contains only digits="+name);
		}
		else
			System.out.println("mixed string");
}
}
