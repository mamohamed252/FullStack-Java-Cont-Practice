package coreJavaExerciseOOPCreatingMonster;

public class WaterMonster implements Monster{

	private String name;
	
	public WaterMonster(String name) {
		this.name = name;
	}
	
	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return "Attack with water!";
	}

}
