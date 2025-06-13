import java.util.Scanner;
class FascinatingNo
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int num= new Scanner(System.in).nextInt();
		String str= num+""+(num*2)+(num*3);
		Boolean flag = true;
		for (char i='1';i<='9';i++) 
		{
			int cnt =0;
			for (int j=0;j<str.length();j++ )
			{
				char ch=str.charAt(j);
				if(ch==i)
					cnt++;
			}
			if(cnt!=1)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+"  is FascinatingNo");
		}
		else
		{
			System.out.println(num+ "  is not FascinatingNo");
		}
	}
}

