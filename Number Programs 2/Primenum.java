//prg to check whether no is prime or not

import java.util.Scanner;
class Primenum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num :");
		int num = sc.nextInt();

		System.out.println((num==2||num==3||num==5)?(num+"is prime"):((num%2==0||num%3==0||num%5==0)?(num+"is not prime"):(num+"is prime")));
	}
}