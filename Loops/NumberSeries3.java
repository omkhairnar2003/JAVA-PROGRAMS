class NumberSeries3 
{
	public static void main(String[] args) 
	{
		for (int n = 2;n<=6 ;n++ )
		{
			int p = 1;
			for (int i = 0;i<3 ;i++ )
			{
				p *=n;
			}
			int sum = p + n;
			System.out.print(sum+" ");
		}
	}
}