
package hu.adatb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import oracle.jdbc.pool.OracleDataSource;

import javax.swing.*;

public class Adatbazis {

	public String sql = null;
	public Statement stmt;
	public PreparedStatement ps;
	public List<String> row = new ArrayList<String>();

	public void connectToDatabase() {

		try {

			OracleDataSource ods = new OracleDataSource();
			Class.forName("oracle.jdbc.OracleDriver");
			ods.setURL("jdbc:oracle:thin:@localhost:4000:kabinet");
			Connection conn = ods.getConnection("H764538", "H764538");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public String hallgatotLekerdez(String nick) {

		sql = "Select * From b_Hallgato Where nickname = '" + nick + "'";
		System.out.println(sql);
		try {
			ResultSet rs = stmt.executeQuery(sql);

			rs.next();
			row.add(rs.getString(2));
			row.add(rs.getString(3));
			return Arrays.toString(row.toArray());

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

	public List<String> deleteByName(String table, JTextField name) throws SQLException {

		// lehessen torolni: kerdeseket,szobakat,hallgatokat,tantargyakat

		switch (table) {
			case "b_hallgato":
				sql = "delete From " + table + "Where nickname = '" + name + "'";
				System.out.println(sql);
				break;
			case "b_kerdesek":

				//kerdeseket kerdesid alapjan torolsz, mert nincs neve
				//deleting children from other tables is obligatory

				sql = "delete from b_sugo where kerdesid = " + name;
				stmt.executeQuery(sql);

				sql = "delete from b_puska where kerdesid = " + name;
				stmt.executeQuery(sql);

				sql = "delete from b_lehetsegesvalaszok where kerdesid = " + name;
				stmt.executeQuery(sql);

				sql = "delete from b_helyesvalaszok where kerdesid = " + name;
				stmt.executeQuery(sql);

				System.out.println("deleted all children");

				sql = "delete From " + table + " Where kerdesid = " + name;

				break;
			case "b_szoba":

				sql = "delete From " + table + "Where szobanev = '" + name + "'";
				System.out.println(sql);
				break;
			case "b_tantargyak":

				sql =  "select temakorid from b_tantargyak where targyneve = '" +name+"'";
				ResultSet rs = stmt.executeQuery(sql);
				rs.next();
				String tmp = rs.getString(1);


				sql="delete from b_kreditnyeremeny where temakorid = "+tmp;

				System.out.println(sql);
				stmt.executeQuery(sql);

				sql = "delete From " + table + " " + "Where targyneve = '" + name + "'";

				break;
			default:
				System.out.println("ez a tabla nem modosithato");
				return null;
		}

		System.out.println(sql);

		stmt.executeQuery(sql);

		return null;
	}

	//add hallgato,kerdes,szoba,tantargy

	public void addRecord(String table, String...strings ) throws SQLException {

		switch(table) {
			case("b_hallgato"):
				//	nickname, szoba, korosztaly
				sql= "insert into " + table + " values( '"+ strings[0] +"',"+ 0 +",'"+ strings[1]+"')";
				//sql = "insert into " + table + "values(?, ?, ?)";
				System.out.println(sql);
				stmt.executeQuery(sql);
				break;

			case("b_kerdesek"):

				/*SORREND:
				 * kerdesid, temakorid, kerdes, [0,1,2]
				 * lvid = kerdesid, valasz a-b-c-d, [0,3,4,5,6]
				 * hvid = kerdesid, betujel, helyesvalasz [0,7,8]
				 * sugo, [0,0,9]
				 * puska, [0,0,10]
				 */


				sql = "insert into " + table +" values("+strings[0]+","+strings[1]+",'"+strings[2]+"')";
				stmt.executeQuery(sql);

				sql = "insert into b_lehetsegesvalaszok values("+strings[0]+","+strings[0]+",'"+strings[3]+"','"+strings[4]+"','"+strings[5]+"','"+strings[6]+"')";
				stmt.executeQuery(sql);

				sql = "insert into b_helyesvalaszok values("+strings[0]+","+strings[0]+",'"+strings[7]+"','"+strings[8]+"')";
				stmt.executeQuery(sql);

				sql = "insert into b_sugo values("+strings[0]+","+strings[0]+",'"+strings[9]+"')";
				stmt.executeQuery(sql);

				sql = "insert into b_puska values("+strings[0]+","+strings[0]+",'"+strings[10]+"')";
				stmt.executeQuery(sql);
				break;

			case("b_szoba"):
				//szobanev
				sql= "insert into " + table + " values( '"+ strings[0]+"'," + 0 +")";
				System.out.println(sql);
				stmt.executeQuery(sql);
				break;

			case("b_tantargyak"):
				//temakorid, nev, kreditertek
				sql= "insert into " + table + " values( "+ strings[0]+ ",'" +strings[1] +"')";
				System.out.println(sql);
				stmt.executeQuery(sql);

				sql="insert into b_kreditnyeremeny values("+strings[0]+","+strings[2]+")";
				stmt.executeQuery(sql);

				break;

			default:
				System.out.println("ilyen tablat nem lehet letrehozni");
				return;
		}

	}

	//TODO:modify, parameters: primary key, value(s) to modify

	public void updateRow() {

	}

	//get question: question,answers,helps. Difficulty
	List<String> kerdesek = new ArrayList<String>();
	public void getQuestion(String difficulty) throws SQLException {

		//difficulty = szoba

		Random r = new Random();
		int temakor;
		int kerdes;

		switch(difficulty) {

			case("Elsos"):
				temakor = r.nextInt(3)+1;
				sql = "select kerdesid from b_kerdesek where temakorid = "+temakor;
				System.out.println(sql);
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					kerdesek.add(rs.getString(1));
				}

				kerdes = r.nextInt(kerdesek.size())+1;

				sql = "select b_kerdesek.kerdes,b_lehetsegesvalaszok.valasza,b_lehetsegesvalaszok.valaszb,b_lehetsegesvalaszok.valaszc,b_lehetsegesvalaszok.valaszd,b_sugo.sugas,b_puska.loszer" +
						" from b_kerdesek,b_puska,b_lehetsegesvalaszok,b_helyesvalaszok,b_sugo" +
						" where b_kerdesek.kerdesid = "+ kerdes +
						" and b_kerdesek.kerdesid = b_puska.kerdesid " +
						" and b_kerdesek.kerdesid = b_lehetsegesvalaszok.kerdesid" +
						" and b_kerdesek.kerdesid = b_helyesvalaszok.kerdesid" +
						" and b_kerdesek.kerdesid = b_sugo.kerdesid";



				System.out.println(sql);

				System.out.println("---------------------------------------");
				System.out.println("TEMAKOR: "+ temakor + " KERDES: "+ kerdes);
				System.out.println("---------------------------------------");

				rs = stmt.executeQuery(sql);
				rs.next();
				System.out.println(rs.getString(1)+"\n A: "+rs.getString(2)+"\n B: "+rs.getString(3)+"\n C: "+rs.getString(4)+"\n D: "+rs.getString(5)+"\n Help1: "+rs.getString(6)+"\n Help2: "+ rs.getString(7));
				break;

			case("Masodikos"):
				temakor = r.nextInt(7)+1;


				break;

			case("Harmadikos"):
				temakor = r.nextInt(10)+1;


				break;

			default:

				temakor = r.nextInt(10)+1;
				break;

		}
	}

	//TODO:get answer parameterben eleg lesz a betujel

	public void getAnswer() {


	}





}