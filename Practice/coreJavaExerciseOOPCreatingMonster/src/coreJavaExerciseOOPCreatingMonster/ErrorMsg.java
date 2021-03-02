package coreJavaExerciseOOPCreatingMonster;

public class ErrorMsg implements Monster{

	private String name;
	
	public ErrorMsg(String name) {
		this.name = name;
	}
	
	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return "!^_&amp;^$@+%$* I don&#39;t know how to attack!";
	}

}
