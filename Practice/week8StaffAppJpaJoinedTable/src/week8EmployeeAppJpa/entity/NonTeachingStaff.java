package week8EmployeeAppJpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
public class NonTeachingStaff extends Staff{

	private String areaExperience;
	
	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public NonTeachingStaff(String areaExperience) {
		super();
		this.areaExperience = areaExperience;
	}


	public NonTeachingStaff(int sid, String sname, String type) {
		super(sid, sname, type);
		
	}
	
	public NonTeachingStaff(int sid, String sname, String type, String areaExperience) {
		super(sid, sname, type);
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
