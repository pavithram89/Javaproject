package mainView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import view.LoginFrame;

public class MainClass {
	
		public static Connection main(String[] args) throws ClassNotFoundException, SQLException {
		
		new LoginFrame();
		return null;

	}

}
