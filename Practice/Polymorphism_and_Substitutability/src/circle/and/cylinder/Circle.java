package circle.and.cylinder;


//The superclass Circle
public class Circle {

	// private instance variable
	private double radius;
	
	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	
	}

	// Getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Return the area of this circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	// Describe itself
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
