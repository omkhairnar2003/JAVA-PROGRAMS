package inheritance;

public class Car {
	String type;
	double cc;
	int seats;
	String fuelType;
	double weight;
	String transmission;
	
	Car(){}

	public Car(String type, double cc, int seats, String fuelType, double weight, String transmission) {
		this.type = type;
		this.cc = cc;
		this.seats = seats;
		this.fuelType = fuelType;
		this.weight = weight;
		this.transmission = transmission;
	}
	
	public void displayCar() {
		System.out.println(type);
		System.out.println(cc);
		System.out.println(seats);
		System.out.println(fuelType);
		System.out.println(weight);
		System.out.println(transmission);
	}
	
	
}
