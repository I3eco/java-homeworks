package hwk12;

public class CarShop {
	private Car[] shop;
	private int carsInShop;

	public CarShop() {
		shop = new Car[10];
		carsInShop = 0;
	}
	
	public void addCar(Car car) {
		if (this.carsInShop >= 0.8 * this.shop.length) {
			Car[] tmp = new Car[(int) (this.shop.length * 1.2)];
			this.shop = new Car[(int) (tmp.length * 1.2)];
			for(int i = 0; i < this.carsInShop; i++) {
				tmp[i] = this.shop[i];
			}
		}
		this.shop[this.carsInShop++] = car;
	}

	public int getCarsInShop() {
		return carsInShop;
	}
	
	@Override
	public String toString() {
		return "Places in carshop: " + this.shop.length + " , cars in shop: " + this.getCarsInShop();
	}
	
	public SportCar[] getSportCars(){
		int sportsCarCnt = 0;
		for(int i = 0; i < this.carsInShop; i++) {
			if(this.shop[i] instanceof SportCar) {
				sportsCarCnt++;
			}
		}
		SportCar[] result = new SportCar[sportsCarCnt];
		
		for(int i = 0; i < this.carsInShop; i++) {
			if(this.shop[i] instanceof SportCar) {
				result[result.length - sportsCarCnt] = (SportCar) this.shop[i];
				sportsCarCnt--;
			}
		}
		return result;
	}
	public WagonCar[] getWagonCars(){
		int wagonCarCnt = 0;
		for(int i = 0; i < this.carsInShop; i++) {
			if(this.shop[i] instanceof WagonCar) {
				wagonCarCnt++;
			}
		}
		WagonCar[] result = new WagonCar[wagonCarCnt];
		
		for(int i = 0; i < this.carsInShop; i++) {
			if(this.shop[i] instanceof WagonCar) {
				result[result.length - wagonCarCnt] = (WagonCar) this.shop[i];
				wagonCarCnt--;
			}
		}
		return result;		
	}
	public FamilyCar[] getFamilyCars(){
		int familyCarCnt = 0;
		for(int i = 0; i < this.carsInShop; i++) {
			if(this.shop[i] instanceof FamilyCar) {
				familyCarCnt++;
			}
		}
		FamilyCar[] result = new FamilyCar[familyCarCnt];
		
		for(int i = 0; i < this.carsInShop; i++) {
			if(this.shop[i] instanceof FamilyCar) {
				result[result.length - familyCarCnt] = (FamilyCar) this.shop[i];
				familyCarCnt--;
			}
		}
		return result;		
	}
	
}
