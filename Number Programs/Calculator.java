//simple calculator program

import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		float num1 = S.nextFloat();
		System.out.print("Enter Num2 : ");
		float num2 = S.nextFloat();
		System.out.print("Enter Operator : ");
		char opr = S.next().charAt(0);
		float ans = 0;
		ans = (opr == '+')? num1+num2:
					(opr == '-')? num1-num2:
					(opr == '*')? num1*num2:
					(opr == '/')? num1/num2:
					(opr == '%')? num1%num2:0.000001F;

					String ans=num1+" "+opr+" "+num2+"="+ans;

					if(ans==0.000001f)
					{

                	 System.out.println(num1+" "+opr+" "+num2+" = "+ans);
                    }
	}
}
