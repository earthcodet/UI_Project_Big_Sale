package DataManager;

import java.awt.image.BufferedImage;

public class OrderProductDB {
	private String order_date;
	private int order_id;
	private int order_priceAll;
	private String email;
	private BufferedImage img;
	
	
	OrderProductDB(String date ,int price) {
		order_date = date;
		order_priceAll = price;
	}
	
	OrderProductDB(int oid,String date,int priceAll,BufferedImage img){
		order_date = date;
		order_priceAll = priceAll;
		order_id = oid;
		this.img = img;
	}
	public String get_date() {
		return order_date;
	}
	public int get_priceAll() {
		return order_priceAll;
	}
	public int get_order_id() {
		return order_id;
	}
	public String toString() {
		return order_id+" "+order_date+" "+order_priceAll+" "+img;
	}
	public BufferedImage getNewProduct_Img() {
		return img;
	}
}
