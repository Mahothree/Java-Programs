package Assignments;
class Parent_Method1
{
	void one()//polymorphism :overriding by creating parent class object
	
	
	{
		System.out.println("parent");
	}

}

public class polymorphism_Moveriding extends Parent_Method1 {
	void one() {
		System.out.println("child");

		
	}
	public static void main(String[] args) {
		Parent_Method1 p=new Parent_Method1();
		p.one();

	}

}
