package abstraction;

public class CalculatorImp extends Calculator{
	
	public void addition(int a1, int a2)
	{
		System.out.println(a1+a2);
	}
	
	public void subtraction(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public void multiplication(int n1, int n2)
	{
		System.out.println(n1*n2);
	}
	public void message()
	{
		System.out.println("This is a worst company");
	}

}
