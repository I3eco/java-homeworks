package hwk12;

public class FamilyCar extends Car {
	
	@Override
	public void accelerate() {
		System.out.println("Family car is accelerating");
	}

	@Override
	public void stopCar() {
		System.out.println("Family car is stopping");		
	}

}
