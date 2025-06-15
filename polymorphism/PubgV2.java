package polymorphism;

public class PubgV2 extends Pubg
{
public void turnLeft()
{
	System.out.println("turned left");
}
public void backward(int steps) 
{
	System.out.println("went"+steps+"backward");
}
}
