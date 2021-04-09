package week8EmployeeAppJpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	@Id
	private int sid;
	private String sname;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor with param
	public Staff(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
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
		Staff other = (Staff) obj;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	// toString
	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sname=" + sname + "]";
	}	
	
	
	
}
