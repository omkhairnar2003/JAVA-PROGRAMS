import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the num : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;
		int num1 = num*num;
		//System.out.println(num1);
		for (int i = num1;i>0 ;i--,num1/=10 )
		{
			int rem = num1%10;
			//System.out.println(rem+" rem");
			sum=sum+rem;
			//System.out.println(sum+" sum");
		}
		//System.out.println(sum);
		if (dup==sum)
		{
			System.out.println("It is neon.");
		}
		else{
			System.out.println("it is not neon num");	
		}
		
	}
}