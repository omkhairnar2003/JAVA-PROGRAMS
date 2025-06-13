// Area of circle

import java.util.Scanner;
class Circle1
{
	public static void main(String[] args) 
    {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of circle in cm: ");
        float radius= sc.nextFloat();
        final float pi=22/7;
        float area=pi *(radius*radius);

        System.out.println("Area of circle is: "+area+" cm^2");
    }
}