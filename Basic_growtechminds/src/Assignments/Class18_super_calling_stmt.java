package Assignments;
class parent_class1
{
	parent_class1()
	{
		System.out.println("Grand parent");
	}
	
}
class child_Class1 extends parent_class1
{
	child_Class1()
	{
		System.out.println("parent");

	}
}
public class Class18_super_calling_stmt extends child_Class1 {

	Class18_super_calling_stmt()
	{
		//super(); "Implicitly" by default it is present and we can also written it explicitly
		System.out.println("child");
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		new Class18_super_calling_stmt();
	}

}
