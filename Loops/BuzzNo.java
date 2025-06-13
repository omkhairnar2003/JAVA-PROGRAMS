import java.util.Scanner;
class  BuzzNo
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");
		int num = new Scanner(System.in).nextInt();
		if (num%7==0||(num%10)==7)
		{
			System.out.println("Num is Buzz Number.");
		}
		else{
			System.out.println("Num is not Buzz Number.");
		}
	}
}