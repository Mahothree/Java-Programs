package Assignments;

public class if_Else_If {

public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	System.out.println("Program to print ticket price based on value passed for gender");

		char genderperson1='M';
		char genderperson2='F';
		//char genderperson3='C';
		char validator='M';

		if(validator==genderperson1)
		{
			System.out.println("Male:ticket price 50 rupees");
		}
		else if(validator==genderperson2)
		{
			System.out.println("Female :ticket price 40 rupees");
		}
		else
		{
			System.out.println("Custom :ticket price 30 rupees");
		}

}
}