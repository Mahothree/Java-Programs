package Assignments;

import java.util.Scanner;

public class MKT_sannerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter inputs");
		Scanner s1=new Scanner(System.in);
				int n1=s1.nextInt();//next int
				System.out.println("nextint n1="+n1+"\nenter for byte=\n");
				byte n2=s1.nextByte();//next byte
				System.out.println("nextbyte="+n2+"\nenter for short\n");
				short n3=s1.nextShort();//short
				System.out.println("nextShort="+n3+"\nenter for long\n");
				long n4=s1.nextLong();//long
				System.out.println("nextint="+n1+"\nenter for boolean\n");
				boolean n5=s1.nextBoolean();//boolean
				System.out.println("nextboolean="+n5+"\nenter for string\n");
				String n6=s1.next();//string
				System.out.println("string="+n6+"\nenter for float\n");
				float n7=s1.nextFloat();//next float
				System.out.println("float="+n1+"\nenter for double\n");
				double n8=s1.nextDouble();//next double
				System.out.println("nextdouble="+n8);
				s1.close();
	}

}
