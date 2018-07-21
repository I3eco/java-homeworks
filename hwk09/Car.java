package hwk09;

class Car {
	private String model;
	private String color;
	private boolean isSportsCar;
	private static int currentLeader;

	Car(String model, String color, boolean isSportsCar) {
		this.setModel(model);
		this.setIsSportsCar(isSportsCar);
		this.setColor(color);
	}

	String getModel() {
		if (this.model != null) {
			return this.model;
		} else {
			return null;
		}
	}
	void setModel(String model) {
		if (model != null) {
			this.model = model;
		}
	}

	String getColor() {
		if (this.color != null) {
			return this.color;
		} else {
			return null;
		}
	}
	void setColor(String color) {
		if (color != null) {
			this.color = color;
		}
	}
	
	boolean getIsSportsCar() {
		return this.isSportsCar;
	}
	void setIsSportsCar(boolean isSportsCar) {
		this.isSportsCar = isSportsCar;
	}
	
	int getCurrentLeader() {
		return currentLeader;
	}
	void setCurrentLeader(int leader) {
		if (leader >= 0) {
			currentLeader = leader;
		}
	}
}
