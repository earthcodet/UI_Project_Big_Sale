package DatabaseAndTools;

import java.sql.Connection;
import java.sql.DriverManager;

public interface MySQLConnector {
	public static Connection Connect() {
		try {
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + DataCredentials.DATABASE_LOCATION + ":" + DataCredentials.DATABASE_PORT + "/"
					+ DataCredentials.DATABASE_DATABASE_NAME;
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, DataCredentials.DATABASE_USERNAME,
					DataCredentials.DATABASE_PASSWORD);
			return conn;
		}
		catch(Exception e) {
			System.err.println("Got Exception ");
			e.printStackTrace();
		}
		return null;
	}
}