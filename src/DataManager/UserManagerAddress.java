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
					   String name =rec.getString("table_name");
					   AddressDB temp = new AddressDB(phone, address, province, district, zipcode,name);
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
		
		public boolean  saveTable_address(int user_id,String phone ,String address,String province,String district,String zipcode,String name) {
			boolean checkPushAddress=true;
			int table_id = 0;
			try {
				Connection conn = MySQLConnector.Connect();
				Statement stc = conn.createStatement();
				ResultSet rec = stc.executeQuery("SELECT * FROM address");
				while (rec.next()) {
					if(user_id==rec.getInt("user_id")){
						table_id = rec.getInt("table_id");
						checkPushAddress=false;
					}
				}
				if(checkPushAddress) {
				String query = "INSERT INTO `address` VALUES (0, ?, ?, ?, ?, ?, ?,?)"; 
				PreparedStatement st = conn.prepareStatement(query);
				st.setInt(1, user_id);
				st.setString(2, phone);
				st.setString(3, address);
				st.setString(4, province);
				st.setString(5, district);
				st.setString(6, zipcode);
				st.setString(7, name);
				st.executeUpdate();
				st.close();
				return true;}
				else{
					String query = "UPDATE new_product SET user_id = ?, "
							+	"table_phone = ?"
							+	"table_address = ?"
							+ 	"table_province = ?"
							+ 	"table_district = ?"
							+ 	"table_zipcode = ?"
							+	"table_name = ?"
							+ "WHERE ID = " + table_id;
					PreparedStatement st = conn.prepareStatement(query);
					st.setInt(1, user_id);
					st.setString(2, phone);
					st.setString(3, address);
					st.setString(4, province);
					st.setString(5, district);
					st.setString(6, zipcode);
					st.setString(7, name);
					st.executeUpdate(query);
				}
			} catch (Exception e) {
				System.out.println(e);
				
			}
			return false;
		}
	}
