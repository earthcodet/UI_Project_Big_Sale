package Service;


public class SettingService {
	public static String isValidName(String password) {
		String alret = "error";
		if(password.length()==0) {
			alret = "ช่องนี้เว้นว่างไม่ได้";
			return alret;
		}
		if(password.length()<2||password.length()>50) {
			alret="ชื่อควรมีความยาวอยู่ระหว่าง 2-50 ตัวอักษร";
			return alret;
		}
		else{
			if (password.matches("\\w+")&&!password.matches(".*[0-9].*")) { 
				return "PASS";
			} else
				alret= "กรุณาใส่ชื่อภาษาอังกฤษเท่านั้น";
			
		}
		return alret;
	}
	public static String isValidPhone(String phone) {
		int length = phone.length();
		String result="error";
		if(length==0) {
			result = "ช่องนี้เว้นว่างไม่ได้";
			return result;
		}
		if(length!=10) {
			result="เบอร์โทรมีความยาวอยู่ที่ 10 ตัวอักษร";
			return result;
		}
		else{
			if (phone.matches("^[0]+[0-9]+$")&&length==10) { 
				result=  "PASS";
				return result;
			} else {
				result= "รูปแบบเบอร์โทรไม่ถูกต้อง";
				return result;
			}
		}
	}
	public static String isValidAddress(String address) {
		int length = address.length();
		String result="error";
		if(length==0) {
			result = "ช่องนี้เว้นว่างไม่ได้";
			return result;
		}
		if(length > 200) {
			result = "ที่อยู่ควรอยู่ระหว่าง 200 ตัวอักษร";
			return result;
		}else {
			if (address.matches("\\w+")) {
				result = "PASS";
				return result;
			}else {
				result = "กรุณากรอกภาษาอังกฤษหรือตัวเลขเท่านั้น";
				return result;
			}
		}
	}
	public static String isValidDistrict(String district) {
		int length = district.length();
		String result="error";
		if(length==0) {
			result = "ช่องนี้เว้นว่างไม่ได้";
			return result;
		}
		if(length > 50) {
			result = "เขตควรอยู่ระหว่าง 200 ตัวอักษร";
			return result;
		}else {
			if (district.matches("\\w+")) {
				result = "PASS";
				return result;
			}else {
				result = "กรุณากรอกภาษาอังกฤษหรือตัวเลขเท่านั้น";
				return result;
			}
		}
	}
	public static String isValidZipcode(String zipcode) {
		int length = zipcode.length();
		String result="error";
		if(length==0) {
			result = "ช่องนี้เว้นว่างไม่ได้";
			return result;
		}
		if(length !=5) {
			result = "เขตควรอยู่ระหว่าง 5 ตัวอักษร";
			return result;
		}else {
			try {
				int tempInt = Integer.parseInt(zipcode);
				result = "PASS";
				return result;
			}catch(Exception ex) {
				result = "กรุณากรอกตัวเลขเท่านั้น";
				return result;
			}
		}
	}
	public static void main(String[] a) {
		System.out.println(isValidZipcode("fdsf"));
		System.out.println(isValidZipcode("กหฟกฟ"));
		System.out.println(isValidZipcode("10124"));
		System.out.println(isValidZipcode("000000"));
	}
}
