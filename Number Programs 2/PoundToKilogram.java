//program to Convert pound to kilograms

import java.util.Scanner;
class PoundToKilogram 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the weight in Pounds :");
		float pound = new Scanner (System.in).nextFloat();
		System.out.println("The weight in Pounds is :"+pound);
		final float kiloConversion = 0.454f;
	    float kilo = pound * kiloConversion;
		System.out.print(pound+" pounds is "+kilo+" kilograms.");
	}
}