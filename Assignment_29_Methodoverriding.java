package Assignments;
class ParentMethod
{
	void one()//if final is given cannot be overridden
	
	
	{
		System.out.println("parent");
	}
}
public class Assignment_29_Methodoverriding extends ParentMethod {

	void one() {
		System.out.println("child");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_29_Methodoverriding a =new Assignment_29_Methodoverriding();
		a.one();
		
	}

}
