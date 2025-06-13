//program to sum the digits

import java.util.Scanner;
class SumDigitInInteger 
{
	public static void main(String[] args) 
	{
		Scanner R = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = R.nextInt();
		int dup = num;
		int add = 0;

		int rem = num % 10;
		add = rem;

		num = num / 10;
		rem = num % 10;
		add = add + rem;

		num = num / 10;
		rem = num % 10;
		add = add + rem;
        
		
		System.out.println("The sum of the digit is : "+add);
	}
}