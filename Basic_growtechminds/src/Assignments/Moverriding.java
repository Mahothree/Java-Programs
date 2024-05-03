package Assignments;
class ParentMethod
{
	void one()//if final is giveen cannot be overridden
	
	
	{
		System.out.println("parent");
	}
}
public class Moverriding {

	void one() {
		System.out.println("child");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moverriding a =new Moverriding();
		a.one();
		
	}

}
