//check whether the character is lowercase or not

import java.util.Scanner;

class CaseCheck3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch= sc.next().charAt(0);

		String op=(ch>='a' && ch<='z')?("The Character is lowercase" ):("The Character is not lowercase" );
		System.out.println(op);
	}
}