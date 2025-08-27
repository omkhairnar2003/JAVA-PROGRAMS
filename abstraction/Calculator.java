package abstraction;

public abstract class Calculator 
{
	
	String brand= "Casio";
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public abstract void addition(int n1, int n2);
	
	public abstract void subtraction(int n1, int n2);
	
	public void division(double num, double den)
	{
		System.out.println(num/den);
	}
	
}
