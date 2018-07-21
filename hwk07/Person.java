package hwk07;

public class Person {
	String name;
	int age;
	long idNumber;
	double weight;
	boolean isWoman;
	Person[] friends;
	Car ownedCar;
	double money;

	Person() {
		System.out.println("Empty person created");
		this.age = 0;
		this.weight = 4;
	}
	
	Person(String name, int age, boolean isWoman, double money){
		this.name = name;
		this.age = age;
		this.isWoman = isWoman;
		this.money = money;
	}

	Person(String name, long idNumber, boolean isWoman) {
		this();
		this.name = name;
		this.idNumber = idNumber;
		this.isWoman = isWoman;
		this.friends = new Person[3];
	}

	Person(String name, long idNumber, boolean isWoman, double weight) {
		this(name, idNumber, isWoman);
		this.weight = weight;
	}
	
	double sellCarForScrap () {
		double sum;
		sum = this.ownedCar.calculateCarPriceForScrap(this.ownedCar.price);
		this.money += sum;
		this.ownedCar = null;
		return sum;
	}

	void buyCar(Car car) {
		if (this.money >= car.price) {
			this.ownedCar = car;
			car.owner = this;
			this.money -= car.price;
		} else {
			System.out.println("Not enought money.");
		}
	}

}
