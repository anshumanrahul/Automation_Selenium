package Oops_Concept;

public class Classroom_DataEncapculation {
	private String Subject1;
	private int StudentCount1;
	
	public String getSubject() {
		return Subject1;
	}

	public void setSubject(String subject) {
		this.Subject1 = subject;
	}

	public int getStudentCount() {
		return StudentCount1;
	}

	public void setStudentCount(int studentCount) {
		this.StudentCount1 = studentCount;
	}

	public void displayDetails()
	{
		System.out.println("This is a "+Subject1+" classroom and it has "+StudentCount1+ " number of students");
	}

}
