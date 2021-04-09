package wee7Review.main;

public class Tiger implements Cat, Lion {

	@Override
	public String says() {
		return Cat.super.says();
	}

	@Override
	public String run() {
		return "tiger runs very fast";
	}
	
	
	
	
//	@Override
//	public String says() {
//		return Lion.super.says();
//	}

//	public String says() {
//		return "Roar!";
//	}
	
}
