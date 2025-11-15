package Core_java;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the first No: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the 2nd No: ");
		int b=sc.nextInt();
		
		int sum=a+b;
	    System.out.println("the Sum is "+ sum);
	    
	    sc.close();

	}

}
