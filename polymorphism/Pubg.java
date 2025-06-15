package polymorphism;

public class Pubg {
int bullets=30;
public void turnRight() 
{
	System.out.println("turned right");
}
public void turnLeft()
{
	System.out.println("turned Left");
}
public void fire()
{
	if(bullets>0)
	{
		bullets--;
		System.out.println("fired");
		System.out.println(bullets+"left");
	}
	else
	{
		System.out.println("Reload");
	}
}
public void reload()
{
	bullets=30; 
	System.out.println("Reloaded");
}
public void forward(int steps) 
{
	System.out.println("went"+steps+"forward");
}
public void backward(int steps) 
{
	System.out.println("went"+steps+"forward");
}
}