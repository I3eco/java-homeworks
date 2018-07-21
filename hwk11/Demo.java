package hwk11;

public class Demo {
	public static void main(String[] args) {
		Person[] pArr = new Person[10];

		Person p1 = new Person("Drago", 23, true);
		Person p2 = new Person("Tania", 21, false);

		Student s1 = new Student("Krasio", 19, true, 4.3);
		Student s2 = new Student("Veronika", 20, false, 5.7);

		Employee e1 = new Employee("Ivan", 15, true, 15);
		Employee e2 = new Employee("Maria", 22, false, 25);

		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = s1;
		pArr[3] = s2;
		pArr[4] = e1;
		pArr[5] = e2;

		for (Person p : pArr) {
			if (p == null) {
				break;
			}
			if (p instanceof Employee) {
				((Employee) p).showEmployeeInfo();
				System.out.println("___________________________");
			} else if (p instanceof Student) {
				((Student) p).showStudentInfo();
				System.out.println("___________________________");
			} else {
				p.showPersonInfo();
				System.out.println("___________________________");
			}
		}

		// for (int i = 0; i < pArr.length; i++) {
		// if (pArr[i] == null) {
		// continue;
		// }
		// if (pArr[i].toString().equals("Person")) {
		// pArr[i].showPersonInfo();
		// System.out.println("___________________________");
		// }
		// if (pArr[i].toString().equals("Student")) {
		// Student tmp;
		// tmp = (Student) pArr[i];
		// tmp.showStudentInfo();
		// System.out.println("___________________________");
		// }
		// if (pArr[i].toString().equals("Employee")) {
		// Employee tmp;
		// tmp = (Employee) pArr[i];
		// tmp.showEmployeeInfo();
		// System.out.println("___________________________");
		// }
		// }

		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i] == null) {
				continue;
			}
			if (pArr[i] instanceof Employee) {
				Employee tmp;
				tmp = (Employee) pArr[i];
				System.out.println(tmp.getName() + " will receive money for overtime work: " + tmp.calculateOvertime(2));
			}
		}

		// Отговор на въпроса от края на домашната :
		// Възможно е, ако в него се извика конструктора от супер класа, като му се
		// зададат дефаултни стойности.
		// Пример:
		// Student() {
		// super("", 0, false);
		// }

	}
}
