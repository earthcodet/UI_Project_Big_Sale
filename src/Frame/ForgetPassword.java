package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DataManager.UserManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class ForgetPassword extends JFrame {

	private JPanel contentPane;
	private JTextField textemail;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ForgetPassword() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - ลืมรหัสผ่าน");
		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		setBounds(100, 100, 458, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 452, 79);
		panelMain.setBackground(new Color(8,54,69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E25\u0E37\u0E21\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19\u0E2B\u0E23\u0E37\u0E2D\u0E44\u0E21\u0E48?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 13, 188, 53);
		panelMain.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 79, 452, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 25, 393, 213);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E42\u0E1B\u0E23\u0E14\u0E23\u0E30\u0E1A\u0E38\u0E1A\u0E31\u0E0D\u0E0A\u0E35\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E23\u0E35\u0E40\u0E0B\u0E47\u0E15\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19.");
		lblNewLabel_1.setBounds(34, 13, 294, 43);
		lblNewLabel_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_1);
		
		textemail = new JTextField();
		textemail.setBounds(34, 106, 322, 43);
		textemail.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(textemail);
		textemail.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0E44\u0E21\u0E48\u0E1E\u0E1A\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E43\u0E19\u0E23\u0E30\u0E1A\u0E1A");
		label_1.setVisible(false);
		label_1.setForeground(Color.RED);
		label_1.setBounds(112, 157, 203, 43);
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(label_1);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JLabel label = new JLabel("\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C\u0E2B\u0E23\u0E37\u0E2D\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(34, 69, 184, 24);
		panel_1.add(label);
		
		JLabel lblok = new JLabel("");
		lblok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserManager UserManager = new UserManager();
				label_1.setVisible(false);
				if(textemail.getText().length()<1) {
					label_1.setVisible(true);
				}
				String check = UserManager.forget(textemail.getText());
				if(!check.equals("notFound")) {
					ForgetPasswordShow forget = new ForgetPasswordShow(textemail.getText(),check);
					forget.setVisible(true);
					dispose();
				}
				else {
					label_1.setVisible(true);
				}
			}
		});
		lblok.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblok.setIcon(new ImageIcon(ForgetPassword.class.getResource("/Image/ok.png")));
		lblok.setBounds(116, 251, 213, 44);
		panel.add(lblok);
		
		textemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				label_1.setVisible(false);
				if(e.getKeyCode () == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if(textemail.getText().length()<1) {
						System.out.println("ไม่พบข้อมูล");
					}
					String check = UserManager.forget(textemail.getText());
					if(!check.equals("notFound")) {
						ForgetPasswordShow forget = new ForgetPasswordShow(textemail.getText(),check);
						forget.setVisible(true);
						dispose();
					}
					else {
						label_1.setVisible(true);
					}
				}
			}
		});
		
	}


}
