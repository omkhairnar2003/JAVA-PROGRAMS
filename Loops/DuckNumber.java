import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number :");
		String num = new Scanner(System.in).next();
		System.out.println(num);
		if (num.charAt(0)=='0')
		{
			System.out.println("Num is not duck number");
		}
		else if(num.contains("0"))
		{
			System.out.println("Num is Duck Number.");
		}
		else{
			System.out.println("Num is not duck number.");
		}
	}
}