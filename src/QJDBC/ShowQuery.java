package QJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopx","root","root");	
				Statement stm=con.createStatement(); //if We Wont to show The all Data in a console that time we create statement
				ResultSet rs=stm.executeQuery("select * from shop"); //Pass the Query in a execute Query 
				
					int sid;
					String product;
					int pnumber;
				
				while(rs.next()) {
					sid=rs.getInt("sid");
					product = rs.getString("product");
					pnumber = rs.getInt("pnumber");
					
					System.out.println(sid+" "+product+" "+pnumber);
				}
				
							
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
