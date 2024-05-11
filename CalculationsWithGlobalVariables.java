package Assignments;

public class CalculationsWithGlobalVariables {
static int a=2;
static int b=3;
	void add()
	{
		System.out.println("Addition using global declared &initialized Varibale="+a+b);

	}
	void sub()
	{
		System.out.println("Substraction using global declared &initialized Varibale="+(a-b));
	}
	void mul()
	{
		System.out.println("Multiplication using global declared &initialized Varibale="+a*b);

	}
	void div()
	{
		System.out.println("Division using global declared &initialized Varibale="+a/b);

	}
	void mod()
	{
		System.out.println("Modulus using global declared &initialized Varibale="+a%b);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationsWithGlobalVariables n=new CalculationsWithGlobalVariables();
		n.add();
		n.sub();
		n.mul();
		n.div();
		n.mod();
	}

}
