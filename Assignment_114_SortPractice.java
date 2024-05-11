package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_114_SortPractice {

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
		
		Collections.sort(a1);
		Collections.sort(a2);

		System.out.println("String in sorting="+a1);
		System.out.println("int values in sorting="+a2);


		

	}

}
