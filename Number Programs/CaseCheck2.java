//check whether the character is lowercase or uppercase or digit or special character

import java.util.Scanner;

class CaseCheck2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch= sc.next().charAt(0);

		String op=((ch>='A'&& ch<='Z')||(ch>='a'&& ch<=122))?((ch>='a'&& ch<='z')?(ch+"is a lowercase Alphabet" )
			:(ch+"is a uppercase Alphabet")):((ch>='0'&&ch<='9')?(ch+"is a digit"):(ch+"is a special character"));
		System.out.println(op);
	}
}