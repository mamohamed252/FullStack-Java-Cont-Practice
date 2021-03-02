package coreJavaExerciseOOPCreatingMonster;

public class FireMonster implements Monster{

	private String name;
	
	public FireMonster(String name) {
		this.name = name;
	}

	@Override
	public String attack() {
		return "Attack with fire!";
	}
	
	
}
