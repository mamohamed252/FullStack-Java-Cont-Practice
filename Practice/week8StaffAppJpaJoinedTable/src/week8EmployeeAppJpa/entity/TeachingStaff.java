package week8EmployeeAppJpa.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
public class TeachingStaff extends Staff{
	
	private String qualification;

	private String subjecetExpertise;
	
	public TeachingStaff() {
		super();
	}
	
	public TeachingStaff(int sid, String sname, String type) {
		super(sid, sname, type);
		// TODO Auto-generated constructor stub
	}

	public TeachingStaff(int sid, String sname, String qualification, String subjecetExpertise) {
		super(sid, sname, subjecetExpertise);
		this.qualification = qualification;
		this.subjecetExpertise = subjecetExpertise;
		// TODO Auto-generated constructor stub
	}
	

	
	//Getters and setters
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjecetExpertise() {
		return subjecetExpertise;
	}

	public void setSubjecetExpertise(String subjecetExpertise) {
		this.subjecetExpertise = subjecetExpertise;
	}

	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((subjecetExpertise == null) ? 0 : subjecetExpertise.hashCode());
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
		TeachingStaff other = (TeachingStaff) obj;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (subjecetExpertise == null) {
			if (other.subjecetExpertise != null)
				return false;
		} else if (!subjecetExpertise.equals(other.subjecetExpertise))
			return false;
		return true;
	}

	//toString
	@Override
	public String toString() {
		return "TeachingStaff [qualification=" + qualification + ", subjecetExpertise=" + subjecetExpertise + "]";
	}
	

}

	
	
