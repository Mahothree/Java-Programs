package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_PracticefromClone {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();

		a1.add("Anu");
		a1.add("Tanu");
		a1.add("Manu");
		//cloning 
		System.out.println("Before cloning a1 and a2\n"+a1+"\n"+a2);
		a2=(ArrayList) a1.clone();
		System.out.println("After cloning a1 and a2\n"+a1+"\n"+a2);

		//size()
		System.out.println("size"+a1.size());
		//iterator
	Iterator i1=a1.iterator();
		//Iterator is interface && iterator is abstract method
		while(i1.hasNext()) {//has next points to next value 
			System.out.println("hasnext="+i1.next());//next gives the object present
		}
		System.out.println("contains="+a1.contains("Tanu"));
	}

}
