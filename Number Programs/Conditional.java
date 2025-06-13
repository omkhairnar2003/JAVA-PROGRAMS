//program using conditional operator

class Conditional 
{
	public static void main(String[] args) 
	{
		int num = 33;
		String ans = num > 0 ? "Positive":"Negative";
		System.out.println("Is number greater than 0? "+ans);

		String Ans = (num % 2) == 0 ? "Even":"Odd";
		System.out.println("Is number even or odd ? "+Ans);
	}
}