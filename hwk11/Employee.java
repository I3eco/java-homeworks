package hwk11;

public class Employee extends Person {
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day salary: " + this.getDaySalary());
	}

	public double calculateOvertime(double hours) {
		double overtime;
		if (this.getAge() < 18) {
			return 0;
		}
		overtime = ((this.daySalary / 8) * 1.5) * hours;
		return overtime;
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary < 0) {
			return;
		}
		this.daySalary = daySalary;
	}

}
