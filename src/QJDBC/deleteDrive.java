package QJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopx","root","root");	
			
			PreparedStatement ps= con.prepareStatement("DELETE FROM shop WHERE pnumber = 4");
			int i=ps.executeUpdate();
			
			if(i>0) {
				System.out.println("Query Deleted");
			}else {
				System.out.println("Query Not Delete"
						+ "");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
