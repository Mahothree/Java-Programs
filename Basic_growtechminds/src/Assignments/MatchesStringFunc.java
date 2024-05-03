package Assignments;

import java.util.Arrays;

public class MatchesStringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="my name is anu";
		System.out.println("Matches string starting with M=  "+a.matches("m(.*)"));
		
		System.out.println("Matches string ends with h=  "+a.matches("(.*)h"));
		
		System.out.println("Matches string of six char=  "+a.matches("......"));
		
		System.out.println(" string last index="  +a.lastIndexOf('s'));
		
		System.out.println("String repeat= "+a.repeat(4));
		
		String[] b=a.split(" ");
		System.out.println("String split ="+Arrays.toString(b));

		
	}

}
