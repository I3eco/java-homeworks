package hwk11;

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);
	}

	public void showPersonInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Is a male: " + this.isMale());
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			return;
		}
		if (name.equals("") || name.startsWith(" ")) {
			return;
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

}
