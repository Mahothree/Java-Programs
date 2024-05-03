package Assignments;
class ParentConstructor{
	ParentConstructor(){
		System.out.println("Parent constructor");
	}
}
public class ConstructorOverriding extends ParentConstructor{

	/*ParentConstructor(){
		System.out.println("Parent onstructor");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentConstructor p1=new ParentConstructor();
	}

}
