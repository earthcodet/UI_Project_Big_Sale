package DataManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;


public class ss {

	public static void main(String[] args) {
		UserManagerAddress a = new UserManagerAddress();
		LinkedList<AddressDB> listNP = new LinkedList<AddressDB>();
		listNP = a.getAddress(1);
		System.out.println(listNP.size());
		OrderProductManager b = new OrderProductManager();
		LinkedList<OrderProductDB> c =b.get_Image_Order(1);
		System.out.println(c.size());
	}

}
