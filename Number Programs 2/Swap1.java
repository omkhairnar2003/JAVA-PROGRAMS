//Swapping of two numbers without using third variable.

class Swap1
{
	public static void main(String[] args) 
{
	int a=30;
	int b=20;
	System.out.println("BEFORE SWAPPING");
	System.out.println("a: "+a);
	System.out.println("b: "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("AFTER SWAPPING");
    System.out.println("a: "+a);
	System.out.println("b: "+b);
}
}