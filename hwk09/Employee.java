package hwk09;

class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static String workerName = "The name of the worker is: ";
	private static String taskName = "The name of the task is: ";
	private static String workerHoursLeft = "'s hours left to work: ";
	private static String taskHoursLeft = " hours to finish: ";

	Employee(String name) {
		this.setName(name);
	}
	String getName() {
		return this.name;
	}
	void setName(String name) {
		if (name != null && !name.equals("") && !name.equals(" ")) {
			this.name = name;
		}
	}

	Task getTask() {
		return this.currentTask;
	}

	void setTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	int getHoursLeft() {
		return this.hoursLeft;
	}

	void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}
	
	void work() {
		if (this.currentTask != null) {
			if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
				int a = this.hoursLeft;
				this.hoursLeft = a - this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			} else {
				int a = this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(a - this.hoursLeft);
				this.hoursLeft = 0;
			}
		}
		showReport();
	}
	
	void showReport() {
		System.out.println("---------------------------------------------------");
		System.out.println(workerName + this.name);
		System.out.println(taskName + this.currentTask.getName());
		System.out.println(this.name + workerHoursLeft + this.hoursLeft);
		System.out.println(this.currentTask.getName() + taskHoursLeft + this.currentTask.getWorkingHours());
		System.out.println("---------------------------------------------------");
	}
}
