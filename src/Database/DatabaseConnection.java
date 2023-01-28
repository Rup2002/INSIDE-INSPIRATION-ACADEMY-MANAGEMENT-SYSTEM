package Database;
import java.sql.*;
public class DatabaseConnection {
	private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/insideinspirationacademydatabase";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Ankit2602@";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch(ClassNotFoundException e){
			System.out.println("Connection not Established");
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
