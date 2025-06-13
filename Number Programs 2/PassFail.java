import java.util.Scanner;
class PassOrFail 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Out of Marks ");
		float outOf = S.nextInt();
		System.out.println("Enter Total Marks ");
		float total = S.nextInt();
		float percent = (outOf/total)*100;
		System.out.println(percent);
		String passOrFail = (percent>=75)?("Pass with A grade"):
							(percent>=60)?("Pass with B grade"):
							(percent>=40)?("Pass with C grade"):
							(percent>=35)?("Pass with D grade"):
							("Fail");
		System.out.println(passOrFail);
	}
}