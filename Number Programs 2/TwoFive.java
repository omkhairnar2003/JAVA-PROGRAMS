//check whether the character is divisible by 2 and 5 or not

import java.util.Scanner;

class TwoFive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int num = sc.nextInt();

		String op=((num%2==0 && num%5==0))?("HiTwoHiFive"):((num%2==0)?("HiTwo"):(num%5==0)?("HiFive"):(""));
		System.out.println(op);
	}
}
