package Assignments;

import java.util.ArrayList;

public class Assignment110_Arraylist_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		ArrayList a3=new ArrayList();

		a1.add("Mahothree");//uses object as parameter
		a1.add("Anu");
		a1.add("nirmala");
		a1.add(1, "sree");
		System.out.println("Arraylist="+a1);
		ArrayList a2=new ArrayList();
		a2.addAll(a1);//uses Collection as parameter
		a2.add(2,a1);//not able to add string at given index
		System.out.println(a2);
		//remove at index
		System.out.println("Remove at index="+a2.remove(0));
		System.out.println("After removing index of 0 in a2\n"+a2);
		//remove object
		a2.remove("sree");
		System.out.println("After removing object="+a2);
		//Remove all
		a2.removeAll(a1);
		System.out.println("Remove all "+a2);
		System.out.println("before clear="+a1);
		a1.clear();
		System.out.println("after clear"+a1);
		System.out.println("isempty="+a1.isEmpty());
		
		
		
		
		
	}

}
