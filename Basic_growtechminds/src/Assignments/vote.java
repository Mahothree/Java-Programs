package Assignments;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter age and gender(M/F)");
		int age=s1.nextInt();
		String gender=s1.next();
		if(age==18 && gender=="F") 
			{
			
				System.out.println("You can vote");
			
		}
		else
			System.out.println("you cannot vote");
		
	}

}
