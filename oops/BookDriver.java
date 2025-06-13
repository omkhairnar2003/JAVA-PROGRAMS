class BookDriver
{
	public static void main(String[] args) 
	{
		Book b1=new Book();

		b1.brand ="classmate";
		b1.price=89.0;
		b1.wt=200;
		b1.noOfpages=100;
		b1.type="long note";

		System.out.println(b1);
		System.out.println("brand: "+b1.brand);
		System.out.println("Price: "+b1.price);
		System.out.println("weight: "+b1.wt);
		System.out.println("pages: "+b1.noOfpages);
		System.out.println("Type: "+b1.type);
		System.out.println("-----------------------------------------------");

		Book b2=new Book();

		System.out.println(b2);
		System.out.println("brand: "+b2.brand);
		System.out.println("Price: "+b2.price);
		System.out.println("weight: "+b2.wt);
		System.out.println("pages: "+b2.noOfpages);
		System.out.println("Type: "+b2.type);
	}
}