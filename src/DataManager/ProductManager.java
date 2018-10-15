package DataManager;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.imageio.ImageIO;

import DatabaseAndTools.MySQLConnector;

public class ProductManager {
	public static void saveTable_imageproduct(NewProductDB x) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "INSERT INTO imageproduct VALUES (0, ?, ?)"; 																								
			PreparedStatement st = conn.prepareStatement(query);
			if (x.getNewProduct_Img() != null) {
				ByteArrayOutputStream outStream = new ByteArrayOutputStream();
				ImageIO.write(x.getNewProduct_Img(), "jpg", outStream);
				st.setBytes(2, outStream.toByteArray());
				outStream.close();
			} else 
				st.setBytes(2, new byte[0]);
			st.setString(1, x.getNewProduct_Type());
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}
	
}
