class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int num = 99;
		int num1 = num+1;
		int mul = 1;
		System.out.println(num);
		for (int i = 1;i <=num1/2;i++ )
		{
			mul = i*i;
			if (mul==num1)
			{
				break;
			}
		}
		String op = (mul==num1)?(num+"is duck number"):(num+"is not duck number");
		System.out.println(op);
	}
}