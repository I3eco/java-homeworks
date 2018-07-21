package hwk12;

public class Demo {

	public static void main(String[] args) {
		WagonCar wc1 = new WagonCar();
		WagonCar wc2 = new WagonCar();
		WagonCar wc3 = new WagonCar();
		WagonCar wc4 = new WagonCar();
		SportCar sc1 = new SportCar();
		SportCar sc2 = new SportCar();
		SportCar sc3 = new SportCar();
		SportCar sc4 = new SportCar();
		FamilyCar fc1 = new FamilyCar();
		FamilyCar fc2 = new FamilyCar();
		FamilyCar fc3 = new FamilyCar();
		FamilyCar fc4 = new FamilyCar();
		
		CarShop cs = new CarShop();
		
		System.out.println(cs);
		cs.addCar(wc1);
		cs.addCar(wc2);
		cs.addCar(wc3);
		cs.addCar(wc4);
		System.out.println(cs);
		cs.addCar(sc1);
		cs.addCar(sc2);
		cs.addCar(sc3);
		cs.addCar(sc4);
		System.out.println(cs);
		cs.addCar(fc1);
		cs.addCar(fc2);
		cs.addCar(fc3);
		cs.addCar(fc4);
		System.out.println(cs);
		System.out.println(cs);
		cs.addCar(wc1);
		cs.addCar(wc2);
		cs.addCar(wc3);
		cs.addCar(wc4);
		System.out.println(cs);
		cs.addCar(sc1);
		cs.addCar(sc2);
		cs.addCar(sc3);
		cs.addCar(sc4);
		System.out.println(cs);
		cs.addCar(fc1);
		cs.addCar(fc2);
		cs.addCar(fc3);
		cs.addCar(fc4);
		System.out.println(cs);
	}

}
