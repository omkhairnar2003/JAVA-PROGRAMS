import java.util.Scanner;

class CaseCheck
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Character");
		char ch= new Scanner(System.in).nextchar();

		String s=(ch>='A'&& ch='z')?("The Character is uppercase" ):("The Character is lowercase" );
		System.out.println(s);
	}
}