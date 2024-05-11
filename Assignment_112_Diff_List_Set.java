package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment_112_Diff_List_Set {

	public static void main(String[] args) {
		System.out.println("*******List****");
		List a1=new ArrayList();//upcasting
		a1.add("pen");
		a1.add("pencil");
		a1.add("eraser");
		a1.add("box");
		System.out.println("List follow indexing a1="+a1);
		System.out.println("*****Set*******");
		Set a2=new HashSet();
		a2.add("pen");
		a2.add("pencil");
		a2.add("eraser");
		a2.add("box");
		System.out.println("Set dont follow indexing a2="+a2);//upcasting


	}

}
