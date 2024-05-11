package Assignments;

public class StringFunction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input2="";
		String input="priya";
		String input3="priya madhuri";

		
		//char a1=input.charAt(0);
		//System.out.println(a1);))
		System.out.println("Assignment 56");

	for (int i=0;i<input.length();i++) {
		char a=input.charAt(i);
		System.out.println(a);
		
	}
	System.out.println("Reverese of string:Assignment 57");
	for (int j=input.length()-1;j>=0;j--) {
		char a1=input.charAt(j);
		System.out.println(a1);
		
	}
	System.out.println("Assignment 58 ::isempty string function="+input.isEmpty());
	System.out.println(input2.isEmpty());
	
	System.out.println("Assignment 59::Substring::"+input3.substring(0, 5));
	System.out.println("Substring2::"+input3.substring(5, input3.length()));

	}

}
