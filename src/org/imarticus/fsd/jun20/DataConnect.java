package org.imarticus.fsd.jun20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC - Java Database Connectivity

public class DataConnect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Start");
		
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "HR";
		String password = "hr";
		String sql = "SELECT * FROM employees";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		Class.forName(className);
		con = DriverManager.getConnection(url, user, password);
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int columnIndex = 1;
			for(int i=1; i<rs.getFetchSize(); i++) {
				System.out.print(rs.getString(columnIndex)+"\t");
				columnIndex++;
			}
			System.out.println("\n");
		}
		rs.close();
		con.close();
		System.out.println("End");
	}
}
