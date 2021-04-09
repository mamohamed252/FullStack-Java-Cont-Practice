package EmployeeBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class abstractEmp {
	private final String url = "jdbc:mariadb://localhost:3306/users";
	private final String user = "root";
	private final String password = "root";
	
	protected Connection con = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	public void connect() throws SQLException {
		con = DriverManager.getConnection(url, user, password);
		con.setAutoCommit(true);
		System.out.println("you are connected");
	}
	public void disconnect() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(ps != null) {
			ps.close();
		}
		if(con != null) {
			con.close();
		}
	}
}
