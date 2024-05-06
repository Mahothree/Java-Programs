package Assignments;
class ParentMethod12
{
	void one()//if final is given cannot be overridden
	
	
	{
		System.out.println("parent");
	}
}

public class Assignment_30_Super_Keyword extends ParentMethod12{

		void one() {
			super.one();
			System.out.println("child");
		}
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Assignment_30_Super_Keyword a =new Assignment_30_Super_Keyword();
			a.one();
			
		}

	}


