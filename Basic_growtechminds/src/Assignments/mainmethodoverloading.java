package Assignments;


public class mainmethodoverloading {
	public static void main(String[] args) {
		System.out.println("Main method 1");
		main2(20);
		main3(34.00);
		
		
		
	}
	public static void main2(int i) {
		System.out.println("Main method 2");
	}
	public static void main3(double d) {
		System.out.println("Main method 3");
	}
}


