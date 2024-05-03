package Assignments;

public class doubletoInt_Assignment101_102_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		int a=(int) pi;
		System.out.println("double"+pi+"\nint="+a);
		//convert byte b=82 into long--Assignment 101
		byte b=82;
		long c=(long) b;
		System.out.println("byte into long="+b+"\nlong="+c);
		c=1000;
		System.out.println("Assignment 101\nconvert byte to long and update valuec="+c);
		//convert long to byte-Assignment 102
		byte d=(byte) c;
		System.out.println("Assignment 102\nconvert long to byte d="+c+"\nconverted long to byte="+d);
		//Assignment 103 convert int to float data type
		float f=(float) a;
		System.out.println("Assignment 103\nconvert int to float="+f);
	}

}
