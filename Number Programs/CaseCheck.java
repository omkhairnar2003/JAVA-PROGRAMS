//check whether the character is uppercase or not

import java.util.Scanner;

class CaseCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch= sc.next().charAt(0);

		String op=(ch>='A' && ch<='Z')?("The Character is uppercase" ):("The Character is not uppercase" );
		System.out.println(op);
	}
}