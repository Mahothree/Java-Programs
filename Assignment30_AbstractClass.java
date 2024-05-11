package Assignments;

abstract class oneMethod
{
	abstract void child();
	//abstract method don't have implementation
	abstract void child1();
}
public class Assignment30_AbstractClass extends oneMethod 
{
	
void child()
{
	System.out.println("child method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30_AbstractClass a=new Assignment30_AbstractClass();
		a.child();
		a.child1();

	}
	@Override
	void child1() {
		// TODO Auto-generated method stub
		System.out.println("Child1");
	}

}
