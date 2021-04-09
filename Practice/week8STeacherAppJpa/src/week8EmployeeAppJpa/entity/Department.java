package week8EmployeeAppJpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int did;
	private String dname;
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + did;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
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
		Department other = (Department) obj;
		if (did != other.did)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
	
}
