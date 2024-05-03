package Assignments;

public class order {

	order()
	{
		System.out.println("contructor");
	}
	
	static
	{
		System.out.println("SIB");

	}
	static
	{
		System.out.println("SIB 2");

	}
	{
		System.out.println("IIB");

	}
	{
		System.out.println("IIB 2");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAin method");
		order o1=new order();
		order o2=new order();
		order o3=new order();


	}

}
