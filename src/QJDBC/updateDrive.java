package QJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopx","root","root");
			
			PreparedStatement ps=con.prepareStatement("update shop set product='Desktop' where pnumber=101");
			
			int i = ps.executeUpdate();
			
			if(i>0) {
				System.out.println("Update Successfully");
			}else {
				System.out.println("Somethis os Wrong");
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
