package Assignments;

interface keyboard
{
	void keyboard1();
	void screenKeyboard();
}
public class Assignment_31_interface implements keyboard{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_31_interface a=new Assignment_31_interface();
		a.keyboard1();
		a.screenKeyboard();
	}

	@Override
	public void keyboard1() {
		// TODO Auto-generated method stub
		System.out.println("interface abstract method 1");
	}

	@Override
	public void screenKeyboard() {
		// TODO Auto-generated method stub
		System.out.println("interface abstract method 2");

	}

}
