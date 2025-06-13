class SumOfFactorialDigitOdd 
{
	public static void main(String[] args) 
	{
		int num= 237;
		int dup=num;
		int sum=0;

		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem; i<=num; i--)
			{
				if (i%2!=0)
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(dup);
		System.out.println("Sum of digits is "+sum);
	}
}