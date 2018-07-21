package hwk07;

public class PersonCarDemo {

	public static void main(String[] args) {
		Car c1 = new Car("Ferarri", true, "Red", 250000, 350);
		Car c2 = new Car("Wolksvagen", false, "Grey", 2500, 220);
		
		Person p1 = new Person("Ivan", 25, false, 3500);
		Person p2 = new Person();
		p2.name = "Georgi";
		
		p1.buyCar(c1);
		p1.buyCar(c2);
		System.out.println(c2.owner.name);
		System.out.println(p1.ownedCar.model);
		System.out.println(p1.money);
		System.out.println(p1.sellCarForScrap());
		System.out.println(p1.money);
		
		c1.changeOwner(p1);
		System.out.println(c1.owner.name);
		c1.changeOwner(p2);
		System.out.println(c1.owner.name);
	}

}
