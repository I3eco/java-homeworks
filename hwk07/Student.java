package hwk07;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (this.isDegree) {
			System.out.println("The student is graduated");
		} else {
			if (this.yearInCollege < 4) {
				this.yearInCollege++;
			} else {
				this.isDegree = true;
			}
		}
	}

	double receiveScholarship(double min, double amount) {
		if (this.age < 30 && this.grade >= min) {
			this.money += amount;
		}
		return this.money;
	}
}
