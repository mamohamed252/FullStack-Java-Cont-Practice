package genericTypeExample;

public class GenericBox<Type> {
	
	/*
	 * Generic Type Parameter Naming Convention
	 * E - element
	 * T - type
	 * N - number
	 * K - key
	 * V - value
	 */
	
	private Type content;
	
	public void setContent(Type content) {
		this.content = content;
	}
	
	public Type getContent() {
		return this.content;
	}
	
}