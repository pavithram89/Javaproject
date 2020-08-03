package configure;
import java.sql.*;
public class JDBCConfiguration {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
			String url="jdbc:sqlserver://DESKTOP-SEOJ2RF\\SQLEXPRESS:1434;database=PCSDB";
			String username="sa";
			String password="niit@123";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn=DriverManager.getConnection(url,username,password);
			return conn;
		}
	}
	
	
