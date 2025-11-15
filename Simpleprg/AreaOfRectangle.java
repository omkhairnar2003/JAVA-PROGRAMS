package Core_java;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float width = 4f;
//		float height= 5f;
//		
//		System.out.println("width of rectangle: "+width);
//		System.out.println("height of rectangle: "+height);
//		
//		float area=width*height;
//		
//		System.out.println("Area of rectangle: "+area);
		
		//Using Scanner class
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("width of rectangle: ");
		float width=sc.nextFloat();
		
		System.out.println("height of rectangle: ");
		float height=sc.nextFloat();
		
		float area=width*height;
		
		System.out.println("Area of rectangle: "+area);
		sc.close();
	}

}
