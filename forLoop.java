package Assignments;

public class forLoop {
	static void Number_100_TO_1()//using for loop to print 100 to 1
	{
		System.out.println("using for loop to print 100 to 1");
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
		
	}
	static void NegativeNumber_50_To_30()//print-50 to -30 using for loop
	{
		System.out.println("using for loop to print -50 to -30");
		for(int i=-50;i<=-30;i++)
		{
			System.out.println(i);
		}
		
	}
	static void Negative_positive()//Print -10 to +10
	{
		System.out.println("using for loop to print -10 to 10");
		for(int i=-10;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	static void Even_Odd_UsingIfElse()
	{
		for(int i=1;i<=100;i++) {
			
		
			if(i%2==0) 
			{
				System.out.println("Even Number: "+i);
			
			}
			else
			{
				System.out.println("odd Number:  "+i);
			}
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number_100_TO_1();
		//NegativeNumber_50_To_30();
		//Negative_positive();
		Even_Odd_UsingIfElse();

	}

}
