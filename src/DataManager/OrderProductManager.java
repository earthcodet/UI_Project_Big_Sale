package DataManager;

import java.awt.image.BufferedImage;
import java.beans.Statement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.imageio.ImageIO;

import DatabaseAndTools.MySQLConnector;

public class OrderProductManager {
	LinkedList<OrderProductDB> listNP;
	void saveTable_order(int priceAll, String email) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "INSERT INTO `order` VALUES (0, ?, ?, ?)"; 
			PreparedStatement st = conn.prepareStatement(query);
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			st.setString(1, (String)dateFormat.format(date));
			st.setInt(2, priceAll);
			st.setString(3, email);
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	void saveTable_order_detail(int order_id, int product_id,int product_count,int product_price_productAll) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "INSERT INTO `order_detail` VALUES (0, ?, ?, ?, ?)"; 
			PreparedStatement st = conn.prepareStatement(query);
			st.setInt(1, order_id);
			st.setInt(2, product_id);
			st.setInt(3, product_count);
			st.setInt(4, product_price_productAll);
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	public static LinkedList<OrderProductDB> get_Image_Order(int user_id) {
		LinkedList<OrderProductDB> listNP = new LinkedList<OrderProductDB>();
		ArrayList<Integer> order_id = new ArrayList<Integer> ();
		LinkedList<OrderProductDB> detailOrder = new LinkedList<OrderProductDB>();
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "SELECT * FROM `order`";
			
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet rec = st.executeQuery();
			while (rec.next()) {
				if(rec.getInt("user_id")==user_id) {
				order_id.add(rec.getInt("order_id"));
				OrderProductDB temp = new OrderProductDB(rec.getString("order_date"),rec.getInt("order_priceAll"));
				detailOrder.add(temp);
				}
				}
			for(int i = 0;i< order_id.size();i++) {
			query = "SELECT product_id FROM order_detail WHERE order_id='"+order_id.get(i)+"'";
			st = conn.prepareStatement(query);
			rec = st.executeQuery();
			while (rec.next()) {
				query = "SELECT image FROM imageproduct WHERE product_id='"+rec.getInt("product_id")+"'";
				PreparedStatement st2 = conn.prepareStatement(query);
				ResultSet rec2 = st2.executeQuery();
				
				while (rec2.next()) {
					
					BufferedImage buffimg = null;
					byte[] img_byte = rec2.getBytes(1);
					if (img_byte == null || img_byte.length == 0) {} 
					else {
						ByteArrayInputStream bais = new ByteArrayInputStream(img_byte);
						buffimg = ImageIO.read(bais);
						bais.close();
					}
					OrderProductDB pb = new OrderProductDB(order_id.get(i),detailOrder.get(i).get_date(),detailOrder.get(i).get_priceAll(),buffimg);
					listNP.add(pb);
				}
				}
			}
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
		return listNP;
	}
}
