import java.util.Scanner;
class BouncyNumber
{
	public static void main(String[] args) 
	{
	//fetch the number from user 
	System.out.println("Enter the Number");
	int num=new Scanner(System.in).nextInt();
	int dup = num,a=0,b=0;
	//bouncy number should be greater than 100.if the num is not greater than 100.
	if(num<=100)
	{
		System.out.println("It is not BouncyNumber");
	}	
	else
	{
		//take remainder from dup
		int rem1=dup%10;
		//remove last value from dup by /=10
		dup/=10;
		while(dup>0)
		{
			//take 2nd remainder for composition
			int rem2=dup%10;
			if(rem1>rem2)
			{
				a=1;
			}
			else if(rem1<rem2)
			{
				b=1;
			}
			rem1=rem2;
			dup/=10;
		}
		if(a==1 && b==1)
		{
			System.out.println("it is BouncyNumber");
		}
		else
		{
			System.out.println("It is not BouncyNumber");
		}
	}
	}
}