package week6InterfaceSandbox.main;

public class Sandbox {

	public static void main(String[] args) {
		Student junjie = new Student();
		
		Student sumera = new Student("Sumera");
		
		System.out.println("Student 1");
		junjie.introduceSelf();
		
		System.out.println("\n\nStudent 2");
		sumera.introduceSelf();
	}

}
