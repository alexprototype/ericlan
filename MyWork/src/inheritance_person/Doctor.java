package inheritance_person;

public class Doctor extends Person{

	public Doctor(String name, int age) {
		super(name,age);
	}
	
	public String hello(){
		return "Dr. "+ super.getName();
		
	}

}
