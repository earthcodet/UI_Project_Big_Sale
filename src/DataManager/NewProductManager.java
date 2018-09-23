package DataManager;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import javax.imageio.ImageIO;

import DatabaseAndTools.MySQLConnector;

public class NewProductManager {
	
	public static LinkedList<NewProductDB> getAllNew_Product() {
		LinkedList<NewProductDB> listNP = new LinkedList<NewProductDB>();
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "SELECT * FROM new_product";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				int np_id = rs.getInt(1);
				BufferedImage buffimg = null;
				byte[] img_byte = rs.getBytes(2);
				if (img_byte == null || img_byte.length == 0) {} 
				else {
					ByteArrayInputStream bais = new ByteArrayInputStream(img_byte);
					buffimg = ImageIO.read(bais);
					bais.close();
				}
				String np_type = rs.getString(3);
				NewProductDB pb = new NewProductDB(np_id, buffimg, np_type);
				listNP.add(pb);
			}
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
		return listNP;
	}
	public static LinkedList<NewProductDB> getAllNew_Product_Image() {
		LinkedList<NewProductDB> listNP = new LinkedList<NewProductDB>();
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "SELECT img FROM new_product";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				BufferedImage buffimg = null;
				byte[] img_byte = rs.getBytes(1);
				if (img_byte == null || img_byte.length == 0) {} 
				else {
					ByteArrayInputStream bais = new ByteArrayInputStream(img_byte);
					buffimg = ImageIO.read(bais);
					bais.close();
				}
				NewProductDB pb = new NewProductDB(buffimg);
				listNP.add(pb);
			}
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
		return listNP;
	}
	public static void saveNew_Product(NewProductDB x) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "INSERT INTO new_product VALUES (0, ?, ?)"; 																								
			PreparedStatement st = conn.prepareStatement(query);
			if (x.getNewProduct_Img() != null) {
				ByteArrayOutputStream outStream = new ByteArrayOutputStream();
				ImageIO.write(x.getNewProduct_Img(), "jpg", outStream);
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
	public static void editNew_Product(NewProductDB x) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "UPDATE new_product SET type_product = '"+x.getNewProduct_Type()+"' WHERE ID = " + x.getNewProduct_ID();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			st.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}
	public static void deleteNew_Product(NewProductDB x) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "DELETE FROM new_product WHERE ID = " + x.getNewProduct_ID();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			st.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}
}