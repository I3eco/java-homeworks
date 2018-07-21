package hwk07;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		this.emptyGroup();
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if(!this.groupSubject.equalsIgnoreCase(s.subject)) {
			return;
		}
		if(this.freePlaces == 0) {
			return;
		}
		this.students[this.students.length - this.freePlaces] = s;
		this.freePlaces--;
		
//		if (this.groupSubject == s.subject && this.freePlaces > 0) {
//			for (int i = 0; i < this.students.length; i++) {
//				if (this.students[i] == null) {
//					this.students[i] = s;
//					break;
//				}
//			}
//			this.freePlaces--;
//		}
	}

	void emptyGroup() {
		this.freePlaces = 5;
		this.students = new Student[this.freePlaces];
		System.out.println("The group is empty");
	}

	String theBestStudent() {
		String name = this.students[0].name;
		String name2 = name;
		double max = this.students[0].grade;
		for (int i = 1; i < this.students.length; i++) {
			if (max < this.students[i].grade) {
				max = this.students[i].grade;
				name = this.students[i].name;
				name2 = name;
			} else if (max == this.students[i].grade) {
				name2 = this.students[i].name;
			}
		}
		if (name2.equals(name)) {
			return name;
		} else {
			return name + " and " + name2;
		}
	}

	void printStudentsInGroup() {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				System.out.println(this.students[i].age);
				System.out.println(this.students[i].grade);
				System.out.println(this.students[i].isDegree);
				System.out.println(this.students[i].money);
				System.out.println(this.students[i].name);
				System.out.println(this.students[i].subject);
				System.out.println(this.students[i].yearInCollege);
				System.out.println();
			}
		}
	}
}
