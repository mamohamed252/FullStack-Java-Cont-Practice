package circle.and.cylinder;

public class MainRunner {

	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder(5.0, 3.5);
		
		System.out.println(c1.getArea());

		//Cylinder is subClass and wont work
		Circle c2 = new Circle(5.0);
	
		System.out.println(c2.getRadius());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
