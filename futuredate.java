package Assignments;

import java.util.Date;

public class futuredate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Assignment 60::program on DATE calss with past, future and present time");
		/*Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		Date d3=new Date(d1.getTime());
		System.out.println(d3);
		*/
		Date d1=new Date();
		System.out.println("Current timeln"+d1);
		System.out.println("epoch timeln"+d1.getTime());//d1.gettime-to get epoch time
		Date d2=new Date(d1.getTime()+(60*60*1000*24*3));
		System.out.println("Future date="+d2);
		Date d3=new Date(d1.getTime()-(60*60*1000*24*3));
		System.out.println("Past  date="+d3);

	}

}
