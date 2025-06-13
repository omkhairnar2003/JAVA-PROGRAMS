// prg to calculate the subtotal of bill and tip

import java.util.Scanner;
class Subtotal
{
	public static void main(String args[])
	{
		Scanner R = new Scanner(System.in);
		System.out.println("Enter the bill amount $ :");
		float subtotal = R.nextFloat();
		System.out.println("Enter the Tip :");
		float tip = R.nextFloat();
		float tipRate = (subtotal*tip)/100;
		float total_bill = subtotal + tipRate;
		System.out.println("Your total bill is :"+total_bill+"$");
		System.out.println("Your tip included is :"+tipRate+"$");

	}
}