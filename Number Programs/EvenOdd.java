//Even odd prg without using modulus operator
import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the num: ");
		int num= new Scanner(System.in).nextInt();
		System.out.println(num%2==0);      //with modulus
		System.out.println((num/2)==(num/2.0)); //Logic 1
		System.out.println((num/2)*2==num);  //Logic 2
	}
}