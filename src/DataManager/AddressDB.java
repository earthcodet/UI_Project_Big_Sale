package DataManager;

public class AddressDB {
	String phone;
	String address;
	String province;
	String district;
	String zipcode;
	String name;
	
	public AddressDB(String phone, String address, String province, String district, String zipcode,String name) {
		this.phone=phone;
		this.address=address;
		this.province=province;
		this.district=district;
		this.zipcode=zipcode;

	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address+" "+district+" "+zipcode;
	}
	public String getPhone() {
		return phone;
	}

}
