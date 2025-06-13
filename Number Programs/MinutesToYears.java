//converting minutes into years

import java.util.Scanner;
class MinutesToYears
{
	public static void main(String[] args) 
	{
		Scanner R = new Scanner(System.in);
		System.out.println("Enter the number of minutes : ");
		int minutes = R.nextInt();//1000000000;
		int years = minutes / 525600;
		int days = (minutes % 525600)/(60 * 24);
		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
	
	}
}