package hwk06;

public class Snake {
	int legsCount;
	boolean isMammal;
	int speed;
	boolean isFish;
	
	void getLegsCount () {
		System.out.println("The snake has " + legsCount + " legs.");
	}
	
	void eat () {
		System.out.println("The snake is eating now...");
	}
}
