package ObjectClass.methods;

public class ShapesImp implements shapes
{
	@Override
	public void areaOfCircle(int rad)
	{
		double area = pi*(rad*rad);
		
		System.out.println(area);
	}
	
	@Override
	public void areaOfSquare(int sides) {
		int area = sides*sides;
		System.out.println(area);
	}
	
	@Override
	public void perimeterOfSquare(int sides) {
		int perimeter = 4*sides; 
		System.out.println(perimeter);
	}
}
