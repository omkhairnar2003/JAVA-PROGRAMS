class FrLoop
{
	public static void main(String[] args)
	{
		System.out.println("0 to 9");
		for(int i=1;i<=9;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("Alphabets A to Z");
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println("");
		System.out.println("z to a");
		for(char ch='z'; ch>='a';ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println("");
	}
}