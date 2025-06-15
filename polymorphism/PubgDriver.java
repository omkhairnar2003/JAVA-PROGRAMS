package polymorphism;

public class PubgDriver {
public static void main(String[] args) {
	Pubg p1= new PubgV2();
	p1.backward(10);
	p1.turnLeft();
	
	p1.fire();
	p1.fire();
	p1.fire();
	p1.fire();
	p1.reload();
}
}
