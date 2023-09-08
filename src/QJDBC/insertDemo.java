package QJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertDemo {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The ID");
		int id = sc.nextInt();
		
		System.out.println("Ener Product Name");
		String pro = sc.next();
		
		System.out.println("Enter The Product ID");
		int pid = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   //Load And Register Driver 
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/shopx","root","root"); //Prepared Connection
			
			PreparedStatement ps=con.prepareStatement("insert into shop values (?,?,?)"); //Execute SQL Statement 
			
			ps.setInt(1, id);
			ps.setString(2, pro);
			ps.setInt(3, pid);
			
			int i=ps.executeUpdate();
			
			if(i > 0) {     //Condition Execute if Value is Greater Then 0 Then Execute
				System.out.println("Value Insert SuccessFull");
			}else {
				System.out.println("Value Not Insert	");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Somethig is Wrong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String nextChar() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
