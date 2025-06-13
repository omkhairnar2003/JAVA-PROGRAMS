//program to calculate total bill amount with discount

import java.util.Scanner;
class IF2
{
	public static void main(String [] args)
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the bill amount : ");
		float billAmt = S.nextFloat();
		System.out.println("Enter the coupon code discount value : ");
		float disc = S.nextFloat();
		String check = (disc >=1 && disc <=100)?("Discount applied"):("Discount not applied.");
		System.out.println("Entered bill Amount is : "+billAmt);
		System.out.println("Discount is : "+disc+"%");
		if(billAmt>2000 && (disc >=1 && disc <=100) )
		{
			billAmt-=billAmt*disc/100;
			
		}
		System.out.println(check);
		System.out.println("Your total bill is "+billAmt);
	}
}