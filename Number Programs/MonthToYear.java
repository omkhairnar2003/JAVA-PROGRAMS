import java.util.Scanner;

class MonthToYear
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		int month=20;
		int years=month/12;
		int rem=month%12;
		System.out.println(years+" "+rem);
	}
}