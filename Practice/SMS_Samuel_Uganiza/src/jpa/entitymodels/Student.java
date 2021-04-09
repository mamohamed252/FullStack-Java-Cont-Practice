package jpa.entitymodels;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name = "email", nullable = false, columnDefinition = "VARCHAR(50) NOT NULL")
	private String sEmail;
	
	@Basic
	@Column(name = "name", nullable = false, columnDefinition = "VARCHAR(50) NOT NULL")
	private String sName;
	
	@Basic
	@Column(name = "password", nullable = false, columnDefinition = "VARCHAR(50) NOT NULL")
	private String sPass;

	@OneToMany(targetEntity = Course.class, fetch = FetchType.EAGER)
	@JoinTable(name = "student_course")
	private List<Course> sCourses;
	
	// Constructors
	
	public Student() {
		super();
		this.sEmail = "";
		this.sName = "";
		this.sPass = "";
		this.sCourses = null;
	}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}
	
	// Getters
	
	public String getsEmail() {
		return this.sEmail;
	}
	
	public String getsName() {
		return this.sName;
	}
	
	public String getsPass() {
		return this.sPass;
	}
	
	public List<Course> getsCourses(){
		return this.sCourses;
	}
	
	// Setters
	
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}
	
	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sCourses == null) ? 0 : sCourses.hashCode());
		result = prime * result + ((sEmail == null) ? 0 : sEmail.hashCode());
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		result = prime * result + ((sPass == null) ? 0 : sPass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sCourses == null) {
			if (other.sCourses != null)
				return false;
		} else if (!sCourses.equals(other.sCourses))
			return false;
		if (sEmail == null) {
			if (other.sEmail != null)
				return false;
		} else if (!sEmail.equals(other.sEmail))
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		if (sPass == null) {
			if (other.sPass != null)
				return false;
		} else if (!sPass.equals(other.sPass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses + "]";
	}
}
