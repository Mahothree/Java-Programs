package Assignments;

import java.util.ArrayList;

public class Assignment_115_Arraylistgetsetindexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		a1.add("anu");
		a1.add("tanu");
		a1.add("ran");
		a1.add("man");
		a1.add("can");
		a1.add("tin");
		a1.add("bun");
		a2.add(10);
		a2.add(70);
		a2.add(30);
		a2.add(10);
		a2.add(0);
		a2.add(-90);
		System.out.println("a="+a1);
		System.out.println("b="+a2);

		System.out.println("get() rerives="+a1.get(3));
		System.out.println("set() updates="+a1.set(2, "chill"));
		System.out.println("indexof() method="+a1.indexOf("can"));


	}

}
