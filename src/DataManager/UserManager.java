package DataManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import DatabaseAndTools.MySQLConnector;

public class UserManager {
	private String nameUser;
	private int user_id;
	public int getUserID() {
		return user_id;
	}
	public String getNameUserLogin() {
		return nameUser;
	}
	public boolean check_Email(String text) {
	    try {
	    	Connection conn = MySQLConnector.Connect();
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT email FROM user");
			//Email
			while (rec.next()) {
			   if (text.equals(rec.getString("email"))) {
				   return false;
				   }
			}
			return true;
		
		
	    } catch (Exception exo) {
	    	return true;
	    }
	}
	public boolean check_Phone(String text) {
		  try {
		    	Connection conn = MySQLConnector.Connect();
				Statement st = conn.createStatement();
				ResultSet rec = st.executeQuery("SELECT phone FROM user");
				//Email
				while (rec.next()) {
				   if (text.equals(rec.getString("phone"))) {
					   
					   return false;
					   }
				}
				return true;
			
			
		    } catch (Exception exo) {
		    	return true;
		    }
		}
	public String checkLogin(String user,String password ) {

		try {
			String txt = "error";
			Connection conn = MySQLConnector.Connect();
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT user_id,phone,email,password,type,name FROM user");
			//Email
			while (rec.next()) {
			   if ((user.equals(rec.getString("email"))||user.equals(rec.getString("phone")))&&password.equals(rec.getString("password"))) {
				   nameUser=rec.getString("name");
				   user_id = rec.getInt("user_id");
				   txt = rec.getString("type");
				   }
			}
			return txt;
		
		
		}catch(Exception ex) {
			System.out.println(ex);
			return "error";
		}
	}
	public String forget(String check ) {
		try {
			Connection conn = MySQLConnector.Connect();
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT email,phone,password,name FROM user");
			//Email
			String txt ="";
			while (rec.next()) {
			   if (check.equals(rec.getString("email")) ){
				   txt = "email";
				   txt = txt+" "+rec.getString("name");
				   txt = txt+" "+rec.getString("password");
				   return txt;
				   }
			   if (check.equals(rec.getString("phone")) ){
				   txt = "phone";
				   txt = txt+" "+rec.getString("name");
				   txt = txt+" "+rec.getString("password");
				   return txt;
				   }
			}
			return "notFound";
		
		
		}catch(Exception ex) {
			return "notFound";
		}
	}
	 public boolean Insert(String email, String phone,String password ,String name,String date,String gender) {
		    try {
		    	Connection conn = MySQLConnector.Connect();
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
				return true;
		    } catch (Exception exo) {
		    	System.out.println(exo);
		    	return false;
		    }
	 }
	 public String chackdate(String day2, String mon , String year2) {
		int day = Integer.parseInt(day2);
		int year = Integer.parseInt(year2);
		String month="";
	        switch (mon) {
	            case "มกราคม"		: month =	"01";
	                     break;
	            case "กุมภาพันธ์"	: month =	"02";
	                     break;
	            case "มีนาคม"		: month =	"03";
	                     break;
	            case "เมษายน"		: month =	"04";
	                     break;
	            case "พฤษภาคม"	: month =	"05";
	                     break;
	            case "มิถุนายน"	: month =	"06";
	                     break;
	            case "กรกฎาคม"	: month =	"07";
	                     break;
	            case "สิงหาคม" 	: month =	"08";
	                     break;
	            case "กันยายน"		: month =	"09";
	                     break;
	            case "ตุลาคม"		: month =	"10";
	                     break;
	            case "พฤศจิกายน"	: month =	"11";
	                     break;
	            case "ธันวาคม"		: month =	"12";
	                     break;
	        }
		 if(day==29&&mon.equals("กุมภาพันธ์")&&year%4==0)
			 return day2+"/"+month+"/"+year2;
		 if(day==29&&mon.equals("กุมภาพันธ์")&&year%4!=0)
			 return "error";
		 if(day>=30&&mon.equals("กุมภาพันธ์"))
			 return "error";
		 
		 return day2+"/"+month+"/"+year2;
	 }
	 public String chackgender(String genderto) {
		 String gender = "";
		 if(genderto.equals("ชาย"))
			 gender = "male";
		 if(genderto.equals("หญิง"))
			 gender = "female";
		return gender;
	 }
}