import java.sql.*;

public class DerbyBaseDao {
	private static final String DB_DRIV = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String DB_URL = "jdbc:derby:ConnectingCreatinJavaDB;create=true";
	// private static final String DB_USER = "P2_USER";
	// private static final String DB_PASS = "P21234";
	Connection conn;

	public DerbyBaseDao() {
		try {
			this.conn = DriverManager.getConnection(DB_URL);
			if (this.conn != null) {
//				System.out.println("connection goed");
			}
		} catch (SQLException e) {
			System.out.println("connection fout");
		}
		
	}
	
	protected static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DB_URL);
	}

} 