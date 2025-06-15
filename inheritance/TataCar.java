package inheritance;

public class TataCar extends Car {
	String model;
	double price;
	
	TataCar(){}

	public TataCar(String type, double cc, int seats, String fuelType, double weight, String transmission, String model,
			double price) {
		this.type = type;
		this.cc = cc;
		this.seats = seats;
		this.fuelType = fuelType;
		this.weight = weight;
		this.transmission = transmission;
		
		this.model = model;
		this.price = price;
	}
	
	public void showCar() {
		displayCar();
		System.out.println(model);
		System.out.println(price);
		
	}

}
