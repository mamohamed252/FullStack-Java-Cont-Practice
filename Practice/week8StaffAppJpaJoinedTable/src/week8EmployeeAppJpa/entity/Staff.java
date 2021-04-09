package week8EmployeeAppJpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Staff {
	@Id
	private int sid;
	private String sname, type;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor with param
	public Staff(int sid, String sname, String type) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.type = type;
	}


	
	// getters and setters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
