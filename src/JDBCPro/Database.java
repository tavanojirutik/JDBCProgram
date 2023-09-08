package JDBCPro;
import java.sql.*;

public class Database {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:‪C://sqllite//univ.bd");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from dept");
		
		int deptno;
		String dname;
		
		while(rs.next()) {
			deptno=rs.getInt("deptno");
			dname =rs.getString("dname");
			
			System.out.println(deptno+" "+dname);
		}
		
	}	

}
