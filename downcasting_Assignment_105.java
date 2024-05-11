package Assignments;
class parentClass1
{
	void add()
	{
		int c=10+20;
		System.out.println("Add="+c);
	}
}
public class downcasting_Assignment_105 extends parentClass1
{

	public static void main(String[] args) {
		
		//upcasting
		parentClass1 p=(parentClass1) new downcasting_Assignment_105();
		p.add();
		//DownCasting  done only after upcasting
		downcasting_Assignment_105 d=(downcasting_Assignment_105) p;
		p.add();
		
		
		
	}

}
