package DataManager;

import java.awt.image.BufferedImage;

public class NewProductDB {
	private int NewProduct_ID;
	private BufferedImage img;
	private String NewProduct_type;
	public NewProductDB(BufferedImage img) {
		this.img = img;
	}
	public NewProductDB(BufferedImage img, String type) {
		this.img = img;
		NewProduct_type = type;
	}
	public NewProductDB(int id, BufferedImage img, String type) {
		NewProduct_ID = id;
		this.img = img;
		NewProduct_type = type;
	}
	public int getNewProduct_ID() {
		return NewProduct_ID;
	}
	public BufferedImage getNewProduct_Img() {
		return img;
	}
	public String getNewProduct_Type() {
		return NewProduct_type;
	}
}
