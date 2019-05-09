package hu.adatb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

public class Adatbazis {

	public String sql = null;
	public Statement stmt;
	public PreparedStatement ps;
	public List<String> row = new ArrayList<String>();
	
	

	public void connectToDatabase() {

		try {

			OracleDataSource ods = new OracleDataSource();
			Class.forName("oracle.jdbc.OracleDriver");
			ods.setURL("jdbc:oracle:thin:@orania.inf.u-szeged.hu:1521:kabinet");
			Connection conn = ods.getConnection("H764538", "H764538");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public String hallgatotLekerdez(String nick) {

		sql = "Select * From b_Hallgato Where nickname = '" + nick + "'";
		// sql = "select * from b_Hallgato";
		System.out.println(sql);
		try {
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			return rs.getString(2);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return "";

	}

	public List<String> listAll(String table) {
		sql = "Select * From " + table;
		System.out.println(sql);
		try {
			ResultSet rs = stmt.executeQuery(sql);

			
			
			
			
			
			switch (table) {
			case "b_hallgato":

				while (rs.next()) {
					//row = rs.getString(1), rs.getString(2), rs.getString(3) ;
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
				}
				
				return row;

			case "b_kerdesek":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
				}
				return row;


			case "b_szoba":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
				}
				return row;

			case "b_tantargyak":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
				}
				return row;

			case "b_lehetsegesvalaszok":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
					row.add(rs.getString(4));
					row.add(rs.getString(5));
					row.add(rs.getString(6));
				}
				return row;

			case "b_helyesvalaszok":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
					row.add(rs.getString(4));
				}
				return row;

			case "b_kreditnyeremeny":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
					row.add(rs.getString(4));
				}
				return row;

			case "b_sugo":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
				}
				return row;

			case "b_puska":
				while (rs.next()) {
					row.add(rs.getString(1));
					row.add(rs.getString(2));
					row.add(rs.getString(3));
				}
				return row;


			default:
				break;
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;

	}

}
