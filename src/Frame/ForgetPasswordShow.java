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
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ForgetPasswordShow extends JFrame {

	private JPanel contentPane;

	public ForgetPasswordShow(String Temail , String Tpassword) {
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
		panelMain.setBounds(0, 0, 555, 79);
		panelMain.setBackground(new Color(8,54,69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E25\u0E37\u0E21\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 13, 188, 53);
		panelMain.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 79, 555, 358);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 23, 404, 217);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lbl1.setBounds(27, 33, 365, 38);
		panel_1.add(lbl1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lbl2.setBounds(27, 135, 365, 38);
		panel_1.add(lbl2);
		
		String[] cut = Tpassword.split("\\s+");
		String email = "";
		System.out.println(Tpassword);
		if(cut[0].equals("email"))
		 email = "อีเมล์ : "+Temail;
		else
			email = "เบอร์โทร : "+Temail;
		String name = "";
		if(cut.length>=4)
		 name = "ชื่อ : "+ cut[1]+" "+cut[2];
		else
			name ="ชื่อ : "+ cut[1];
		String password = "รหัสผ่าน : "+cut[cut.length-1];
		lbl1.setText(email);
		lbl2.setText(password);
		
		JLabel lblname = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19 :<dynamic>");
		lblname.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblname.setBounds(27, 84, 365, 38);
		lblname.setText(name);
		panel_1.add(lblname);
		
		JLabel lblok = new JLabel("");
		lblok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblok.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblok.setIcon(new ImageIcon(ForgetPasswordShow.class.getResource("/Image/ok.png")));
		lblok.setBounds(117, 253, 213, 58);
		panel.add(lblok);
	}

}
