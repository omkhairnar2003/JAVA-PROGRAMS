import java.util.Scanner;
class ScannerExample1  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String str1=sc.nextline();
		System.out.println(str1);
		System.out.println("Enter a string: ");
		String str2=sc.next();
		System.out.println(str2);
	}
}
