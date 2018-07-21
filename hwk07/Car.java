package hwk07;

public class Car {
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;
	boolean isSportsCar;
	double price;

	Car(String model, boolean isSportsCar, String color) {
//		System.out.println("First constructor");
		this.model = model;
		this.isSportsCar = isSportsCar;
		this.color = color;
	}

	Car(String model, boolean isSportsCar, String color, double price, int maxSpeed) {
		this(model, isSportsCar, color);
//		System.out.println("Final constructor");
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	
	boolean isMoreExpensive(Car car) {
		if (this.price > car.price) {
			return true;
		}else {
			return false;
		}
	}
	
//	String isMoreExpensive(Car car) {
//		if(this.price > car.price) {
//			return "Yes";
//		}else {
//			return "No";
//		}
//	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		float coef = 0.2F;
		if(this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("white")) {
			coef += 0.05;
		}
		if(isSportsCar) {
			coef += 0.05;
		}
		return coef*metalPrice;
	}

	String getCarsColor() {
//		if (true) {
			return this.color;
//		}
//		System.out.println("This will not show when we use the method");
//		return "No color";
	}
	
	void changeOwner (Person newOwner) {
		this.owner = newOwner;
	}

	void accelerate() {
		if (currentSpeed <= maxSpeed - currentSpeed) {
			currentSpeed += 10;
		}
	}

	void changeGearUp() {
		currentGear++;
	}

	void changeGearDown() {
		currentGear--;
	}

	void changeNextGear(int nextGear) {
		currentGear = nextGear;
	}

	void changeColor(String nextColor) {
		color = nextColor;
	}
}
