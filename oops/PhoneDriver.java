class PhoneDriver
{
	public static void main(String[] args) 
	{
		Phone P1 = new Phone();
		System.out.println(P1);
		P1.brand = "Motorola"; 
		P1.model = "Motorola Edge 20 Fusion";
		P1.primaryCamera = 108; 
		P1.secondaryCamera = 32; 
		P1.operatingSystem = "Android";
		P1.battery = 5000;
		P1.storage = 128; 
		P1.ram = 6;
		P1.price = 18999.00;
		System.out.println("Brand :"+P1.brand);
		System.out.println("Model :"+P1.model);
		System.out.println("Primary Camera :"+P1.primaryCamera+" MP");
		System.out.println("Secondary Camera :"+P1.secondaryCamera+" MP");
		System.out.println("Operating System :"+P1.operatingSystem);
		System.out.println("Battery "+P1.battery+" mAH");
		System.out.println("Storage :"+P1.storage+" gb");
		System.out.println("RAM :"+P1.ram+" gb");
		System.out.println("Price :"+P1.price+"Rs/-");
		System.out.println("--------------------------------------------------------------");
		Phone P2 = new Phone();
		System.out.println(P2);
		P2.brand = "Xiaomi"; 
		P2.model = "Xiaomi 15 Ultra";
		P2.primaryCamera = 200; 
		P2.secondaryCamera = 32; 
		P2.operatingSystem = "Android";
		P2.battery = 5410;
		P2.storage = 512; 
		P2.ram = 16;
		P2.price = 109999.00;
		System.out.println("Brand :"+P2.brand);
		System.out.println("Model :"+P2.model);
		System.out.println("Primary Camera :"+P2.primaryCamera+" MP");
		System.out.println("Secondary Camera :"+P2.secondaryCamera+" MP");
		System.out.println("Operating System :"+P2.operatingSystem);
		System.out.println("Battery "+P2.battery+" mAH");
		System.out.println("Storage :"+P2.storage+" gb");
		System.out.println("RAM :"+P2.ram+" gb");
		System.out.println("Price :"+P2.price+"Rs/-");
		System.out.println("--------------------------------------------------------------");
		Phone P3 = new Phone();
		System.out.println(P3);
		P3.brand = "Apple"; 
		P3.model = "Apple iPhone 16 Pro Max";
		P3.primaryCamera = 48; 
		P3.secondaryCamera = 12; 
		P3.operatingSystem = "iOS";
		P3.battery = 4685;
		P3.storage = 1024; 
		P3.ram = 8;
		P3.price = 184900.00;
		System.out.println("Brand :"+P3.brand);
		System.out.println("Model :"+P3.model);
		System.out.println("Primary Camera :"+P3.primaryCamera+" MP");
		System.out.println("Secondary Camera :"+P3.secondaryCamera+" MP");
		System.out.println("Operating System :"+P3.operatingSystem);
		System.out.println("Battery "+P3.battery+" mAH");
		System.out.println("Storage :"+P3.storage+" gb");
		System.out.println("RAM :"+P3.ram+" gb");
		System.out.println("Price :"+P3.price+"Rs/-");
		System.out.println("--------------------------------------------------------------");
	}
}