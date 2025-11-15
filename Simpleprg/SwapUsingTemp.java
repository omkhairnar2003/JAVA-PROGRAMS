package Core_java;

public class SwapUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=20;
		
		System.out.println("Before Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	int	temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
