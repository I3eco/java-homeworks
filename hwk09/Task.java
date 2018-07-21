package hwk09;

class Task {
	private String name;
	private int workingHours;

	Task(String name, int workingHours) {
		this.setName(name);
		this.setWorkingHours(workingHours);
	}
	
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getWorkingHours() {
		return this.workingHours;
	}
	void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
}
