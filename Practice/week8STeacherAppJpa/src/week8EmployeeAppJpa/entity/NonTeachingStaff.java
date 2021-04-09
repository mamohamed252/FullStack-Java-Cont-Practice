package week8EmployeeAppJpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="NTS")
public class NonTeachingStaff extends Staff{

	private String areaExperience;
	
	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NonTeachingStaff(int sid, String sname) {
		super(sid, sname);
		
	}
	
	public NonTeachingStaff(int sid, String sname, String areaExperience) {
		super(sid, sname);
		this.areaExperience = areaExperience; 
		
	}
	public String getAreaExperience() {
		return areaExperience;
	}
	public void setAreaExperience(String areaExperience) {
		this.areaExperience = areaExperience;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((areaExperience == null) ? 0 : areaExperience.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		NonTeachingStaff other = (NonTeachingStaff) obj;
		if (areaExperience == null) {
			if (other.areaExperience != null)
				return false;
		} else if (!areaExperience.equals(other.areaExperience))
			return false;
		return true;
	}
	
	//toString
	@Override
	public String toString() {
		return "NonTeachingStaff [areaExperience=" + areaExperience + "]";
	}
	
	
}
