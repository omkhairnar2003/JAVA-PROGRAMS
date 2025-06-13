import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit :");
		int num = sc.nextInt();
		int dup = num;
		int prod = 1;
		while(num>0){
			int rem = num%10;
			prod *= rem;
			num /= 10;
		}
		System.out.println("Number :"+dup);
		System.out.println("Product of Digit :"+prod);
	}
}