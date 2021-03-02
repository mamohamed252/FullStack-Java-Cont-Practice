package coreJavaExerciseOOPCreatingMonster;

public class StoneMonster implements Monster{

	private String name;
	
	public StoneMonster(String name) {
		this.name = name;
	}
	
	@Override
	public String attack() {
		
		return "Attack with stones!";
	}

}
