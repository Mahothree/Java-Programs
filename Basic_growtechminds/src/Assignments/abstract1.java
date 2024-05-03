package Assignments;
abstract class oneMethod
{
	abstract void child();
	//abstract method don't have implementation
	
}
public class abstract1 extends oneMethod 
{
	
void child()
{
	System.out.println("child method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract1 a=new abstract1();
		a.child();

	}

}
