package DataManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.Collator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import DatabaseAndTools.DataCredentials;
import DatabaseAndTools.MySQLConnector;


public class ss {

	public static void main(String[] args) {
		UserManager a = new UserManager();
		//a.Insert(email, phone, password, name, date, gender);
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		System.out.println(compare("abc", "ÀBC", Collator.PRIMARY)); //base char
		System.out.println(compare("abc", "ÀBC", Collator.SECONDARY)); //base char + accent
		System.out.println(compare("abc", "ÀBC", Collator.TERTIARY)); //base char + accent + case
		System.out.println(compare("abc", "ÀBC", Collator.IDENTICAL));
		a.Insert("email@hotmail.com","0321445789","champ123","ภานุวีฒน์ ฤหะรมณ์","14/04/2541","ชาย");
	}
	private static int compare(String first, String second, int strength) {
		   Collator collator = Collator.getInstance();
		   collator.setStrength(strength);
		   return collator.compare(first, second);
		}
	private static void Insert(String email, String phone,String password ,String name,String date,String gender) {
		try {	
					String myDriver = "org.gjt.mm.mysql.Driver";
					String jdbc = "jdbc:mysql://127.0.0.1:3306/bigsale" ;
					String jdbcutf8 = "&useUnicode=true&characterEncoding=UTF-8";
		   			Connection conn = DriverManager.getConnection(jdbc+jdbcutf8);
					String query= "INSERT INTO `user` VALUES(0,?,?,?,?,?,?,?)"; 	
					PreparedStatement stmt = conn.prepareStatement(query);
					stmt.setString(1, phone);
					stmt.setString(2, password);
					stmt.setString(3, name);
					stmt.setString(4, "user");
					stmt.setString(5, date);
					stmt.setString(6, gender);
					stmt.setString(7, email);
					stmt.executeUpdate();
			    } catch (Exception exo) {
			    	System.out.println(exo);
			    }
	}
}
