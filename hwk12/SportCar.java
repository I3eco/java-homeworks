package hwk12;

public class SportCar extends Car{

	@Override
	public void accelerate() {
		System.out.println("Sport car is accelerating");
	}

	@Override
	public void stopCar() {
		System.out.println("Sport car is stopping");		
	}

}
