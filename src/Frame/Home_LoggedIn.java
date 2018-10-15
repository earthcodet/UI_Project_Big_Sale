package Frame;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import DataManager.NewProductDB;
import DataManager.NewProductManager;
import DatabaseAndTools.DataTableRenderer;
import DatabaseAndTools.ImagePanel;
import java.awt.Window.Type;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class Home_LoggedIn extends JFrame {	
	private JPanel contentPane;
	static LinkedList<NewProductDB> listImage = NewProductManager.getAllNew_Product_Image();
	private JTextField textField;
	private JTable tbl_MostPop;
	private JTable tbl_FlashSale;
	private ImagePanel MostPop_Img;
	static JPanel SubShowPanel;
	private JLabel Seccount;
	private JLabel Mincount;
	private JLabel Hourcount;
	private JLabel banner;
	private JPanel Sub_pullDownMenu;
	List<JPanel> subMenus = new LinkedList<>();
	int user_id;
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
	    Image img = icon.getImage();
	    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
	    return new ImageIcon(resizedImage);
	    }
	public Home_LoggedIn(String username,int user_id) {
		setMinimumSize(new Dimension(900, 900));
		this.user_id=user_id;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Home open = new Home();
				open.setVisible(true);
				dispose();
			}
		});
		setTitle("BIG SALE - Home");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage(Home_LoggedIn.class.getResource("/Image/ICON.png"));
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 0, 1259, 909);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelShowTag = new JPanel();
		panelShowTag.setVisible(false);
		panelShowTag.setBounds(692, 43, 232, 225);
		contentPane.add(panelShowTag);
		
		//Start
		
		
		JPanel panelShow = new JPanel();
		panelShow.setVisible(false);
		panelShow.setBounds(889, 42, 232, 226);
		contentPane.add(panelShow);
		panelShow.setLayout(null);
		
		JLabel lblProfile = new JLabel("");
		ImageIcon icon = new ImageIcon(Home_LoggedIn.class.getResource("/Image/smile.png"));
		lblProfile.setBounds(21, 35, 36, 34);
		int offset = lblProfile.getInsets().left;
		lblProfile.setIcon(resizeIcon(icon, lblProfile.getWidth() - offset, lblProfile.getHeight() - offset));
		panelShow.add(lblProfile);
		
		JLabel lblNewLabel = new JLabel("\u0E08\u0E31\u0E14\u0E01\u0E32\u0E23\u0E01\u0E31\u0E1A\u0E1A\u0E31\u0E0D\u0E0A\u0E35\u0E02\u0E2D\u0E07\u0E09\u0E31\u0E19");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				settingUser open = new settingUser(username,user_id);
				open.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 35, 134, 24);
		panelShow.add(lblNewLabel);
		
		JLabel labelMyOrder = new JLabel("\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23\u0E2A\u0E31\u0E48\u0E07\u0E0B\u0E37\u0E49\u0E2D\u0E02\u0E2D\u0E07\u0E09\u0E31\u0E19");
		labelMyOrder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelMyOrder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMyOrder.setBounds(67, 95, 134, 34);
		panelShow.add(labelMyOrder);
		
		JLabel labelLogOut = new JLabel("\u0E2D\u0E2D\u0E01\u0E08\u0E32\u0E01\u0E23\u0E30\u0E1A\u0E1A");
		labelLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home open = new Home();
				open.setVisible(true);
				dispose();
			}
		});
		labelLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelLogOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelLogOut.setBounds(67, 157, 134, 27);
		panelShow.add(labelLogOut);
		
		JLabel lblOrder = new JLabel("");
		icon = new ImageIcon(Home_LoggedIn.class.getResource("/Image/box.png"));
		offset = lblOrder.getInsets().left;
		lblOrder.setBounds(21, 95, 36, 34);
		lblOrder.setIcon(resizeIcon(icon, lblOrder.getWidth() - offset, lblOrder.getHeight() - offset));
		panelShow.add(lblOrder);
		
		JLabel lblLogout = new JLabel("");
		offset = lblLogout.getInsets().left;
		icon = new ImageIcon(Home_LoggedIn.class.getResource("/Image/logout.png"));
		lblLogout.setBounds(21, 150, 36, 34);
		lblLogout.setIcon(resizeIcon(icon, lblLogout.getWidth() - offset, lblLogout.getHeight() - offset));
		panelShow.add(lblLogout);
		
		JPanel MenuBar = new JPanel();
		MenuBar.setBounds(0, 0, 1243, 42);
		contentPane.add(MenuBar);
		MenuBar.setBackground(new Color(0, 51, 51));
		MenuBar.setLayout(null);
		
		JLabel taggingProduct_Bar = new JLabel("\u0E15\u0E34\u0E14\u0E15\u0E32\u0E21\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E32");
		taggingProduct_Bar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		taggingProduct_Bar.setForeground(Color.WHITE);
		taggingProduct_Bar.setBounds(780, 10, 76, 23);
		MenuBar.add(taggingProduct_Bar);
		
		JLabel about_Bar = new JLabel("");
		about_Bar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		about_Bar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				about ab = new about();
				ab.setVisible(true);
			}
		});
		about_Bar.setBounds(1176, 6, 22, 27);
		MenuBar.add(about_Bar);
		about_Bar.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/markz.png")));
		
		JLabel lblUser = new JLabel("New label");
		lblUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser.setBounds(927, 11, 239, 23);
		MenuBar.add(lblUser);
		
		JPanel SearchPanel = new JPanel();
		SearchPanel.setBounds(0, 43, 1243, 128);
		contentPane.add(SearchPanel);
		SearchPanel.setBackground(new Color(8, 54, 69));
		SearchPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/\u0E42\u0E25\u0E42\u0E01\u0E49\u0E2A\u0E35\u0E02\u0E32\u0E273.png")));
		label.setBounds(135, 13, 108, 96);
		SearchPanel.add(label);
		
		textField = new JTextField();
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
		label_1.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/\u0E04\u0E49\u0E19\u0E2B\u0E32 \u0E2A\u0E35\u0E02\u0E32\u0E272.png")));
		label_1.setBounds(10, 0, 33, 43);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/\u0E15\u0E23\u0E30\u0E01\u0E25\u0E49\u0E32\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E322.png")));
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 170, 1243, 700);
		contentPane.add(scrollPane);
		
		JPanel ShowPanel = new JPanel();
		ShowPanel.setBackground(UIManager.getColor("ColorChooser.swatchesDefaultRecentColor"));
		ShowPanel.setPreferredSize(new Dimension(400, 1400));
		scrollPane.setViewportView(ShowPanel);
		ShowPanel.setLayout(null);
		
		JLabel bannerChoosing4 = new JLabel("");
		bannerChoosing4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner4.png")));
			}
		});
		
		Sub_pullDownMenu = new JPanel();
		Sub_pullDownMenu.setVisible(false);
		Sub_pullDownMenu.setBackground(Color.WHITE);
		Sub_pullDownMenu.setBounds(281, 0, 223, 263);
		ShowPanel.add(Sub_pullDownMenu);
		Sub_pullDownMenu.setLayout(null);
		
JPanel subMenu1 = new JPanel();
		
		JLabel submenulbl1 = new JLabel("?");
		submenulbl1.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl1.setBounds(10, 11, 129, 14);
		subMenu1.add(submenulbl1);
		
		subMenu1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				subMenu1.setBackground(Color.GRAY);
				submenulbl1.setForeground(new Color(51, 255, 255));

			}
			public void mouseExited(MouseEvent e) {
				subMenu1.setBackground(Color.WHITE);
				submenulbl1.setForeground(Color.BLACK);
				
			}
		});
		subMenu1.setVisible(false);
		subMenu1.setBackground(Color.WHITE);
		subMenu1.setBounds(0, 0, 223, 34);
		Sub_pullDownMenu.add(subMenu1);
		subMenu1.setLayout(null);
		
		JPanel subMenu2 = new JPanel();
		
		JLabel submenulbl2 = new JLabel("?");
		submenulbl2.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl2.setBounds(10, 11, 129, 14);
		subMenu2.add(submenulbl2);
		subMenu2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				subMenu2.setBackground(Color.GRAY);
				submenulbl2.setForeground(new Color(51, 255, 255));
			}
			public void mouseExited(MouseEvent e) {
				subMenu2.setBackground(Color.WHITE);
				submenulbl2.setForeground(Color.BLACK);
				
			}
		});
		
		subMenu2.setVisible(false);
		subMenu2.setBackground(Color.WHITE);
		subMenu2.setBounds(0, 34, 223, 34);
		Sub_pullDownMenu.add(subMenu2);
		subMenu2.setLayout(null);
		
		JPanel subMenu3 = new JPanel();
		
		JLabel submenulbl3 = new JLabel("?");
		submenulbl3.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl3.setBounds(10, 11, 129, 14);
		subMenu3.add(submenulbl3);
		subMenu3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				subMenu3.setBackground(Color.GRAY);
				submenulbl3.setForeground(new Color(51, 255, 255));
			}
			public void mouseExited(MouseEvent e) {
				subMenu3.setBackground(Color.WHITE);
				submenulbl3.setForeground(Color.BLACK);
				
			}
		});		
		subMenu3.setVisible(false);
		subMenu3.setBackground(Color.WHITE);
		subMenu3.setBounds(0, 68, 223, 34);
		Sub_pullDownMenu.add(subMenu3);
		subMenu3.setLayout(null);
		
		JPanel subMenu4 = new JPanel();
		
		JLabel submenulbl4 = new JLabel("?");
		submenulbl4.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl4.setBounds(10, 11, 129, 14);
		subMenu4.add(submenulbl4);
		subMenu4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				subMenu4.setBackground(Color.GRAY);
				submenulbl4.setForeground(new Color(51, 255, 255));
			}
			public void mouseExited(MouseEvent e) {
				subMenu4.setBackground(Color.WHITE);
				submenulbl4.setForeground(Color.BLACK);
				
			}
		});		
		subMenu4.setVisible(false);
		subMenu4.setBackground(Color.WHITE);
		subMenu4.setBounds(0, 103, 223, 34);
		Sub_pullDownMenu.add(subMenu4);
		subMenu4.setLayout(null);
		
		JPanel subMenu5 = new JPanel();
		
		JLabel submenulbl5 = new JLabel("?");
		submenulbl5.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl5.setBounds(10, 11, 129, 14);
		subMenu5.add(submenulbl5);
		subMenu5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				subMenu5.setBackground(Color.GRAY);
				submenulbl5.setForeground(new Color(51, 255, 255));
			}
			public void mouseExited(MouseEvent e) {
				subMenu5.setBackground(Color.WHITE);
				submenulbl5.setForeground(Color.BLACK);
				
			}
		});	
		subMenu5.setVisible(false);
		subMenu5.setBackground(Color.WHITE);
		subMenu5.setBounds(0, 138, 223, 34);
		Sub_pullDownMenu.add(subMenu5);
		subMenu5.setLayout(null);
		
		subMenus.add(subMenu1);
		subMenus.add(subMenu2);
		subMenus.add(subMenu3);
		subMenus.add(subMenu4);
		subMenus.add(subMenu5);
		
		bannerChoosing4.setBounds(613, 224, 15, 25);
		ShowPanel.add(bannerChoosing4);
		bannerChoosing4.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChoosing7 = new JLabel("");
		bannerChoosing7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner7.png")));
			}
		});
		bannerChoosing7.setBounds(688, 224, 15, 25);
		ShowPanel.add(bannerChoosing7);
		bannerChoosing7.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChoosing5 = new JLabel("");
		bannerChoosing5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner5.png")));
			}
		});
		bannerChoosing5.setBounds(638, 224, 15, 25);
		ShowPanel.add(bannerChoosing5);
		bannerChoosing5.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChoosing1 = new JLabel("");
		bannerChoosing1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner1.png")));
			}
		});
		bannerChoosing1.setBounds(538, 224, 15, 25);
		ShowPanel.add(bannerChoosing1);
		bannerChoosing1.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChoosing3 = new JLabel("");
		bannerChoosing3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner3.png")));
			}
		});
		bannerChoosing3.setBounds(588, 224, 15, 25);
		ShowPanel.add(bannerChoosing3);
		bannerChoosing3.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChoosing2 = new JLabel("");
		bannerChoosing2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner2.png")));
			}
		});
		bannerChoosing2.setBounds(563, 224, 15, 25);
		ShowPanel.add(bannerChoosing2);
		bannerChoosing2.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChoosing6 = new JLabel("");
		bannerChoosing6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bannerChoosing6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner6.png")));
			}
		});
		bannerChoosing6.setBounds(663, 224, 15, 25);
		ShowPanel.add(bannerChoosing6);
		bannerChoosing6.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel lblMostPopular = new JLabel("Most Popular");
		lblMostPopular.setFont(new Font("Dubai", Font.PLAIN, 26));
		lblMostPopular.setBounds(83, 337, 162, 34);
		ShowPanel.add(lblMostPopular);
		
		JPanel GlobalCollPanel = new JPanel();
		GlobalCollPanel.setLayout(null);
		GlobalCollPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GlobalCollPanel.setBounds(559, 279, 259, 45);
		ShowPanel.add(GlobalCollPanel);
		
		JLabel lblGlobalCollection = new JLabel("Global Collection");
		lblGlobalCollection.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblGlobalCollection.setBounds(41, 5, 153, 35);
		GlobalCollPanel.add(lblGlobalCollection);
		
		JLabel btnGblColl = new JLabel("");
		btnGblColl.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/gc2.png")));
		btnGblColl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//btnGblColl.setIcon(new ImageIcon(Home.class.getResource("/Image/gblClicked.png")));
			}
			public void mouseEntered(MouseEvent e) {
				lblGlobalCollection.setForeground(new Color(102, 0, 255));
				btnGblColl.setIcon(new ImageIcon(Home.class.getResource("/Image/gblClicked.png")));
			}
			public void mouseExited(MouseEvent e) {
				lblGlobalCollection.setForeground(Color.BLACK);
				btnGblColl.setIcon(new ImageIcon(Home.class.getResource("/Image/gbl.png")));
			}
		});
		btnGblColl.setBounds(5, 5, 250, 35);
		GlobalCollPanel.add(btnGblColl);
		
		JPanel VoucherPanel = new JPanel();
		VoucherPanel.setLayout(null);
		VoucherPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		VoucherPanel.setBounds(842, 279, 259, 45);
		ShowPanel.add(VoucherPanel);
		
		JLabel lblVouchers = new JLabel("Vouchers");
		lblVouchers.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblVouchers.setBounds(41, 5, 153, 35);
		VoucherPanel.add(lblVouchers);
		
		JLabel btnVouchers = new JLabel("");
		btnVouchers.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/vc2.png")));
		btnVouchers.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mouseEntered(MouseEvent e) {
				lblVouchers.setForeground(new Color(255, 153, 51));
				btnVouchers.setIcon(new ImageIcon(Home.class.getResource("/Image/vchClicked.png")));
			}
			public void mouseExited(MouseEvent e) {
				lblVouchers.setForeground(Color.BLACK);
				btnVouchers.setIcon(new ImageIcon(Home.class.getResource("/Image/vc2.png")));
			}
		});
		btnVouchers.setBounds(10, 6, 250, 35);
		VoucherPanel.add(btnVouchers);
		
		JPanel BigMallPanel = new JPanel();
		BigMallPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BigMallPanel.setLayout(null);
		BigMallPanel.setBounds(277, 279, 259, 45);
		ShowPanel.add(BigMallPanel);
		
		JLabel lblBigmall = new JLabel("BigMall");
		lblBigmall.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblBigmall.setBounds(41, 5, 153, 35);
		BigMallPanel.add(lblBigmall);
		
		JLabel btnBigMall = new JLabel("");
		btnBigMall.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mouseEntered(MouseEvent e) {
				btnBigMall.setBounds(5, 5, 250, 35);
				btnBigMall.setIcon(new ImageIcon(Home.class.getResource("/Image/bgmClicked.png")));
			}
			public void mouseExited(MouseEvent e) {
				lblBigmall.setForeground(Color.BLACK);
				btnBigMall.setIcon(new ImageIcon(Home.class.getResource("/Image/bgmNEW.png")));
			}
		});
		btnBigMall.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/bt2.png")));
		btnBigMall.setBounds(5, 5, 250, 35);
		BigMallPanel.add(btnBigMall);
		
		JPanel pullDownMenu = new JPanel();
		pullDownMenu.setBackground(Color.WHITE);
		pullDownMenu.setBounds(83, 14, 198, 249);
		pullDownMenu.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				Sub_pullDownMenu.setVisible(false);
			}
		});
		ShowPanel.add(pullDownMenu);
		pullDownMenu.setLayout(null);
		
		JLabel lblToys = new JLabel("Babies & Toys");
		lblToys.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblToys.setBounds(10, 11, 129, 14);
		
		JLabel arrowToy = new JLabel("");
		arrowToy.setVisible(false);
		arrowToy.setBounds(169, 0, 19, 30);
		arrowToy.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		
		JPanel ToysPanel = new JPanel();
		ToysPanel.setBackground(Color.WHITE);
		ToysPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowToy.setVisible(true);
				ToysPanel.setBackground(Color.GRAY);
				lblToys.setForeground(new Color(51, 255, 255));
				ShowSubMenuPanel(subMenus,new String[]{"Babies Gear", "Baby Clothing", "Baby Personal Care", "Baby & Toys", "Figure & Collectibles"});
			}
			public void mouseExited(MouseEvent e) {
				arrowToy.setVisible(false);
				ToysPanel.setBackground(Color.WHITE);
				lblToys.setForeground(Color.BLACK);
			}
		});
		ToysPanel.setBounds(0, 0, 198, 34);
		pullDownMenu.add(ToysPanel);
		ToysPanel.setLayout(null);
		ToysPanel.add(lblToys);
		ToysPanel.add(arrowToy);
		JLabel lblMale = new JLabel("Male's Fashion");
		lblMale.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblMale.setBounds(10, 11, 113, 14);
		
		JLabel arrowMale = new JLabel("");
		arrowMale.setVisible(false);
		arrowMale.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrowMale.setBounds(169, 0, 19, 30);
		
		JPanel MalesPanel = new JPanel();
		MalesPanel.setBackground(Color.WHITE);
		MalesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowMale.setVisible(true);
				MalesPanel.setBackground(Color.GRAY);
				lblMale.setForeground(new Color(51, 255, 255));
				
				ShowSubMenuPanel(subMenus,new String[]{"Shirts","Pants","Shoes","Accessories"});
			}
			public void mouseExited(MouseEvent e) {
				arrowMale.setVisible(false);
				MalesPanel.setBackground(Color.WHITE);
				lblMale.setForeground(Color.BLACK);
			}
		});
		MalesPanel.setBounds(0, 34, 198, 34);
		pullDownMenu.add(MalesPanel);
		MalesPanel.setLayout(null);
		MalesPanel.add(lblMale);
		MalesPanel.add(arrowMale);
		
		JLabel lblFemales = new JLabel("Female's Fashion");
		lblFemales.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblFemales.setBounds(10, 11, 115, 14);
		
		JLabel arrowFemale = new JLabel("");
		arrowFemale.setVisible(false);
		arrowFemale.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrowFemale.setBounds(169, 0, 19, 30);
		
		JPanel FemalesPanel = new JPanel();
		FemalesPanel.setBackground(Color.WHITE);
		FemalesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowFemale.setVisible(true);
				FemalesPanel.setBackground(Color.GRAY);
				lblFemales.setForeground(new Color(51, 255, 255));
				
				ShowSubMenuPanel(subMenus,new String[]{"Shirts","Pants","Shoes","Accessories"});
			}
			public void mouseExited(MouseEvent e) {
				arrowFemale.setVisible(false);
				FemalesPanel.setBackground(Color.WHITE);
				lblFemales.setForeground(Color.BLACK);
			}
		});
		FemalesPanel.setBounds(0, 68, 198, 34);
		pullDownMenu.add(FemalesPanel);
		FemalesPanel.setLayout(null);
		FemalesPanel.add(lblFemales);
		FemalesPanel.add(arrowFemale);
		
		JLabel lblElectronics = new JLabel("Electronics");
		lblElectronics.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblElectronics.setBounds(10, 11, 100, 14);
		
		JLabel arrowElec = new JLabel("");
		arrowElec.setVisible(false);
		arrowElec.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrowElec.setBounds(169, 0, 19, 30);
		
		JPanel ElecPanel = new JPanel();
		ElecPanel.setBackground(Color.WHITE);
		ElecPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowElec.setVisible(true);
				ElecPanel.setBackground(Color.GRAY);
				lblElectronics.setForeground(new Color(51, 255, 255));
				
				ShowSubMenuPanel(subMenus,new String[]{"Electronics"});
			}
			public void mouseExited(MouseEvent e) {
				arrowElec.setVisible(false);
				ElecPanel.setBackground(Color.WHITE);
				lblElectronics.setForeground(Color.BLACK);
			}
		});
		ElecPanel.setBounds(0, 103, 198, 34);
		pullDownMenu.add(ElecPanel);
		ElecPanel.setLayout(null);
		ElecPanel.add(lblElectronics);
		ElecPanel.add(arrowElec);
		
		JLabel lblGroceries = new JLabel("Groceries & Pets");
		lblGroceries.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblGroceries.setBounds(10, 11, 100, 14);
		
		JLabel arrowGroce = new JLabel("");
		arrowGroce.setVisible(false);
		arrowGroce.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrowGroce.setBounds(169, 0, 19, 30);
		
		JPanel GroceriesPanel = new JPanel();
		GroceriesPanel.setBackground(Color.WHITE);
		GroceriesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowGroce.setVisible(true);
				GroceriesPanel.setBackground(Color.GRAY);
				lblGroceries.setForeground(new Color(51, 255, 255));
				
				ShowSubMenuPanel(subMenus,new String[]{"Groceries","Pets"});
			}
			public void mouseExited(MouseEvent e) {
				arrowGroce.setVisible(false);
				GroceriesPanel.setBackground(Color.WHITE);
				lblGroceries.setForeground(Color.BLACK);
			}
		});
		GroceriesPanel.setLayout(null);
		GroceriesPanel.setBounds(0, 138, 198, 34);
		pullDownMenu.add(GroceriesPanel);
		GroceriesPanel.add(lblGroceries);
		GroceriesPanel.add(arrowGroce);
		
		JLabel lblSport = new JLabel("Sports & Travel");
		lblSport.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblSport.setBounds(10, 11, 100, 14);
		
		JLabel arrowSport = new JLabel("");
		arrowSport.setVisible(false);
		arrowSport.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrowSport.setBounds(169, 0, 19, 30);
		
		JPanel SportPanel = new JPanel();
		SportPanel.setBackground(Color.WHITE);
		SportPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowSport.setVisible(true);
				SportPanel.setBackground(Color.GRAY);
				lblSport.setForeground(new Color(51, 255, 255));
				
				ShowSubMenuPanel(subMenus,new String[]{"Sports","Travel"});
			}
			public void mouseExited(MouseEvent e) {
				arrowSport.setVisible(false);
				SportPanel.setBackground(Color.WHITE);
				lblSport.setForeground(Color.BLACK);
			}
		});
		SportPanel.setLayout(null);
		SportPanel.setBounds(0, 173, 198, 34);
		pullDownMenu.add(SportPanel);
		SportPanel.add(lblSport);
		SportPanel.add(arrowSport);
		
		JLabel lblHealth = new JLabel("Health & Lifestyle");
		lblHealth.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblHealth.setBounds(10, 11, 128, 14);
		
		JLabel arrowHealth = new JLabel("");
		arrowHealth.setVisible(false);
		arrowHealth.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrowHealth.setBounds(169, 0, 19, 30);
		
		JPanel HealthPanel = new JPanel();
		HealthPanel.setBackground(Color.WHITE);
		HealthPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrowHealth.setVisible(true);
				HealthPanel.setBackground(Color.GRAY);
				lblHealth.setForeground(new Color(51, 255, 255));
				
				ShowSubMenuPanel(subMenus,new String[]{"Home","Lifestyle"});
			}
			public void mouseExited(MouseEvent e) {
				arrowHealth.setVisible(false);
				HealthPanel.setBackground(Color.WHITE);
				lblHealth.setForeground(Color.BLACK);
			}
		});
		HealthPanel.setLayout(null);
		HealthPanel.setBounds(0, 209, 198, 34);
		pullDownMenu.add(HealthPanel);
		HealthPanel.add(lblHealth);
		HealthPanel.add(arrowHealth);
		
		banner = new JLabel("");
		banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner1.png")));
		banner.setBounds(0, 0, 1559, 263);
		ShowPanel.add(banner);
		
		SubShowPanel = new JPanel();
		SubShowPanel.setBounds(0, 382, 1241, 1062);
		ShowPanel.add(SubShowPanel);
		SubShowPanel.setLayout(null);
		SubShowPanel.setBackground(SystemColor.menu);
		
		MostPop_Img = new ImagePanel((Image) null);
		MostPop_Img.setBackground(Color.WHITE);
		MostPop_Img.setBounds(99, 11, 220, 212);
		SubShowPanel.add(MostPop_Img);
		
		tbl_MostPop = new JTable();
		tbl_MostPop.setBounds(329, 11, 807, 212);
		
		SubShowPanel.add(tbl_MostPop);
		
		JLabel label_6 = new JLabel("Collections");
		label_6.setFont(new Font("Dubai", Font.PLAIN, 26));
		label_6.setBounds(99, 257, 162, 34);
		SubShowPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Flash Sale");
		label_7.setFont(new Font("Dubai", Font.PLAIN, 26));
		label_7.setBounds(100, 580, 142, 34);
		SubShowPanel.add(label_7);
		
		tbl_FlashSale = new JTable();
		tbl_FlashSale.setBounds(100, 692, 1037, 150);
		SubShowPanel.add(tbl_FlashSale);
		
		JPanel tbl_Collections = new JPanel();
		tbl_Collections.setLayout(null);
		tbl_Collections.setBounds(85, 311, 1024, 228);
		SubShowPanel.add(tbl_Collections);
		
		JPanel CollOne_Show = new JPanel();
		CollOne_Show.setLayout(null);
		CollOne_Show.setBackground(Color.WHITE);
		CollOne_Show.setBounds(55, 11, 405, 209);
		tbl_Collections.add(CollOne_Show);
		
		JLabel lblCollOne = new JLabel("Converse!!! Callin'");
		lblCollOne.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblCollOne.setBounds(144, 11, 140, 26);
		CollOne_Show.add(lblCollOne);
		
		ImagePanel Img1CollOne = new ImagePanel();
		Img1CollOne.setImage((BufferedImage)listImage.get(9).getNewProduct_Img());
		Img1CollOne.setBounds(10, 68, 121, 130);
		CollOne_Show.add(Img1CollOne);
		
		ImagePanel Img2CollOne = new ImagePanel();
		Img2CollOne.setImage((BufferedImage)listImage.get(10).getNewProduct_Img());
		Img2CollOne.setBounds(141, 68, 121, 130);
		CollOne_Show.add(Img2CollOne);
		
		ImagePanel Img3CollOne = new ImagePanel();
		Img3CollOne.setImage((BufferedImage)listImage.get(11).getNewProduct_Img());
		Img3CollOne.setBounds(272, 68, 121, 130);
		CollOne_Show.add(Img3CollOne);
		
		JPanel CollTwo_Show = new JPanel();
		CollTwo_Show.setLayout(null);
		CollTwo_Show.setBackground(Color.WHITE);
		CollTwo_Show.setBounds(572, 11, 405, 209);
		tbl_Collections.add(CollTwo_Show);
		
		JLabel lblCollTwo = new JLabel("be Save and be Seer");
		lblCollTwo.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblCollTwo.setBounds(146, 11, 150, 26);
		CollTwo_Show.add(lblCollTwo);
		
		ImagePanel Img1CollTwo = new ImagePanel();
		Img1CollTwo.setImage((BufferedImage)listImage.get(12).getNewProduct_Img());
		Img1CollTwo.setBounds(10, 68, 121, 130);
		CollTwo_Show.add(Img1CollTwo);
		
		ImagePanel Img2CollTwo = new ImagePanel();
		Img2CollTwo.setImage((BufferedImage)listImage.get(13).getNewProduct_Img());
		Img2CollTwo.setBounds(141, 68, 121, 130);
		CollTwo_Show.add(Img2CollTwo);
		
		ImagePanel Img3CollTwo = new ImagePanel();
		Img3CollTwo.setImage((BufferedImage)listImage.get(14).getNewProduct_Img());
		Img3CollTwo.setBounds(272, 68, 121, 130);
		CollTwo_Show.add(Img3CollTwo);
		
		JPanel FlashTime_Panel = new JPanel();
		FlashTime_Panel.setBounds(100, 627, 1037, 45);
		SubShowPanel.add(FlashTime_Panel);
		FlashTime_Panel.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
		FlashTime_Panel.setBackground(Color.DARK_GRAY);
		FlashTime_Panel.setLayout(null);
		
		JLabel label_3 = new JLabel("\u0E02\u0E13\u0E30\u0E19\u0E35\u0E49\u0E25\u0E14\u0E23\u0E32\u0E04\u0E32\u0E2D\u0E22\u0E39\u0E48                 ");
		label_3.setForeground(Color.ORANGE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(10, 11, 124, 23);
		FlashTime_Panel.add(label_3);
		
		JPanel HourPanel = new JPanel();
		HourPanel.setBackground(new Color(255, 0, 51));
		HourPanel.setBounds(316, 11, 52, 23);
		FlashTime_Panel.add(HourPanel);
		HourPanel.setLayout(null);
		
		Hourcount = new JLabel("02");
		Hourcount.setBounds(15, 0, 16, 23);
		HourPanel.add(Hourcount);
		Hourcount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Hourcount.setForeground(Color.WHITE);
		
		JLabel label_10 = new JLabel(":");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_10.setBounds(378, 15, 11, 14);
		FlashTime_Panel.add(label_10);
		
		JPanel MinPanel = new JPanel();
		MinPanel.setLayout(null);
		MinPanel.setBackground(new Color(255, 0, 51));
		MinPanel.setBounds(397, 11, 52, 23);
		FlashTime_Panel.add(MinPanel);
		
		Mincount = new JLabel("10");
		Mincount.setForeground(Color.WHITE);
		Mincount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Mincount.setBounds(15, 0, 16, 23);
		MinPanel.add(Mincount);
		
		JLabel label_12 = new JLabel(":");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(459, 15, 11, 14);
		FlashTime_Panel.add(label_12);
		
		JPanel SecPanel = new JPanel();
		SecPanel.setLayout(null);
		SecPanel.setBackground(new Color(255, 0, 51));
		SecPanel.setBounds(480, 11, 52, 23);
		FlashTime_Panel.add(SecPanel);
		
		Seccount = new JLabel("10");
		Seccount.setForeground(Color.WHITE);
		Seccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Seccount.setBounds(15, 0, 16, 23);
		SecPanel.add(Seccount);
		
		JLabel label_14 = new JLabel("\u0E08\u0E30\u0E2A\u0E34\u0E49\u0E19\u0E2A\u0E38\u0E14\u0E43\u0E19");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_14.setBounds(222, 11, 84, 23);
		FlashTime_Panel.add(label_14);
		
		JPanel FollowUsPanel = new JPanel();
		FollowUsPanel.setBounds(0, 877, 1241, 152);
		SubShowPanel.add(FollowUsPanel);
		FollowUsPanel.setLayout(null);
		FollowUsPanel.setBackground(Color.WHITE);
		
		JLabel label_8 = new JLabel("Follow Us");
		label_8.setForeground(Color.DARK_GRAY);
		label_8.setFont(new Font("Dubai", Font.PLAIN, 25));
		label_8.setBounds(448, 31, 108, 25);
		FollowUsPanel.add(label_8);
		
		JLabel label_11 = new JLabel("\u00A9 BigMall 2018");
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setBounds(970, 40, 72, 14);
		FollowUsPanel.add(label_11);
		
		JPanel LogosPanel = new JPanel();
		LogosPanel.setLayout(null);
		LogosPanel.setBackground(Color.WHITE);
		LogosPanel.setBounds(448, 56, 264, 44);
		FollowUsPanel.add(LogosPanel);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/facebook.png")));
		label_13.setBounds(0, 11, 33, 34);
		LogosPanel.add(label_13);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/twitter.PNG")));
		label_15.setBounds(33, 11, 33, 34);
		LogosPanel.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/gg_plus.png")));
		label_16.setBounds(65, 11, 33, 34);
		LogosPanel.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/instagram.png")));
		label_17.setBounds(97, 11, 33, 34);
		LogosPanel.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/youtuber.png")));
		label_18.setBounds(129, 11, 33, 34);
		LogosPanel.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/pinteres.png")));
		label_19.setBounds(162, 11, 33, 34);
		LogosPanel.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/blogg.png")));
		label_20.setBounds(195, 11, 33, 34);
		LogosPanel.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/tumblr.PNG")));
		label_21.setBounds(228, 11, 33, 34);
		LogosPanel.add(label_21);
		loadData();
		Countdown();
		changeBanner();
		
		lblUser.setText("ºÑ­ªÕ¢Í§ "+username.toUpperCase());
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
				panelShowTag.setVisible(false);
			}
		});
		
		panelShow.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel.setForeground(new Color(255, 69, 0));
						lblNewLabel.setBorder(UIManager.getBorder("MenuBar.border"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel.setForeground(Color.BLACK);
					}
				});
				labelMyOrder.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						labelMyOrder.setForeground(new Color(255, 69, 0));
						labelMyOrder.setBorder(UIManager.getBorder("MenuBar.border"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						labelMyOrder.setForeground(Color.BLACK);
					}
				});
				labelLogOut.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						labelLogOut.setForeground(new Color(255, 69, 0));
						labelLogOut.setBorder(UIManager.getBorder("MenuBar.border"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						labelLogOut.setForeground(Color.BLACK);
					}
				});
			}
		});
		
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
		
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
				panelShowTag.setVisible(false);
			}
		});
	}
	public void loadData() {
		DefaultTableModel modelMost = new DefaultTableModel();
		modelMost.addColumn("A"); modelMost.addColumn("B"); modelMost.addColumn("C"); modelMost.addColumn("D");
		
		MostPop_Img.setImage((BufferedImage) listImage.getFirst().getNewProduct_Img());
		
		for(int i=1;i<listImage.size();i++) {
			int c = 0;
			if(!((listImage.size()-1) - i <= 2)) {
				c = i;
				modelMost.addRow(new Object[]{listImage.get(c).getNewProduct_Img(),
						listImage.get(c+1).getNewProduct_Img(),
						listImage.get(c+2).getNewProduct_Img(),
						listImage.get(c+3).getNewProduct_Img()});
				i += 3;
			}
		}
		tbl_MostPop.setModel(modelMost);
		tbl_MostPop.getColumn("A").setCellRenderer(new DataTableRenderer());
		tbl_MostPop.getColumn("B").setCellRenderer(new DataTableRenderer());
		tbl_MostPop.getColumn("C").setCellRenderer(new DataTableRenderer());
		tbl_MostPop.getColumn("D").setCellRenderer(new DataTableRenderer());
		tbl_MostPop.setRowHeight(110);
		
		DefaultTableModel modelFlash = new DefaultTableModel();
		modelFlash.addColumn("A"); modelFlash.addColumn("B"); modelFlash.addColumn("C"); modelFlash.addColumn("D");
		
		modelFlash.addRow(new Object[]{listImage.get(0).getNewProduct_Img(),
						listImage.get(1).getNewProduct_Img(),
						listImage.get(2).getNewProduct_Img(),
						listImage.get(3).getNewProduct_Img()});
		tbl_FlashSale.setModel(modelFlash);
		tbl_FlashSale.getColumn("A").setCellRenderer(new DataTableRenderer());
		tbl_FlashSale.getColumn("B").setCellRenderer(new DataTableRenderer());
		tbl_FlashSale.getColumn("C").setCellRenderer(new DataTableRenderer());
		tbl_FlashSale.getColumn("D").setCellRenderer(new DataTableRenderer());
		tbl_FlashSale.setRowHeight(150);
	}
	public void Countdown() {
		Timer timer;
		timer = new Timer(1000, new ActionListener() {
			int count = 10;
			public void actionPerformed(ActionEvent e) {
				if(Hourcount.getText().trim().equals("00")) {
					((Timer) (e.getSource())).stop();
				}
				Seccount.setText("0"+Integer.toString(--count));
				if(Seccount.getText().trim().equals("00")) {
					count = 10;        		
		        	Mincount.setText("0"+Integer.toString(Integer.parseInt(Mincount.getText())-1));
		        	Seccount.setText(Integer.toString(count));
				}	
				else if(Mincount.getText().trim().equals("01") && Seccount.getText().trim().equals("01")) {
					Mincount.setText("10");
					Hourcount.setText("0"+Integer.toString(Integer.parseInt(Hourcount.getText())-1));
				}	
		    }
		});
		timer.setInitialDelay(0);
	    timer.start();
	}
	public void changeBanner() {
		Timer timer;
		timer = new Timer(5000, new ActionListener() {
			int count = 1;
			public void actionPerformed(ActionEvent e) {
				if(count == 1) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner1.png")));
				}
				else if(count == 2) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner2.png")));
				}
				else if(count == 3) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner3.png")));
				}
				else if(count == 4) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner4.png")));
				}
				else if(count == 5) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner5.png")));
				}
				else if(count == 6) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner6.png")));
				}
				else if(count == 7) {
					banner.setIcon(new ImageIcon(Home_LoggedIn.class.getResource("/Image/rbanner7.png")));
					count = 1;
				}
				++count;
			}
		});
		timer.setInitialDelay(0);
	    timer.start();
	}
	public void ShowSubMenuPanel(List<JPanel> AllPanels,String[] TotalShows) {
		Sub_pullDownMenu.setVisible(true);
		for(int i=0;i<AllPanels.size();i++) {
			JPanel tempPanel = (JPanel)AllPanels.get(i);
			if((i+1) <= TotalShows.length) {
				tempPanel.setVisible(true);
				for(Component components : tempPanel.getComponents()) {
					if(components instanceof JLabel) {
						JLabel lbl = (JLabel)components;
						lbl.setText(TotalShows[i]);
					}
				}
			}
			else {
				tempPanel.setVisible(false);
			}
		}
	}
}