package Service;


public class SettingService {
	public static String isValidName(String password) {
		String alret = "error";
		if(password.length()==0) {
			alret = "��ͧ��������ҧ�����";
			return alret;
		}
		if(password.length()<2||password.length()>50) {
			alret="���ͤ���դ���������������ҧ 2-50 ����ѡ��";
			return alret;
		}
		else{
			if (password.matches("\\w+")&&!password.matches(".*[0-9].*")) { 
				return "PASS";
			} else
				alret= "��س������������ѧ�����ҹ��";
			
		}
		return alret;
	}
	public static String isValidPhone(String phone) {
		int length = phone.length();
		String result="error";
		if(length==0) {
			result = "��ͧ��������ҧ�����";
			return result;
		}
		if(length!=10) {
			result="�������դ������������ 10 ����ѡ��";
			return result;
		}
		else{
			if (phone.matches("^[0]+[0-9]+$")&&length==10) { 
				result=  "PASS";
				return result;
			} else {
				result= "�ٻẺ���������١��ͧ";
				return result;
			}
		}
	}
	public static String isValidAddress(String address) {
		int length = address.length();
		String result="error";
		if(length==0) {
			result = "��ͧ��������ҧ�����";
			return result;
		}
		if(length > 200) {
			result = "������������������ҧ 200 ����ѡ��";
			return result;
		}else {
			if (address.matches("\\w+")) {
				result = "PASS";
				return result;
			}else {
				result = "��سҡ�͡�����ѧ������͵���Ţ��ҹ��";
				return result;
			}
		}
	}
	public static String isValidDistrict(String district) {
		int length = district.length();
		String result="error";
		if(length==0) {
			result = "��ͧ��������ҧ�����";
			return result;
		}
		if(length > 50) {
			result = "ࢵ������������ҧ 200 ����ѡ��";
			return result;
		}else {
			if (district.matches("\\w+")) {
				result = "PASS";
				return result;
			}else {
				result = "��سҡ�͡�����ѧ������͵���Ţ��ҹ��";
				return result;
			}
		}
	}
	public static String isValidZipcode(String zipcode) {
		int length = zipcode.length();
		String result="error";
		if(length==0) {
			result = "��ͧ��������ҧ�����";
			return result;
		}
		if(length !=5) {
			result = "ࢵ������������ҧ 5 ����ѡ��";
			return result;
		}else {
			try {
				int tempInt = Integer.parseInt(zipcode);
				result = "PASS";
				return result;
			}catch(Exception ex) {
				result = "��سҡ�͡����Ţ��ҹ��";
				return result;
			}
		}
	}
	public static void main(String[] a) {
		System.out.println(isValidZipcode("fdsf"));
		System.out.println(isValidZipcode("�˿��"));
		System.out.println(isValidZipcode("10124"));
		System.out.println(isValidZipcode("000000"));
	}
}
