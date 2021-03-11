package week6InterfaceSandbox.main;

public class Student implements StudentI {
	// Fields
	String name;
	
	// constructor
	public Student() {
		super();
		// add code here
	}

	
	public Student(String pName) {
		super();
		this.name = pName;
		// add code here

	}
	
	// setters and getters

	@Override
	public void setName(String pName) {
		this.name = pName;
	}
	
	
	// methods
	@Override  							// @annotationName  ==> JAVA ANNOTATIONS
	public void introduceSelf() {
		
		System.out.println("Hi, I'm " + name);
		System.out.println("I'm attending " + this.SCHOOL);

	}

}
