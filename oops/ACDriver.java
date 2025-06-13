class ACDriver
{
	public static void main(String[] args) 
	{
		AC a1=new AC();


		a1.brand="bluestar";
		a1.price=200000.0;
		a1.ton=1.5;
		a1.minTemp=30;
		a1.maxTemp=16;
		a1.currTemp=23;

		a1.acDetails();
		a1.disMAxTemp();
		a1.disMinTemp();
		a1.disCurrTemp();
	}
}