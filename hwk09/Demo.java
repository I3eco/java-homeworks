package hwk09;

class Demo {
	public static void main(String[] args) {
		Employee em1 = new Employee("Ivan");
		Employee em2 = new Employee(null);
		Employee em3 = new Employee("Dragan");
		
		Task t1 = new Task("Digging", 12);
		
		em1.setHoursLeft(15);
		System.out.println("++++ " + em1.getHoursLeft());
		em1.setHoursLeft(-10);
		System.out.println("++++ " + em1.getHoursLeft());
		em3.setHoursLeft(8);
		
		em1.setTask(t1);
		em2.setTask(t1);
		em3.setTask(t1);
		
		System.out.println("==== " + em2.getName());
		System.out.println("==== " + em1.getName());
		
		em2.setName("Petkan");
		em2.setHoursLeft(12);
		
		em1.work();
		
		t1.setWorkingHours(12);

		em2.work();

		t1.setWorkingHours(12);

		em3.work();
	}
}
