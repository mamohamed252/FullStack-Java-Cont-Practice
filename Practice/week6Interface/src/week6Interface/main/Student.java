package week6Interface.main;

public class Student implements StudentI{

	// fields
	String name;
	
	
	// default constructor already generated 
	// by default until another constructor created
	public Student() {
		super();
	
	}
	
	//specified constructor
	public Student(String name) {
		super();
		this.name = name;
	}
	
	
	// getter and setter
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}


	public String getName() {
		return name;
	}


	@Override
	public void introduceSelf() {
		// TODO Auto-generated method stub
		
		System.out.println("Hi, I'm " + name);
		System.out.println("I'm attending " + this.school);
	}

	
}
