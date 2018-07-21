package hwk11;

public class Student extends Person {
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);   // ako stojnostta e pod 2 i nad 6, shte se syzdade obekt sys stojnost na towa pole 0 koeto e nevalidna stojnost. Kak moje koda taka da se napravi, che da ne se sazdava obekt.
	}

	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Student's score: " + this.getScore());
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score < 2 && score > 6) {
			return;
		}
		this.score = score;
	}

}
