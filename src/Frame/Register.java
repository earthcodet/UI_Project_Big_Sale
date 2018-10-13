package Frame;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import DataManager.UserManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textphone;
	private JTextField textname;
	private JTextField textemail;
	private JTextField textShow;
	private JPasswordField txtpass;
	static int checkShow=0;
	String passShow ="password";

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		Register n = new Register();
		System.out.println(n.isValid("axcasd6"));
		System.out.println(n.isValid("axca"));
		n.setVisible(true);
	}
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
		    Image img = icon.getImage();
		    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
		    return new ImageIcon(resizedImage);
		    }
	public Register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - สมัครสมาชิก");
		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		setBounds(100, 100, 883, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 877, 85);
		panelMain.setBackground(new Color(8,54,69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E2A\u0E23\u0E49\u0E32\u0E07\u0E1A\u0E31\u0E0D\u0E0A\u0E35\u0E1A\u0E34\u0E4A\u0E01\u0E40\u0E0B\u0E25");
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(51, 0, 345, 82);
		panelMain.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 85, 877, 479);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(25, 13, 826, 450);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textphone = new JTextField();
		textphone.setBounds(426, 197, 366, 50);
		panel_1.add(textphone);
		textphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textphone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C*");
		lblNewLabel_1.setBounds(426, 151, 184, 50);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		
		JLabel label = new JLabel("\u0E0A\u0E37\u0E48\u0E2D - \u0E19\u0E32\u0E21\u0E2A\u0E01\u0E38\u0E25*");
		label.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label.setBounds(426, 13, 169, 33);
		panel_1.add(label);
		
		textname = new JTextField();
		textname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textname.setColumns(10);
		textname.setBounds(426, 59, 366, 50);
		panel_1.add(textname);
		
		JLabel label_1 = new JLabel("\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C*");
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_1.setBounds(31, 13, 83, 33);
		panel_1.add(label_1);
		
		textemail = new JTextField();
		textemail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textemail.setColumns(10);
		textemail.setBounds(31, 59, 366, 50);
		panel_1.add(textemail);
		
		JLabel label_2 = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19*");
		label_2.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_2.setBounds(32, 151, 83, 50);
		panel_1.add(label_2);
		
		textShow = new JTextField();
		textShow.setVisible(false);
		
		JLabel lbleye = new JLabel("");
		lbleye.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbleye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(checkShow==0) {
					passShow = "show";
					textShow.setText(new String(txtpass.getPassword()).trim());
					textShow.setVisible(true);
					txtpass.setVisible(false);
					ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E44\u0E21\u0E48\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(356, 209, 33, 27);
			        int offset = lbleye.getInsets().left;
			        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow++;
				}
				else {
					passShow = "password";
					txtpass.setText(textShow.getText());
					textShow.setVisible(false);
					txtpass.setText(textShow.getText());
					txtpass.setVisible(true);
					ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(356, 209, 33, 27);
			        int offset = lbleye.getInsets().left;
			        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow--;
				}
			}
		});
		ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
		lbleye.setBounds(356, 209, 33, 27);
        int offset = lbleye.getInsets().left;
        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
		panel_1.add(lbleye);
		
		
		txtpass = new JPasswordField();
		txtpass.setColumns(10);
		txtpass.setCaretColor(Color.BLACK);
		txtpass.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtpass.setBackground(Color.WHITE);
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpass.setBounds(32, 197, 317, 50);
		panel_1.add(txtpass);
		textShow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textShow.setColumns(10);
		textShow.setBounds(32, 197, 317, 50);
		panel_1.add(textShow);
		
		JLabel label_3 = new JLabel("\u0E27\u0E31\u0E19\u0E40\u0E14\u0E37\u0E2D\u0E19\u0E1B\u0E35\u0E40\u0E01\u0E34\u0E14*");
		label_3.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_3.setBounds(31, 288, 116, 33);
		panel_1.add(label_3);
		
		JLabel labelalertemail = new JLabel("\u0E23\u0E38\u0E1B\u0E41\u0E1A\u0E1A\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07");
		labelalertemail.setVisible(false);
		labelalertemail.setForeground(Color.RED);
		labelalertemail.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		labelalertemail.setBounds(31, 122, 198, 33);
		panel_1.add(labelalertemail);
		
		JLabel labelalertdate = new JLabel("\u0E23\u0E38\u0E1B\u0E41\u0E1A\u0E1A\u0E27\u0E31\u0E19\u0E40\u0E01\u0E34\u0E14\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07");
		labelalertdate.setVisible(false);
		labelalertdate.setForeground(Color.RED);
		labelalertdate.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		labelalertdate.setBounds(41, 391, 198, 33);
		panel_1.add(labelalertdate);
		
		JLabel labelalertphone = new JLabel("\u0E23\u0E38\u0E1B\u0E41\u0E1A\u0E1A\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07");
		labelalertphone.setVisible(false);
		labelalertphone.setForeground(Color.RED);
		labelalertphone.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		labelalertphone.setBounds(426, 251, 198, 33);
		panel_1.add(labelalertphone);
		
		JLabel lblalertPassword = new JLabel("\u0E0A\u0E48\u0E2D\u0E07\u0E19\u0E35\u0E49\u0E40\u0E27\u0E49\u0E19\u0E27\u0E32\u0E07\u0E44\u0E21\u0E48\u0E44\u0E14\u0E49");
		lblalertPassword.setFont(new Font("CS ChatThai", Font.PLAIN, 20));
		lblalertPassword.setVisible(false);
		lblalertPassword.setForeground(Color.RED);
		lblalertPassword.setBounds(31, 251, 394, 44);
		panel_1.add(lblalertPassword);
		
		JLabel lblalert2 = new JLabel("\u0E0A\u0E48\u0E2D\u0E07\u0E19\u0E35\u0E49\u0E40\u0E27\u0E49\u0E19\u0E27\u0E32\u0E07\u0E44\u0E21\u0E48\u0E44\u0E14\u0E49");
		lblalert2.setVisible(false);
		lblalert2.setForeground(Color.RED);
		lblalert2.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert2.setBounds(426, 109, 266, 44);
		panel_1.add(lblalert2);
		
		JLabel lblalert3 = new JLabel("New label");
		lblalert3.setVisible(false);
		lblalert3.setForeground(Color.RED);
		lblalert3.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert3.setBounds(31, 112, 366, 53);
		panel_1.add(lblalert3);
		
		JLabel lblalert4 = new JLabel("New label");
		lblalert4.setVisible(false);
		lblalert4.setForeground(Color.RED);
		lblalert4.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert4.setBounds(426, 244, 366, 46);
		panel_1.add(lblalert4);
		
		JComboBox cbmon = new JComboBox();
		cbmon.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		cbmon.setModel(new DefaultComboBoxModel(new String[] {"\u0E21\u0E01\u0E23\u0E32\u0E04\u0E21", "\u0E01\u0E38\u0E21\u0E20\u0E32\u0E1E\u0E31\u0E19\u0E18\u0E4C", "\u0E21\u0E35\u0E19\u0E32\u0E04\u0E21", "\u0E40\u0E21\u0E29\u0E32\u0E22\u0E19", "\u0E1E\u0E24\u0E29\u0E20\u0E32\u0E04\u0E21", "\u0E21\u0E34\u0E16\u0E38\u0E19\u0E32\u0E22\u0E19", "\u0E01\u0E23\u0E01\u0E0E\u0E32\u0E04\u0E21", "\u0E2A\u0E34\u0E07\u0E2B\u0E32\u0E04\u0E21", "\u0E01\u0E31\u0E19\u0E22\u0E32\u0E22\u0E19", "\u0E15\u0E38\u0E25\u0E32\u0E04\u0E21", "\u0E1E\u0E24\u0E28\u0E08\u0E34\u0E01\u0E32\u0E22\u0E19", "\u0E18\u0E31\u0E19\u0E27\u0E32\u0E04\u0E21"}));
		cbmon.setBounds(113, 334, 116, 44);
		panel_1.add(cbmon);
		
		JComboBox cbgender = new JComboBox();
		cbgender.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		cbgender.setModel(new DefaultComboBoxModel(new String[] {"\u0E0A\u0E32\u0E22", "\u0E2B\u0E0D\u0E34\u0E07"}));
		cbgender.setBounds(322, 334, 75, 44);
		panel_1.add(cbgender);
		
		JLabel label_4 = new JLabel("\u0E40\u0E1E\u0E28*");
		label_4.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_4.setBounds(323, 288, 38, 33);
		panel_1.add(label_4);
		
		JComboBox cbday = new JComboBox();
		cbday.setBorder(UIManager.getBorder("ComboBox.border"));
		cbday.setForeground(Color.BLACK);
		cbday.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbday.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		cbday.setBounds(31, 334, 83, 44);
		panel_1.add(cbday);
		
		JComboBox cbyear = new JComboBox();
		cbyear.setModel(new DefaultComboBoxModel(new String[] {"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919"}));
		cbyear.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		cbyear.setBounds(228, 334, 75, 44);
		panel_1.add(cbyear);
		
		JLabel lblRegister = new JLabel("");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				labelalertphone.setVisible(false);
				labelalertdate.setVisible(false);
				labelalertemail.setVisible(false);
				lblalertPassword.setVisible(false);
				lblalert2.setVisible(false);
				lblalert3.setVisible(false);
				lblalert4.setVisible(false);
				boolean pass = true;
				boolean emailnotnull = true;
				boolean phonenotnull = true;
				UserManager c = new UserManager();
				String date = c.chackdate(cbday.getSelectedItem().toString(), cbmon.getSelectedItem().toString(), cbyear.getSelectedItem().toString());
				if (!(Pattern.matches("^[0]+[0-9]+$", textphone.getText()))||textphone.getText().length()!=10) {
				       labelalertphone.setVisible(true);
				       pass=false;
				       phonenotnull=false;
				}
				if(date.equals("error")) {
						labelalertdate.setVisible(true);
					       pass=false;
				}
				if(!(Pattern.matches("^[a-zA-Z0-9_.]+[@]{1}+[a-zA-Z0-9.]+[.]{1}+[a-zA-Z0-9]+$", textemail.getText()))) {
					labelalertemail.setVisible(true);
				       pass=false;
				       emailnotnull=false;
				}
				if(textname.getText().trim().length() < 1) {
					lblalert2.setVisible(true);
				       pass=false;
				}
				/*
				 * check passShow
				 */
				
					if(passShow.equals("password")) {
						String st = new String(txtpass.getPassword()).trim().toString();
						String tempPassword = st.replaceAll("\\s+","");
						String tempCheck = isValid(tempPassword);
						if(tempPassword.equals("")) {
							lblalertPassword.setVisible(true);
							lblalertPassword.setText("ช่องนี้ไม่สามารถเว้นว่างได้");
						    pass=false;
						}
						else {
							if(tempCheck.equals("Pass")||tempCheck.equals("error")||tempCheck.equals("Not text")) {
								lblalertPassword.setVisible(false);
							}
							else {
								lblalertPassword.setVisible(true);
								lblalertPassword.setText(tempCheck);
							}
						}
					}
					if(passShow.equals("show")) {
						String st = textShow.getText();
						String tempPassword = st.replaceAll("\\s+","");
						String tempCheck = isValid(tempPassword);
						if(tempPassword.equals("")) {
							lblalertPassword.setVisible(true);
							lblalertPassword.setText("ช่องนี้ไม่สามารถเว้นว่างได้");
						    pass=false;
						}
						else {
							if(tempCheck.equals("Pass")||tempCheck.equals("error")||tempCheck.equals("Not text")) {
								lblalertPassword.setVisible(false);
							}
							else {
								lblalertPassword.setVisible(true);
								lblalertPassword.setText(tempCheck);
							}
						}
					}
				
						boolean checkemail = c.check_Email(textemail.getText());
						boolean checkphone = c.check_Phone(textphone.getText());
					if(!checkemail&&emailnotnull) {
						lblalert3.setText("email นี้มีผู้ใช้งานแล้ว");
						lblalert3.setVisible(true);
					    pass=false;
					}
					if(!checkphone&&phonenotnull) {
						lblalert4.setText("phone นี้มีผู้ใช้งานแล้ว");
						lblalert4.setVisible(true);
					    pass=false;
					}
					if(pass) {
						String gender = c.chackgender(cbgender.getSelectedItem().toString());
						boolean checkInsert = c.Insert(textemail.getText(), textphone.getText(), new String(txtpass.getPassword()).trim(), textname.getText(),date,gender);
						if(checkInsert) {
						JLabel title = new JLabel("สมัครสมาชิกเรียบร้อย");
						title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
						JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
						try {
							Login login = new Login();
							login.setVisible(true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						dispose();
 						}else {
							JLabel title = new JLabel("เกิดข้อผิดพลาด");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);	
						}
					}
			}
		});

		txtpass.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				lblalertPassword.setVisible(false);
				String st = new String(txtpass.getPassword()).trim().toString();
				String tempPassword = st.replaceAll("\\s+","");
				String tempCheck = isValid(tempPassword);
				if(tempCheck.equals("Pass")||tempCheck.equals("error")||tempCheck.equals("Not text")) {
					lblalertPassword.setVisible(false);
				}
				else {
					lblalertPassword.setVisible(true);
					lblalertPassword.setText(tempCheck);
				}
			}
		});
		lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegister.setIcon(new ImageIcon(Register.class.getResource("/Image/RegisterPangRegister.png")));
		lblRegister.setBounds(426, 334, 366, 46);
		panel_1.add(lblRegister);
		
		textShow.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lblalertPassword.setVisible(false);
				String st = textShow.getText();
				String tempPassword = st.replaceAll("\\s+","");
				String tempCheck = isValid(tempPassword);
				if(tempCheck.equals("Pass")||tempCheck.equals("error")||tempCheck.equals("Not text")) {
					lblalertPassword.setVisible(false);
				}
				else {
					lblalertPassword.setVisible(true);
					lblalertPassword.setText(tempCheck);
				}
			}
		});
	}
	public String isValid(String password) {
		boolean foundAlphabet 	= 	false;
		boolean foundNumber 	= 	false;
		String alret = "error";
		if(password.length()==0) {
			alret = "Not text";
			return alret;
		}
		if(password.length()<6||password.length()>50) {
			alret="รหัสผ่านควรมีความยาวอยู่ระหว่าง 6-50 ตัวอักษร";
			return alret;
		}
		else{
			if (password.matches(".*[a-z].*")) { 
				foundAlphabet =true;
			} 
			if (password.matches(".*[0-9].*")) {  
                foundNumber = true;     
            } 
		
			if(foundAlphabet&&foundNumber) {
				alret = "Pass";
				return alret;
			}
			if(!(foundAlphabet&&foundNumber)) {
				alret = "รหัสผ่านต้องประกอบไปด้วยตัวอักษรและตัวเลข";
				return alret;
			}
		}
		return alret;
	}
}
