package Assignments;

import java.util.Arrays;

public class CountOfSpecialCharacters {
	static public int coa=0;
	static public int con=0;
	static public int cos=0;
	static public int cosc=0;
	public static void main(String[] args) {
		String name="Mahothree     1234567   @#$% ";
		char []c= name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<name.length();i++) {
			boolean anws=Character.isAlphabetic(c[i]);
			boolean nums=Character.isDigit(c[i]);
			boolean space=Character.isSpaceChar(c[i]);
			
			if(anws==true) {
				coa++;
			}
			if(nums==true)
			{
				con++;
			}
			if(space==true)
			{
				cos++;
			}
		}
		System.out.println("Count of alphabets-"+coa);
		System.out.println("Count of alphabets-"+con);
		System.out.println("Count of alphabets-"+cos);
		int a=coa+con+cos;
		cosc=name.length()-a;
		System.out.println("Count of Special characters="+cosc);

		

	}

}
