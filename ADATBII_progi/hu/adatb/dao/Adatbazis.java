package hu.adatb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class Adatbazis {
	
	public String sql = null;
	public Statement stmt;
	public PreparedStatement ps;

	public void connectToDatabase() {

		try {
		
			OracleDataSource ods = new OracleDataSource();
			Class.forName("oracle.jdbc.OracleDriver");
			ods.setURL("jdbc:oracle:thin:@orania.inf.u-szeged.hu:1521:kabinet");
			Connection conn = ods.getConnection("H764538", "H764538");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,  ResultSet.CONCUR_READ_ONLY);
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	public void hallgatotLekerdez(String nick) {
		
		
		//sql = "Select * From b_Hallgato Where nickname = '"+nick+"'";
		sql = "select * from b_Hallgato";
		System.out.println(sql);
		try {
		ResultSet rs = stmt.executeQuery(sql);		
			rs.next();
			while(rs.next()) {
				System.out.println("asd");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	}

}