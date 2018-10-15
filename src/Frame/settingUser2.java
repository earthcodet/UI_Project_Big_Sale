package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class settingUser2 extends JFrame {
	private JTextField textField;
	private JPanel contentPane;
	private boolean checkShowProfile = false;
	private boolean checkShowTaggingProduct = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					settingUser2 frame = new settingUser2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
	    Image img = icon.getImage();
	    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
	    return new ImageIcon(resizedImage);
	    }
	public settingUser2() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//Home showHome = new Home();
				//showHome.setVisible(true);
				dispose();
			}
		});
		setResizable(false);
		setTitle("BIG SALE - Home");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage(Home.class.getResource("/Image/ICON.png"));
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 0, 1367, 909);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelShow = new JPanel();
		panelShow.setVisible(false);
		
		JPanel panelShowTag = new JPanel();
		panelShowTag.setVisible(false);
		panelShowTag.setBackground(Color.WHITE);
		panelShowTag.setBounds(787, 43, 232, 225);
		contentPane.add(panelShowTag);
		panelShow.setBounds(984, 42, 232, 226);
		contentPane.add(panelShow);
		panelShow.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panelShow.setBackground(Color.WHITE);
		panelShow.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E08\u0E31\u0E14\u0E01\u0E32\u0E23\u0E01\u0E31\u0E1A\u0E1A\u0E31\u0E0D\u0E0A\u0E35\u0E02\u0E2D\u0E07\u0E09\u0E31\u0E19");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 35, 134, 24);
		panelShow.add(lblNewLabel);
		
		JLabel lblProfile = new JLabel("");
		ImageIcon icon = new ImageIcon(settingUser2.class.getResource("/Image/smile.png"));
		lblProfile.setBounds(21, 35, 36, 34);
		int offset = lblProfile.getInsets().left;
		lblProfile.setIcon(resizeIcon(icon, lblProfile.getWidth() - offset, lblProfile.getHeight() - offset));
		panelShow.add(lblProfile);
		
		JLabel lblOrder = new JLabel("");
		icon = new ImageIcon(settingUser2.class.getResource("/Image/box.png"));
		offset = lblOrder.getInsets().left;
		lblOrder.setBounds(21, 95, 36, 34);
		lblOrder.setIcon(resizeIcon(icon, lblOrder.getWidth() - offset, lblOrder.getHeight() - offset));
		panelShow.add(lblOrder);
		
		JLabel labelMyOrder = new JLabel("\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23\u0E2A\u0E31\u0E48\u0E07\u0E0B\u0E37\u0E49\u0E2D\u0E02\u0E2D\u0E07\u0E09\u0E31\u0E19");
		labelMyOrder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelMyOrder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMyOrder.setBounds(67, 95, 134, 34);
		panelShow.add(labelMyOrder);
		
		JLabel lblLogout = new JLabel("");
		offset = lblLogout.getInsets().left;
		icon = new ImageIcon(settingUser2.class.getResource("/Image/logout.png"));
		lblLogout.setBounds(21, 150, 36, 34);
		lblLogout.setIcon(resizeIcon(icon, lblLogout.getWidth() - offset, lblLogout.getHeight() - offset));
		panelShow.add(lblLogout);
		
		JLabel labelLogOut = new JLabel("\u0E2D\u0E2D\u0E01\u0E08\u0E32\u0E01\u0E23\u0E30\u0E1A\u0E1A");
		labelLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelLogOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelLogOut.setBounds(67, 157, 134, 27);
		panelShow.add(labelLogOut);
		
		JPanel MenuBar = new JPanel();
		MenuBar.setBounds(0, 0, 1365, 42);
		contentPane.add(MenuBar);
		MenuBar.setBackground(new Color(0, 51, 51));
		MenuBar.setLayout(null);
		
		JLabel taggingProduct_Bar = new JLabel("\u0E15\u0E34\u0E14\u0E15\u0E32\u0E21\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E32");
		taggingProduct_Bar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		taggingProduct_Bar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				taggingProduct_Bar.setForeground(new Color(255, 69, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				taggingProduct_Bar.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
				panelShowTag.setVisible(true);
			}
		});
		taggingProduct_Bar.setBorder(UIManager.getBorder("MenuBar.border"));
		taggingProduct_Bar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		taggingProduct_Bar.setForeground(Color.WHITE);
		taggingProduct_Bar.setBounds(860, 15, 76, 23);
		MenuBar.add(taggingProduct_Bar);
		
		JLabel about_Bar = new JLabel("");
		about_Bar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		about_Bar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				about ab = new about();
				ab.setVisible(true);
			}
		});
		about_Bar.setBounds(1313, 11, 22, 27);
		MenuBar.add(about_Bar);
		about_Bar.setIcon(new ImageIcon(Home.class.getResource("/Image/markz.png")));
		
		JLabel lblUser = new JLabel("\u0E1A\u0E31\u0E0D\u0E0A\u0E35\u0E02\u0E2D\u0E07 PANUWAT RUEHAROM");
		lblUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelShow.setVisible(true);
				panelShowTag.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblUser.setForeground(new Color(255, 69, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblUser.setForeground(Color.WHITE);
			}
		
		});
		
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser.setBorder(UIManager.getBorder("MenuBar.border"));
		lblUser.setBounds(997, 15, 253, 23);
		MenuBar.add(lblUser);
		
		JPanel SearchPanel = new JPanel();
		SearchPanel.setBounds(0, 40, 1365, 131);
		contentPane.add(SearchPanel);
		SearchPanel.setBackground(new Color(8, 54, 69));
		SearchPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Home.class.getResource("/Image/\u0E42\u0E25\u0E42\u0E01\u0E49\u0E2A\u0E35\u0E02\u0E32\u0E273.png")));
		label.setBounds(135, 13, 108, 96);
		SearchPanel.add(label);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
				panelShowTag.setVisible(false);
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(527, 56, 504, 40);
		SearchPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblBigSale = new JLabel("SALE");
		lblBigSale.setFont(new Font("Segoe WP Black", Font.BOLD, 24));
		lblBigSale.setForeground(Color.WHITE);
		lblBigSale.setBounds(331, 39, 70, 40);
		SearchPanel.add(lblBigSale);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 102, 51));
		panel_1.setBounds(1028, 56, 44, 40);
		SearchPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Home.class.getResource("/Image/\u0E04\u0E49\u0E19\u0E2B\u0E32 \u0E2A\u0E35\u0E02\u0E32\u0E272.png")));
		label_1.setBounds(10, 0, 33, 43);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Home.class.getResource("/Image/\u0E15\u0E23\u0E30\u0E01\u0E25\u0E49\u0E32\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E322.png")));
		label_2.setBounds(1133, 56, 32, 40);
		SearchPanel.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 102, 51));
		panel_2.setBounds(281, 77, 115, 10);
		SearchPanel.add(panel_2);
		
		JLabel lblBig = new JLabel("BIG");
		lblBig.setBackground(Color.WHITE);
		lblBig.setForeground(new Color(255, 102, 51));
		lblBig.setFont(new Font("Segoe WP Black", Font.BOLD, 24));
		lblBig.setBounds(280, 39, 53, 40);
		SearchPanel.add(lblBig);
		
		panelShow.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				checkShowProfile = true;
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						checkShowProfile = true;
						lblNewLabel.setForeground(new Color(255, 69, 0));
						lblNewLabel.setBorder(UIManager.getBorder("MenuBar.border"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						checkShowProfile = true;
						lblNewLabel.setForeground(Color.BLACK);
					}
				});
				labelMyOrder.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						checkShowProfile = true;
						labelMyOrder.setForeground(new Color(255, 69, 0));
						labelMyOrder.setBorder(UIManager.getBorder("MenuBar.border"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						checkShowProfile = true;
						labelMyOrder.setForeground(Color.BLACK);
					}
				});
				labelLogOut.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						checkShowProfile = true;
						labelLogOut.setForeground(new Color(255, 69, 0));
						labelLogOut.setBorder(UIManager.getBorder("MenuBar.border"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						checkShowProfile = true;
						labelLogOut.setForeground(Color.BLACK);
					}
				});
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
				panelShowTag.setVisible(false);
			}
			
		});
	}
}
