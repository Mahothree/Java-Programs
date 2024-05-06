package Assignments;
class parent_class1
{
	parent_class1(int i)
	{
		System.out.println("Grand parent"+i);
	}
	
}
class child_Class1 extends parent_class1
{
	child_Class1()
	{
		super(10);//explicit Super calling stmt
		System.out.println("parent");

	}
}
public class Assignment33_super_calling_stmt extends child_Class1 {

	Assignment33_super_calling_stmt()
	{
		super();// "Implicitly" by default it is present and we can also written it explicitly
		System.out.println("child");
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		new Assignment33_super_calling_stmt();
	}

}
