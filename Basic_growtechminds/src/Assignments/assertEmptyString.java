package Assignments;

import java.util.Scanner;

public class assertEmptyString {

	public static void main(String[] args) {
		
		String a="";
		
		assert a.length()>0 :"String is empty";
		
		System.out.println(a.concat("anu"));
	}

}
