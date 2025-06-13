//check whether the character is digit or not

import java.util.Scanner;

class CaseCheck4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch= sc.next().charAt(0);

		String op=(ch>='0' && ch<='9')?("The Character is digit" ):("The Character is not a digit" );
		System.out.println(op);
	}
}