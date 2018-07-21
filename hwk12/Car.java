package hwk12;

public abstract class Car implements IVehicle {
	private double maxSpeed;
	private double currentSpeed;
	private double price;

//	public Car(double maxSpeed, double price) { // throws IllegalArgumentException {
//		if (maxSpeed <= 0) {
//			// throw new IllegalArgumentException("Cannot add a negative max speed");
//			return;
//		}
//		this.maxSpeed = maxSpeed;
//		this.currentSpeed = 0;
//		if (price <= 0) {
//			// throw new IllegalArgumentException("Cannot add a negative price");
//			return;
//		}
//		this.price = price;
//	}
	
	@Override
	public void startMovement() {
		this.startEngine();
		this.accelerate();
	}
	
	@Override
	public void stopMovement() {
		this.stopCar();
		this.stopEngine();
	}

	public void startEngine() {
		System.out.println("Engine is started");
	}

	public void stopEngine() {
		System.out.println("Engine is stopped");
	}

	public abstract void accelerate();

	public abstract void stopCar();

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		if (currentSpeed < 0) {
			return;
		}
		this.currentSpeed = currentSpeed;
	}

}
