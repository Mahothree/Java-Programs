package Assignments;

public class if_Else_If {

public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	System.out.println("Program to print ticket price based on value passed for gender");
		int i=1;
		
		char genderperson1='M';
		char genderperson2='F';
		//char genderperson3='C';
		char validator='M';
		//if block Assignment 20
		if(i==1)
		{
			System.out.println("if condition");
		}
		//if-else block Assignment 21

		if(validator==genderperson1)
		{
			System.out.println("Male:ticket price 50 rupees");
		}
		else if(validator==genderperson2)//if else if block Assignment 22
		{
			System.out.println("Female :ticket price 40 rupees");
		}
		else
		{
			System.out.println("Custom :ticket price 30 rupees");
		}
		//Nested if Assignment 23
		if(i>0)
		{
			if(validator=='M')
			{
				System.out.println("Nested if");
				
			}
		}
}
}