package hwk07;

public class College {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ivan", "Math", 25);
		Student s2 = new Student("Dragan", "Math", 18);
		Student s3 = new Student("Petkan", "Math", 28);
		Student s4 = new Student("Dimchoy", "Math", 31);
		Student s5 = new Student("Maria", "Math", 23);
		Student s6 = new Student("Stefan", "Biology", 25);
		Student s7 = new Student("Petia", "Biology", 22);
		Student s8 = new Student("Kristina", "Biology", 21);
		Student s9 = new Student("Trifon", "Biology", 19);
		Student s10 = new Student("Hristo", "Biology", 27);
		
		StudentGroup sg1 = new StudentGroup("Math");
		StudentGroup sg2 = new StudentGroup("Biology");
		
		System.out.println(s1.yearInCollege);
		s1.upYear();
		System.out.println(s1.yearInCollege);
		s1.upYear();
		System.out.println(s1.yearInCollege);
		s1.upYear();
		System.out.println(s1.yearInCollege);
		s1.upYear();
		System.out.println(s1.yearInCollege);
		s1.upYear();
		System.out.println(s1.yearInCollege);
		
		System.out.println();
		
		System.out.println(s7.money);
		System.out.println(s7.receiveScholarship(3, 100));
		System.out.println(s8.money);
		System.out.println(s8.receiveScholarship(5, 100));
		
		sg1.addStudent(s1);
		sg1.addStudent(s2);
		sg1.addStudent(s3);
		sg1.addStudent(s7);
		sg1.addStudent(s8);
		sg1.addStudent(s4);
		sg1.addStudent(s5);
		
		sg1.printStudentsInGroup();
		sg1.emptyGroup();
		System.out.println();
		
		sg1.addStudent(s3);
		sg1.addStudent(s4);
		sg1.printStudentsInGroup();
		
		sg2.addStudent(s6);
		sg2.addStudent(s7);
		sg2.addStudent(s8);
		sg2.addStudent(s9);
		sg2.addStudent(s10);
		sg2.printStudentsInGroup();
		
		//stefan 4 / 6, petia 5, kristina 6 / 3, trifon 3 / 6 / 4, hristo 2
		
		s7.grade = 5;
		s8.grade = 6;
		s9.grade = 3;
		s10.grade = 2;
		
		System.out.println(sg2.theBestStudent());
		s8.grade = 3;
		s9.grade = 6;
		System.out.println(sg2.theBestStudent());
		s6.grade = 6;
		s9.grade = 4;
		System.out.println(sg2.theBestStudent());
		s9.grade = 6;
		System.out.println(sg2.theBestStudent());
		
		
		
		

	}

}
