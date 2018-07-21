package hwk09;

class DemoCars {

	public static void main(String[] args) {
		
		CarRace.carRaceInfo();
		
		Car c1 = new Car("Lambo", "Yellow", true);
		Car c2 = new Car("Lambo", "Yellow", true);
		Car c3 = new Car("Lambo", "Yellow", true);
		Car c4 = new Car("Lambo", "Yellow", true);
		Car c5 = new Car("Lambo", "Yellow", true);
		Car c6 = new Car("Lambo", "Yellow", true);
		Car c7 = new Car("Lambo", "Yellow", true);
		
		CarRace cr = new CarRace("Spain");
		
		cr.addCar(c1);
		cr.addCar(c2);
		cr.addCar(c3);
		cr.addCar(c4);
		cr.addCar(c5);
		cr.addCar(c6);
		cr.addCar(c7);
		
		cr.startRace(7);
	}

}
