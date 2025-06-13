class AC
{
	String brand;
	double price,minTemp,maxTemp,currTemp,ton;

	public void acDetails()
	{	
		int price=20000;
		System.out.println("brand "+brand);
		System.out.println("price "+this.price);
		System.out.println("Ton "+ton);
		System.out.println(price);
	}	
	public void disMAxTemp()
	{
		System.out.println(maxTemp);
	}
	public void disMinTemp()
	{
		System.out.println(minTemp);
	}
	public void disCurrTemp()
	{
		System.out.println(currTemp);
	}
}
