package Selenium_Practice;

import java.util.Scanner;

public class Assignment_116_StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter a string");
		StringBuffer s3=new StringBuffer(s2.next());
		s3.ensureCapacity(2);
		System.out.println("Append="+s3.append(" added string"));
		System.out.println("insert="+s3.insert(2, " inserted string at 2 "));
		System.out.println("replace= "+s3.replace(4, 6, "replaced"));
		System.out.println("delete 2 to 4= "+s3.delete(2, 4));
		System.out.println("Reverse= "+s3.reverse());
		System.out.println("Capacity= "+s3.capacity());
		System.out.println("Ensure capacity="+s3.charAt(5));
		System.out.println("length= "+s3.length());
		System.out.println("sub string= "+s3.substring(4, 6));
		
		
	}

}
