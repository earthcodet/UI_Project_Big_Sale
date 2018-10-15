package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DataManager.UserManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	public static JTextField txtuser;
	private JTextField textshow;
	private JPasswordField txtpass;
	static int checkShow = 0;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
		Image img = icon.getImage();
		Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(resizedImage);
	}

	public Login() throws IOException {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Home nw = new Home();
				nw.setVisible(true);
			}
		});
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - เข้าสู่ระบบ");
		setBounds(100, 100, 695, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 691, 131);
		panelMain.setBackground(new Color(8, 54, 69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"\u0E22\u0E34\u0E19\u0E14\u0E35\u0E15\u0E49\u0E2D\u0E19\u0E23\u0E31\u0E1A\u0E40\u0E02\u0E49\u0E32\u0E2A\u0E39\u0E48\u0E1A\u0E34\u0E4A\u0E01\u0E40\u0E0B\u0E25 \u0E01\u0E23\u0E38\u0E13\u0E32\u0E40\u0E02\u0E49\u0E32\u0E2A\u0E39\u0E48\u0E23\u0E30\u0E1A\u0E1A ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
		lblNewLabel.setBounds(37, 29, 522, 70);
		panelMain.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 130, 691, 313);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(26, 0, 412, 302);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel(
				" \r\n\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C\u0E2B\u0E23\u0E37\u0E2D\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C\r\n\r\n\r\n\u2028*");
		lblNewLabel_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(23, 13, 367, 43);
		panel_1.add(lblNewLabel_1);

		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtuser.setBounds(23, 66, 367, 43);
		panel_1.add(txtuser);
		txtuser.setColumns(10);

		textshow = new JTextField();
		textshow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textshow.setVisible(false);

		JLabel lbleye = new JLabel("");
		lbleye.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbleye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (checkShow == 0) {
					textshow.setText(new String(txtpass.getPassword()).trim());
					textshow.setVisible(true);
					txtpass.setVisible(false);
					ImageIcon icon = new ImageIcon(Login.class
							.getResource("/Image/\u0E44\u0E21\u0E48\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(345, 176, 45, 43);
					int offset = lbleye.getInsets().left;
					lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow++;
				} else {
					txtpass.setText(textshow.getText());
					textshow.setVisible(false);
					txtpass.setVisible(true);
					ImageIcon icon = new ImageIcon(
							Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(345, 176, 45, 43);
					int offset = lbleye.getInsets().left;
					lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow--;
				}
			}
		});
		// "user.dir") + "/src/Image/ซ่อนตา.png"
		// ไม่ซ่อนตา
		// Login.class.getResource("/Image/\u0E44\u0E21\u0E48\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png")
		// lbleye.setBounds(551, 218, 68, 59);
		ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
		lbleye.setBounds(345, 176, 45, 43);
		int offset = lbleye.getInsets().left;
		lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
		panel_1.add(lbleye);

		txtpass = new JPasswordField();
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpass.setBounds(23, 175, 310, 44);
		panel_1.add(txtpass);
		textshow.setColumns(10);
		textshow.setBounds(23, 175, 310, 44);
		panel_1.add(textshow);

		JLabel label = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19*");
		label.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label.setBounds(23, 122, 245, 43);
		panel_1.add(label);

		JLabel lblexlogin = new JLabel(
				"\u0E01\u0E23\u0E38\u0E13\u0E32\u0E01\u0E23\u0E2D\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E43\u0E2B\u0E49\u0E04\u0E23\u0E1A");
		lblexlogin.setForeground(new Color(255, 0, 51));
		lblexlogin.setVisible(false);
		lblexlogin.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblexlogin.setBounds(23, 228, 296, 39);
		panel_1.add(lblexlogin);

		JLabel lblNewLabel_2 = new JLabel("\u0E25\u0E37\u0E21\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				forgetpassword nw = new forgetpassword();
				nw.setVisible(true);
			}
		});
		lblNewLabel_2.setBorder(UIManager.getBorder("MenuBar.border"));
		// WAIT_CURSOR
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setForeground(Color.BLUE);
		// font.setStyle(Font.UNDERLINE);
		lblNewLabel_2.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(279, 235, 97, 26);
		panel_1.add(lblNewLabel_2);

		JLabel lblLogin = new JLabel("");
		lblLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				UserManager UserManager = new UserManager();
				if (txtuser.getText().trim().length() < 1 || new String(txtpass.getPassword()).trim().length() < 1) {
					lblexlogin.setVisible(true);
				} else {
					String check = UserManager.checkLogin(txtuser.getText().trim(),
							new String(txtpass.getPassword()).trim());
					if (!check.equals("error")) {
						System.out.println("Holy shit");
						System.out.println(check);
						JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
						title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
						JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
						// dispose();

						if (check.equals("user")) {
							Home_LoggedIn loginHome = new Home_LoggedIn(UserManager.getNameUserLogin(),UserManager.getUserID());
						loginHome.setVisible(true);
						}
						if (check.equals("admin")) {
							aDMIN nw = new aDMIN(UserManager.getNameUserLogin());
							nw.setVisible(true);
						}
						dispose();

					} else {

						JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
						title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
						JOptionPane.showMessageDialog(null, title, "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		lblLogin.setIcon(new ImageIcon(Login.class.getResource("/Image/Login.png")));
		lblLogin.setBounds(457, 49, 212, 59);
		panel.add(lblLogin);

		JLabel lblRegister = new JLabel("");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register regis = new Register();
				regis.setVisible(true);
			}
		});
		lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegister.setIcon(new ImageIcon(Login.class.getResource("/Image/register.png")));
		lblRegister.setBounds(457, 148, 212, 59);
		panel.add(lblRegister);
		
		JLabel label_1 = new JLabel("\u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A\u0E44\u0E1B\u0E2B\u0E19\u0E31\u0E01\u0E41\u0E23\u0E01");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home nw = new Home();
				nw.setVisible(true);
				dispose();
			}
		});
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_1.setBorder(UIManager.getBorder("MenuBar.border"));
		label_1.setBounds(504, 237, 165, 26);
		panel.add(label_1);

		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));

		txtuser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if (txtuser.getText().trim().length() < 1
							|| new String(txtpass.getPassword()).trim().length() < 1) {
						lblexlogin.setVisible(true);
					} else {
						String check = UserManager.checkLogin(txtuser.getText().trim(),
								new String(txtpass.getPassword()).trim());
						if (!check.equals("error")) {
							JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
							dispose();

							if (check.equals("user")) {
								Home_LoggedIn loginHome = new Home_LoggedIn(UserManager.getNameUserLogin(),UserManager.getUserID());
								loginHome.setVisible(true);
							}
							if (check.equals("admin")) {
								aDMIN nw = new aDMIN(UserManager.getNameUserLogin());
								nw.setVisible(true);
							}
							dispose();
						} else {
							JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null, title, "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});

		txtpass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if (txtuser.getText().trim().length() < 1
							|| new String(txtpass.getPassword()).trim().length() < 1) {
						lblexlogin.setVisible(true);
					} else {
						String check = UserManager.checkLogin(txtuser.getText().trim(),
								new String(txtpass.getPassword()).trim());
						if (!check.equals("error")) {
							JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
							System.out.println(check);
							if (check.equals("user")) {
								Home_LoggedIn loginHome = new Home_LoggedIn(UserManager.getNameUserLogin(),UserManager.getUserID());
								loginHome.setVisible(true);
							}
							if (check.equals("admin")) {
								aDMIN nw = new aDMIN(UserManager.getNameUserLogin());
								nw.setVisible(true);
							}
							dispose();
						} else {
							JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null, title, "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});

		textshow.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if (txtuser.getText().trim().length() < 1
							|| new String(txtpass.getPassword()).trim().length() < 1) {
						lblexlogin.setVisible(true);
					} else {
						String check = (String) UserManager.checkLogin(txtuser.getText().trim(),
								new String(txtpass.getPassword()).trim());
						if (!check.equals("error")) {
							JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
							dispose();

							if (check.equals("user")) {
								Home_LoggedIn loginHome = new Home_LoggedIn(UserManager.getNameUserLogin(),UserManager.getUserID());
								loginHome.setVisible(true);
							}
							if (check.equals("admin")) {
								aDMIN nw = new aDMIN(UserManager.getNameUserLogin());
								nw.setVisible(true);
							}
							dispose();
						} else {
							JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null, title, "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});

	}
}
