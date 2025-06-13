//swapping of two numbers using temporary variable.

class Swap2
{
	public static void main(String[] args) 
{
	int a=30;
	int b=20;
	System.out.println("BEFORE SWAPPING");
	System.out.println("a: "+a);
	System.out.println("b: "+b);
    int temp = a;
        a = b;
        b = temp;
    System.out.println("AFTER SWAPPING");
    System.out.println("a: "+a);
	System.out.println("b: "+b);
}
}