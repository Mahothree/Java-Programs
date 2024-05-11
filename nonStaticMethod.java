package Assignments;

public class nonStaticMethod 
{

	 void add() {
		int a = 100;		int b = 200;
		System.out.println("Addition method invoked with non static="+a + b);
	}

	 void mul() {
		int a = 200; 		int b = 500;
		System.out.println("Multiplication method with non static =" + a * b);
	}

	 void sub() {
		int c = 400;		int d = 500;
		System.out.println(c - d);
	}

	 void div() {
		int a = 100;
		int b = 500;
		System.out.println("Division with non static=" + a / b);
	}

	 void mod() {
		int a = 100;
		int b = 200;
		System.out.println("modulus invoked with non static=" + a % b);
	}

	public static void main(String[] args) {
		System.out.println("Non static method invoke in to main method");
		nonStaticMethod n = new nonStaticMethod();
		n.add();
		n.sub();
		n.mul();
		n.div();
		n.mod();
	}


}
