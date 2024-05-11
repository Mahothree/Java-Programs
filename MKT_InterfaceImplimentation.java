package Assignments;
interface  parent1
{
	void child1();
	void child2();
	
}
interface parent2 extends parent1//interface to interface uses extends
{
	void child3();
	void child4();
}
public class MKT_InterfaceImplimentation implements parent2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		MKT_InterfaceImplimentation a= new MKT_InterfaceImplimentation();
		a.child1();
		a.child2();
		a.child3();
		a.child4();
	}

	@Override
	public void child1() {
		// TODO Auto-generated method stub
		System.out.println("interface child1 implementation");

	}

	@Override
	public void child2() {
		// TODO Auto-generated method stub
		System.out.println("interface child2 implementation");

	}

	@Override
	public void child3() {
		// TODO Auto-generated method stub
		System.out.println("interface child3 implementation");

	}

	@Override
	public void child4() {
		// TODO Auto-generated method stub
		System.out.println("interface child4 implementation");

	}

}
