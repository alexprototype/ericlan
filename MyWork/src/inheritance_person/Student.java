package inheritance_person;

public class Student extends Person{
	private String studentNumber;
	
	public Student(String name, int age, String studentNum) {
		super(name, age);
		this.studentNumber = studentNum;
	}
	
	public String getStudentNumber(){
		return this.studentNumber;
	}
	
	public String hello(){
		String s = super.hello()+ " And my student Number is "+ this.getStudentNumber();
		return s;
	}
	
	
	
}
