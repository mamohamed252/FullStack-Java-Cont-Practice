package wee7Review.main;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public Integer square(int m);
	
	default String square(String m) {
		return m + m;
	}
	
}
