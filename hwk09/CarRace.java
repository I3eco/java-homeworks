package hwk09;

class CarRace {
	Car[] carsInRace;
	private final String carRaceName;
	private static String info = "F1 is the best car championship in the world.";
	private int carCnt;

	CarRace(String carRaceName) {
		this.carRaceName = carRaceName;
		this.removeCars();
	}

	static void carRaceInfo() {
		System.out.println(info);
	}

	void addCar(Car car) {
		if (this.carCnt == this.carsInRace.length) {
			System.out.println("There is no place for a new car.");
			return;
		}
		this.carsInRace[this.carCnt] = car;
		this.carCnt++;
	}
	void removeCars() {
		carsInRace = new Car[20];
		carCnt = 0;
	}
	
	void startRace(int rounds) {
		int leaderPos = 0;
		for (int i = 0; i < rounds; i++) {
			leaderPos = (int) (Math.random() * carCnt);
			this.carsInRace[0].setCurrentLeader(leaderPos);
			System.out.println("Current leader is " + leaderPos);
		}
		System.out.println("The car on position " + this.carsInRace[0].getCurrentLeader() + " is the winner of " + this.carRaceName);
	}
}
