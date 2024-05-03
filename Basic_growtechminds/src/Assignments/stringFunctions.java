package Assignments;

public class stringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="School";
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('l'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" name is ABC Public School"));
		String first_name="Manish";
		String last_name="Tiwari";
		System.out.println(first_name.concat(" ").concat(last_name));
		System.out.println(name.contains("Sch"));
		String name2="    checking trimming     ";
		
		System.out.println(name2.trim());

	}

}
