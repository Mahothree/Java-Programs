package Assignments;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*using Math.random need to get the radius of 10 circles and need to find area of each circle*/
		for (int i=1;i<=10;i++)
		{
			double a=Math.random();
			System.out.println("\nMath random number="+a);
			System.out.println("Area of circle= "+(Math.PI*a*a));
		}
	}

}
