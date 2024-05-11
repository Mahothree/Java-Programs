package Assignments;


	
	
class firstClass
{
	static void C1()
	{
		System.out.println("Concrete method 1");
	}
	static void c2()
	{
		System.out.println("Concrete method 2");

	}
}
abstract class secondClass extends firstClass
{
	static void c3()
	{
		System.out.println("Concrete method 3");

	}
	static void c4()
	{
		System.out.println("Concrete method 4");

	}
	abstract void abstractmethod();
	abstract void abstractmethod2();

	
}
public class abstractclass1 extends secondClass{
	static void childMethod3()
	{
		System.out.println("child class method 1");

	}
	static void childMethod2()
	{
		System.out.println("childclass method 2");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclass1 a= new abstractclass1();
		a.C1();
		a.c2();
		a.c3();
		a.c4();
		a.abstractmethod();
		a.abstractmethod2();
	}
	@Override
	void abstractmethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract  implimented method");
	}
	@Override
	void abstractmethod2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract  implimented method2");

	}

}
