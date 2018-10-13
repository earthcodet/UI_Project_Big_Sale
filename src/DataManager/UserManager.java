package DataManager;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;

import DatabaseAndTools.MySQLConnector;

public class UserManager {
	private String nameUser;
	public String getNameUserLogin() {
		return nameUser;
	}
	public static void saveNew_Product(NewProductDB x) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "INSERT INTO new_product VALUES (0, ?, ?)"; 																								
			PreparedStatement st = conn.prepareStatement(query);
			if (x.getNewProduct_Img() != null) {
				ByteArrayOutputStream outStream = new ByteArrayOutputStream();
				ImageIO.write(x.getNewProduct_Img(), "jpg", outStream);
				ImageIO.write(x.getNewProduct_Img(), "png", outStream);
				ImageIO.write(x.getNewProduct_Img(), "jpeg", outStream);
				st.setBytes(1, outStream.toByteArray());
				outStream.close();
			} else 
				st.setBytes(1, new byte[0]);
			st.setString(2, x.getNewProduct_Type());
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
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
			ResultSet rec = st.executeQuery("SELECT phone,email,password,type,name FROM user");
			//Email
			while (rec.next()) {
			   if ((user.equals(rec.getString("email"))||user.equals(rec.getString("phone")))&&password.equals(rec.getString("password"))) {
				   nameUser=rec.getString("name");
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
				String query= "INSERT INTO user(email,phone,password,name,type,date,gender) VALUES(?,?,?,?,?,?,?)"; 	
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, email);
				stmt.setString(2, phone);
				stmt.setString(3, password);
				stmt.setString(4, name);
				stmt.setString(5, "user");
				stmt.setString(6, date);
				stmt.setString(7, gender);
				stmt.executeUpdate();
				return true;
		    } catch (Exception exo) {
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