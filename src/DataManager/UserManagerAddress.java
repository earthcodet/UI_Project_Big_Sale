package DataManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import DatabaseAndTools.MySQLConnector;

	public class UserManagerAddress {
		public LinkedList<AddressDB> getAddress(int user_id) {
			LinkedList<AddressDB> listNP = new LinkedList<AddressDB>();
		    try {
		    	Connection conn = MySQLConnector.Connect();
				Statement st = conn.createStatement();
				ResultSet rec = st.executeQuery("SELECT * FROM address");
				while (rec.next()) {
				   if (user_id==rec.getInt("user_id")) {
					   String phone = rec.getString("table_phone");
					   String address = rec.getString("table_address");
					   String province = rec.getString("table_province");
					   String district = rec.getString("table_district");
					   String zipcode = rec.getString("table_zipcode");
					   AddressDB temp = new AddressDB(phone, address, province, district, zipcode);
					   listNP.add(temp);
				   }
				}
				return listNP;
			
			
		    } catch (Exception exo) {
		    	System.out.println("this");
		    	System.out.println(exo);
		    }
		    return listNP;
		}
		public String getEmail(int user_id) {
			String email="";
			try {
		    	Connection conn = MySQLConnector.Connect();
				Statement st = conn.createStatement();
				ResultSet rec = st.executeQuery("SELECT email,user_id FROM user");
				while (rec.next()) {
				   if (user_id==rec.getInt("user_id")) {
					   email=rec.getString("email");
				   }
				}
			return email;
			} catch (Exception exo) {
		    	System.out.println(exo+"sexy");
		    }
		    return email;
		}
	}
