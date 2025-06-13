import java.util.Scanner;
class OddEvenSum1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int dup = num;
		int even = 0;
		int odd = 0;
		for (;num>0 ; )
		{
			int rem = num%10;
			if (rem%2==0)
			{
				even+=rem;
			
			}
			if(!(rem%2==0))
			{
				odd += rem;
			}
			num /= 10;
		}
		System.out.println(dup);
		System.out.println(even);
		System.out.println(odd);
	}
}