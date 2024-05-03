package Assignments;

import java.util.Date;

public class Dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignment 61::program on DATE calss");
		Date d1=new Date();
		String d2=d1.toString();
		System.out.println(d2);
		String date=d2.substring(8,10);
		String month=d2.substring(4,7);
		String year=d2.substring(d2.length()-4);
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		System.out.println("**********************************");

		
	}

}
