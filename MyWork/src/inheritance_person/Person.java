package inheritance_person;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String hello(){
		String s = "Hello, I'm " + this.getName() +".";
		return s;
	}
}
