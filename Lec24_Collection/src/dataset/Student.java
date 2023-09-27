package dataset;

public class Student {
	private String id;
	private String name;
	private int grade;
	private String major;
	private Score score;

	public Student() {
	}

	public Student(String id, String name, int grade, String major, Score score) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", grade=" + grade +
				", major='" + major + '\'' +
				", score=" + score +
				'}';
	}
} // end class Student
