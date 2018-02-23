/**
 * 
 */
package com.evan.context_service.db;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author 310199253
 *
 */
public class TestDb {

	public static void main(String[] args) {

		try {
			Class.forName("org.h2.Driver");

			String dbfilePath = getDbFilePath();

			Connection conn = DriverManager.getConnection("jdbc:h2:" + dbfilePath, "sa", "");

			// do something here
			
			Statement stmt = conn.createStatement();
			
//			String sql = "CREATE TABLE TEST(ID INT, NAME VARCHAR); INSERT INTO TEST VALUES(1, 'Hello'), (2, 'World')";
			
			String sql = "select * from test";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			 while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         String name = rs.getString("name");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.println(", Name: " + name);
		      }
			

			// close
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return
	 * @throws URISyntaxException
	 */
	private static String getDbFilePath() throws URISyntaxException {
		String dbFolder = "C:\\workspace\\context-service\\contextService-db\\src\\main\\resources\\dbfiles\\test";
		String dbName = "test";

		return dbFolder + "\\" + dbName;
	}

}
