package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DatabaseAndTools.ImagePanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BigMallLoggedIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel CatergoriesPanel;
	private JPanel Sub_CategoriesPanel;
	private JLabel lblCatergories;
	private JLabel menuPuller;
	private JLabel banner;
	private JPanel Kinds_Categories;
	List<JPanel> subMenus = new LinkedList<>();
	List<JLabel> controlRowLabel = new LinkedList<>();
	List<String> PicbrandLabels = new LinkedList<>();
	List<String> NamebrandLabels = new LinkedList<>();
	List<String> StorePics = new LinkedList<>();
	
	
	List<JPanel> PackofStoresPics = new LinkedList<>();
	List<JLabel> PackofPicBrands = new LinkedList<>();
	List<JLabel> PackofNameBrands = new LinkedList<>();
	List<JLabel> PackofStoresPrices = new LinkedList<>();
	/********************************************************************************/
	/***/private JPanel Store1;			    /***/private JPanel Store2;          /***/
	/***/private JLabel brandStore1;		/***/private JLabel brandStore2;  	 /***/
	/***/private JLabel nameBrandStore1;	/***/private JLabel nameBrandStore2; /***/
	/***/private JLabel lblLazmallStore1;	/***/private JLabel lblLazmallStore2;/***/
	/***/private ImagePanel Store1Pic1;		/***/private ImagePanel Store2Pic1;	 /***/
	/***/private ImagePanel Store1Pic2;		/***/private ImagePanel Store2Pic2;	 /***/
	/***/private ImagePanel Store1Pic3;		/***/private ImagePanel Store2Pic3;	 /***/
	/***/private JLabel Store1Price1;		/***/private JLabel Store2Price1;	 /***/
	/***/private JLabel Store1Price2;		/***/private JLabel Store2Price2;	 /***/
	/***/private JLabel Store1Price3;		/***/private JLabel Store2Price3;	 /***/
	/********************************************************************************/
	/***/private JPanel Store3;			    /***/private JPanel Store4;	         /***/
	/***/private JLabel brandStore3;		/***/private JLabel brandStore4;	 /***/
	/***/private JLabel nameBrandStore3;	/***/private JLabel nameBrandStore4; /***/
	/***/private JLabel lblLazmallStore3;	/***/private JLabel lblLazmallStore4;/***/
	/***/private ImagePanel Store3Pic1;		/***/private ImagePanel Store4Pic1;	 /***/
	/***/private ImagePanel Store3Pic2;		/***/private ImagePanel Store4Pic2;	 /***/
	/***/private ImagePanel Store3Pic3;		/***/private ImagePanel Store4Pic3;	 /***/
	/***/private JLabel Store3Price1;		/***/private JLabel Store4Price1;	 /***/
	/***/private JLabel Store3Price2;		/***/private JLabel Store4Price2;	 /***/
	/***/private JLabel Store3Price3;		/***/private JLabel Store4Price3;	 /***/
	/********************************************************************************/
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
			            UIManager.getSystemLookAndFeelClassName());
					BigMallLoggedIn frame = new BigMallLoggedIn("Champ",1);
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
	public BigMallLoggedIn(String username,int user_id) {
		
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int res = JOptionPane.showConfirmDialog(BigMallLoggedIn.this, "Are you sure to closing window?", "Confirm closing", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(res == JOptionPane.YES_OPTION) {
					Home.BigMallAllowed = 0;
					dispose();
				}
				else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		setTitle("BIG SALE - BigMall");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage(Home.class.getResource("/Image/ICON.png"));
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 0, 1039, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelShow = new JPanel();
		panelShow.setVisible(false);
		panelShow.setBounds(724, 42, 232, 226);
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
		
		panelShow.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel.setForeground(new Color(255, 69, 0));
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
					}
					@Override
					public void mouseExited(MouseEvent e) {
						labelLogOut.setForeground(Color.BLACK);
					}
				});
			}
		});
		
		JPanel SearchBar = new JPanel();
		SearchBar.setBounds(0, 0, 1023, 42);
		SearchBar.setLayout(null);
		SearchBar.setBackground(new Color(0, 51, 51));
		contentPane.add(SearchBar);
		
		JLabel lblUser = new JLabel("New label");
		lblUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser.setBounds(727, 11, 204, 23);
		lblUser.setText("ºÑ­ªÕ¢Í§ "+username.toUpperCase());
		SearchBar.add(lblUser);
		
		lblUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelShow.setVisible(true);
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
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
			}
		});
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/markz.png")));
		label_8.setBounds(974, 11, 22, 27);
		SearchBar.add(label_8);
		
		JLabel label_5 = new JLabel("\u0E15\u0E34\u0E14\u0E15\u0E32\u0E21\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E32");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(559, 11, 95, 23);
		SearchBar.add(label_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
			}
		});
		scrollPane.setBounds(0, 204, 1023, 517);
		contentPane.add(scrollPane);
		
		JPanel ShowPanel = new JPanel();
		ShowPanel.setPreferredSize(new Dimension(400, 2455));
		scrollPane.setViewportView(ShowPanel);
		ShowPanel.setLayout(null);
		
		Sub_CategoriesPanel = new JPanel();
		Sub_CategoriesPanel.setBackground(Color.WHITE);
		Sub_CategoriesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Sub_CategoriesPanel.setVisible(true);
			}
			public void mouseExited(MouseEvent e) {
				menuPuller.setVisible(true);
				CatergoriesPanel.setVisible(false);
				Kinds_Categories.setVisible(false);
				Sub_CategoriesPanel.setVisible(false);
				lblCatergories.setForeground(Color.WHITE);
			}
		});
		Sub_CategoriesPanel.setVisible(false);
		
		Kinds_Categories = new JPanel();
		Kinds_Categories.setVisible(false);
		Kinds_Categories.setBackground(Color.WHITE);
		Kinds_Categories.setBounds(251, -1, 198, 291);
		ShowPanel.add(Kinds_Categories);
		Kinds_Categories.setLayout(null);
		
		JPanel subMenu1 = new JPanel();
		JLabel submenulbl1 = new JLabel("?");
		submenulbl1.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl1.setBounds(10, 11, 113, 14);
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
		subMenu1.setLayout(null);
		subMenu1.setBackground(Color.WHITE);
		subMenu1.setBounds(0, 0, 198, 34);
		Kinds_Categories.add(subMenu1);
		
		JPanel subMenu2 = new JPanel();
		JLabel submenulbl2 = new JLabel("?");
		submenulbl2.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl2.setBounds(10, 11, 113, 14);
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
		subMenu2.setLayout(null);
		subMenu2.setBackground(Color.WHITE);
		subMenu2.setBounds(0, 34, 198, 34);
		Kinds_Categories.add(subMenu2);
		
		JPanel subMenu3 = new JPanel();
		JLabel submenulbl3 = new JLabel("?");
		submenulbl3.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl3.setBounds(10, 11, 113, 14);
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
		subMenu3.setLayout(null);
		subMenu3.setBackground(Color.WHITE);
		subMenu3.setBounds(0, 68, 198, 34);
		Kinds_Categories.add(subMenu3);
		
		JPanel subMenu4 = new JPanel();
		JLabel submenulbl4 = new JLabel("?");
		submenulbl4.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl4.setBounds(10, 11, 113, 14);
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
		subMenu4.setLayout(null);
		subMenu4.setBackground(Color.WHITE);
		subMenu4.setBounds(0, 102, 198, 34);
		Kinds_Categories.add(subMenu4);
		
		JPanel subMenu5 = new JPanel();
		JLabel submenulbl5 = new JLabel("?");
		submenulbl5.setFont(new Font("Dubai", Font.PLAIN, 14));
		submenulbl5.setBounds(10, 11, 113, 14);
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
		subMenu5.setLayout(null);
		subMenu5.setBackground(Color.WHITE);
		subMenu5.setBounds(0, 136, 198, 34);
		Kinds_Categories.add(subMenu5);
		subMenu5.add(submenulbl5);
		Sub_CategoriesPanel.setBounds(54, -1, 198, 291);
		ShowPanel.add(Sub_CategoriesPanel);
		Sub_CategoriesPanel.setLayout(null);
		
		subMenus.add(subMenu1);
		subMenus.add(subMenu2);
		subMenus.add(subMenu3);
		subMenus.add(subMenu4);
		subMenus.add(subMenu5);
		
		JPanel ToysPanel = new JPanel();
		JLabel lblToys = new JLabel("Babies & Toys");
		lblToys.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblToys.setBounds(10, 11, 113, 14);
		ToysPanel.add(lblToys);
		
		JLabel arrow1 = new JLabel("");
		arrow1.setVisible(false);
		arrow1.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrow1.setBounds(169, 0, 19, 30);
		ToysPanel.add(arrow1);
		ToysPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow1.setVisible(true);
				ToysPanel.setBackground(Color.GRAY);
				lblToys.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Babies Gear", "Baby Clothing", "Baby Personal Care", "Baby & Toys", "Figure & Collectibles"});
			}
			public void mouseExited(MouseEvent e) {
				arrow1.setVisible(false);
				ToysPanel.setBackground(Color.WHITE);
				lblToys.setForeground(Color.BLACK);
				
			}
		});
		ToysPanel.setBackground(Color.WHITE);
		ToysPanel.setBounds(0, 0, 198, 34);
		Sub_CategoriesPanel.add(ToysPanel);
		ToysPanel.setLayout(null);
		
		JPanel MalesPanel = new JPanel();
		
		JLabel lblMalesFashion = new JLabel("Male's Fashion");
		lblMalesFashion.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblMalesFashion.setBounds(10, 11, 113, 14);
		MalesPanel.add(lblMalesFashion);
		
		JLabel arrow2 = new JLabel("");
		arrow2.setVisible(false);
		arrow2.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrow2.setBounds(169, 0, 19, 30);
		MalesPanel.add(arrow2);
		MalesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow2.setVisible(true);
				MalesPanel.setBackground(Color.GRAY);
				lblMalesFashion.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Shirts","Pants","Shoes","Accessories"});
			}
			public void mouseExited(MouseEvent e) {
				arrow2.setVisible(false);
				MalesPanel.setBackground(Color.WHITE);
				lblMalesFashion.setForeground(Color.BLACK);
				
			}
		});
		MalesPanel.setLayout(null);
		MalesPanel.setBackground(Color.WHITE);
		MalesPanel.setBounds(0, 34, 198, 34);
		Sub_CategoriesPanel.add(MalesPanel);
		
		JPanel FemalesPanel = new JPanel();
		JLabel lblFemalesFashion = new JLabel("Female's Fashion");
		lblFemalesFashion.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblFemalesFashion.setBounds(10, 11, 113, 14);
		FemalesPanel.add(lblFemalesFashion);
		
		JLabel arrow3 = new JLabel("");
		arrow3.setVisible(false);
		arrow3.setBounds(169, 0, 19, 30);
		arrow3.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		FemalesPanel.add(arrow3);
		FemalesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow3.setVisible(true);
				FemalesPanel.setBackground(Color.GRAY);
				lblFemalesFashion.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Shirts","Pants","Shoes","Accessories"});
			}
			public void mouseExited(MouseEvent e) {
				arrow3.setVisible(false);
				FemalesPanel.setBackground(Color.WHITE);
				lblFemalesFashion.setForeground(Color.BLACK);
				
			}
		});
		FemalesPanel.setLayout(null);
		FemalesPanel.setBackground(Color.WHITE);
		FemalesPanel.setBounds(0, 68, 198, 34);
		Sub_CategoriesPanel.add(FemalesPanel);
		
		JPanel ElecsPanel = new JPanel();
		JLabel lblElectronics = new JLabel("Electronics");
		lblElectronics.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblElectronics.setBounds(10, 11, 113, 14);
		ElecsPanel.add(lblElectronics);
		
		JLabel arrow4 = new JLabel("");
		arrow4.setVisible(false);
		arrow4.setBounds(169, 0, 19, 30);
		arrow4.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		ElecsPanel.add(arrow4);
		ElecsPanel.setLayout(null);
		ElecsPanel.setBackground(Color.WHITE);
		ElecsPanel.setBounds(0, 102, 198, 34);
		Sub_CategoriesPanel.add(ElecsPanel);
		ElecsPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow4.setVisible(true);
				ElecsPanel.setBackground(Color.GRAY);
				lblElectronics.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Electronics"});
			}
			public void mouseExited(MouseEvent e) {
				arrow4.setVisible(false);
				ElecsPanel.setBackground(Color.WHITE);
				lblElectronics.setForeground(Color.BLACK);
				
			}
		});
		
		JPanel GrocesPanel = new JPanel();
		JLabel lblGroceriesPets = new JLabel("Groceries & Pets");
		lblGroceriesPets.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblGroceriesPets.setBounds(10, 11, 113, 14);
		GrocesPanel.add(lblGroceriesPets);
		
		JLabel arrow5 = new JLabel("");
		arrow5.setVisible(false);
		arrow5.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrow5.setBounds(169, 0, 19, 30);
		GrocesPanel.add(arrow5);
		GrocesPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow5.setVisible(true);
				GrocesPanel.setBackground(Color.GRAY);
				lblGroceriesPets.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Groceries","Pets"});
			}
			public void mouseExited(MouseEvent e) {
				arrow5.setVisible(false);
				GrocesPanel.setBackground(Color.WHITE);
				lblGroceriesPets.setForeground(Color.BLACK);
				
			}
		});
		GrocesPanel.setBackground(Color.WHITE);
		GrocesPanel.setBounds(0, 136, 198, 34);
		Sub_CategoriesPanel.add(GrocesPanel);
		GrocesPanel.setLayout(null);
		
		JPanel SportsPanel = new JPanel();
		JLabel lblSportsTravel = new JLabel("Sports & Travel");
		lblSportsTravel.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblSportsTravel.setBounds(10, 11, 113, 14);
		SportsPanel.add(lblSportsTravel);
		
		JLabel arrow6 = new JLabel("");
		arrow6.setVisible(false);
		arrow6.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrow6.setBounds(169, 0, 19, 30);
		SportsPanel.add(arrow6);
		SportsPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow6.setVisible(true);
				SportsPanel.setBackground(Color.GRAY);
				lblSportsTravel.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Sports","Travel"});
			}
			public void mouseExited(MouseEvent e) {
				arrow6.setVisible(false);
				SportsPanel.setBackground(Color.WHITE);
				lblSportsTravel.setForeground(Color.BLACK);
				
			}
		});
		SportsPanel.setLayout(null);
		SportsPanel.setBackground(Color.WHITE);
		SportsPanel.setBounds(0, 170, 198, 34);
		Sub_CategoriesPanel.add(SportsPanel);
		
		JPanel HomePanel = new JPanel();
		JLabel lblHomeLifestyle = new JLabel("Home & Lifestyle");
		lblHomeLifestyle.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblHomeLifestyle.setBounds(10, 11, 113, 14);
		HomePanel.add(lblHomeLifestyle);
		
		JLabel arrow7 = new JLabel("");
		arrow7.setVisible(false);
		arrow7.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/arrowMenu.png")));
		arrow7.setBounds(169, 0, 19, 30);
		HomePanel.add(arrow7);
		HomePanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				arrow7.setVisible(true);
				HomePanel.setBackground(Color.GRAY);
				lblHomeLifestyle.setForeground(new Color(51, 255, 255));

				ShowSubMenuPanel(subMenus,new String[]{"Home","Lifestyle"});
			}
			public void mouseExited(MouseEvent e) {
				arrow7.setVisible(false);
				HomePanel.setBackground(Color.WHITE);
				lblHomeLifestyle.setForeground(Color.BLACK);
				
			}
		});
		HomePanel.setBackground(Color.WHITE);
		HomePanel.setBounds(0, 204, 198, 34);
		Sub_CategoriesPanel.add(HomePanel);
		HomePanel.setLayout(null);
		
		JPanel Sub_ShowPanel = new JPanel();
		Sub_ShowPanel.setLayout(null);
		Sub_ShowPanel.setBounds(0, 369, 1015, 2455);
		ShowPanel.add(Sub_ShowPanel);
		
		JPanel FollowUsPanel = new JPanel();
		FollowUsPanel.setLayout(null);
		FollowUsPanel.setBackground(Color.WHITE);
		FollowUsPanel.setBounds(0, 1930, 1021, 152);
		Sub_ShowPanel.add(FollowUsPanel);
		
		JLabel label_122 = new JLabel("Follow Us");
		label_122.setForeground(Color.DARK_GRAY);
		label_122.setFont(new Font("Dubai", Font.PLAIN, 25));
		label_122.setBounds(338, 40, 108, 25);
		FollowUsPanel.add(label_122);
		
		JLabel label_123 = new JLabel("\u00A9 BigMall 2018");
		label_123.setForeground(Color.DARK_GRAY);
		label_123.setBounds(860, 49, 72, 14);
		FollowUsPanel.add(label_123);
		
		JPanel FollowPanel = new JPanel();
		FollowPanel.setLayout(null);
		FollowPanel.setBackground(Color.WHITE);
		FollowPanel.setBounds(338, 65, 264, 44);
		FollowUsPanel.add(FollowPanel);
		
		JLabel label_124 = new JLabel("");
		label_124.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/facebook.png")));
		label_124.setBounds(0, 11, 33, 34);
		FollowPanel.add(label_124);
		
		JLabel label_125 = new JLabel("");
		label_125.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/twitter.PNG")));
		label_125.setBounds(33, 11, 33, 34);
		FollowPanel.add(label_125);
		
		JLabel label_126 = new JLabel("");
		label_126.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/gg_plus.png")));
		label_126.setBounds(65, 11, 33, 34);
		FollowPanel.add(label_126);
		
		JLabel label_127 = new JLabel("");
		label_127.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/instagram.png")));
		label_127.setBounds(97, 11, 33, 34);
		FollowPanel.add(label_127);
		
		JLabel label_128 = new JLabel("");
		label_128.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/youtuber.png")));
		label_128.setBounds(129, 11, 33, 34);
		FollowPanel.add(label_128);
		
		JLabel label_129 = new JLabel("");
		label_129.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/pinteres.png")));
		label_129.setBounds(162, 11, 33, 34);
		FollowPanel.add(label_129);
		
		JLabel label_130 = new JLabel("");
		label_130.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/blogg.png")));
		label_130.setBounds(195, 11, 33, 34);
		FollowPanel.add(label_130);
		
		JLabel label_131 = new JLabel("");
		label_131.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/tumblr.PNG")));
		label_131.setBounds(228, 11, 33, 34);
		FollowPanel.add(label_131);
		
		JPanel StoreForYouPanel = new JPanel();
		StoreForYouPanel.setLayout(null);
		StoreForYouPanel.setBounds(0, 624, 1015, 619);
		Sub_ShowPanel.add(StoreForYouPanel);
		
		Store1 = new JPanel();
		Store1.setLayout(null);
		Store1.setBackground(Color.WHITE);
		Store1.setBounds(21, 11, 474, 287);
		StoreForYouPanel.add(Store1);
		
		brandStore1 = new JLabel("");
		brandStore1.setBackground(Color.WHITE);
		brandStore1.setBounds(10, 11, 79, 81);
		Store1.add(brandStore1);
		
		nameBrandStore1 = new JLabel("?");
		nameBrandStore1.setFont(new Font("Dubai", Font.PLAIN, 13));
		nameBrandStore1.setBounds(101, 11, 177, 22);
		Store1.add(nameBrandStore1);
		
		lblLazmallStore1 = new JLabel("");
		lblLazmallStore1.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/flagship.PNG")));
		lblLazmallStore1.setBounds(99, 44, 196, 22);
		Store1.add(lblLazmallStore1);
		
		Store1Pic1 = new ImagePanel();
		Store1Pic1.setBounds(10, 103, 144, 152);
		Store1.add(Store1Pic1);
		
		Store1Pic2 = new ImagePanel();
		Store1Pic2.setBounds(164, 103, 144, 152);
		Store1.add(Store1Pic2);
		
		Store1Pic3 = new ImagePanel();
		Store1Pic3.setBounds(318, 103, 144, 152);
		Store1.add(Store1Pic3);
		
		Store1Price1 = new JLabel("\u0E3F?");
		Store1Price1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store1Price1.setBounds(10, 258, 144, 22);
		Store1.add(Store1Price1);
		
		Store1Price2 = new JLabel("\u0E3F?");
		Store1Price2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store1Price2.setBounds(164, 258, 144, 22);
		Store1.add(Store1Price2);
		
		Store1Price3 = new JLabel("\u0E3F?");
		Store1Price3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store1Price3.setBounds(318, 258, 144, 22);
		Store1.add(Store1Price3);
		
		Store2 = new JPanel();
		Store2.setLayout(null);
		Store2.setBackground(Color.WHITE);
		Store2.setBounds(513, 11, 474, 287);
		StoreForYouPanel.add(Store2);
		
		brandStore2 = new JLabel("");
		brandStore2.setBackground(Color.WHITE);
		brandStore2.setBounds(10, 11, 79, 81);
		Store2.add(brandStore2);
		
		nameBrandStore2 = new JLabel("?");
		nameBrandStore2.setFont(new Font("Dubai", Font.PLAIN, 13));
		nameBrandStore2.setBounds(101, 11, 177, 22);
		Store2.add(nameBrandStore2);
		
		lblLazmallStore2 = new JLabel("");
		lblLazmallStore2.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/flagship.PNG")));
		lblLazmallStore2.setBounds(99, 44, 196, 22);
		Store2.add(lblLazmallStore2);
		
		Store2Pic1 = new ImagePanel();
		Store2Pic1.setBounds(10, 103, 144, 152);
		Store2.add(Store2Pic1);
		
		Store2Pic2 = new ImagePanel();
		Store2Pic2.setBounds(164, 103, 144, 152);
		Store2.add(Store2Pic2);
		
		Store2Pic3 = new ImagePanel();
		Store2Pic3.setBounds(318, 103, 144, 152);
		Store2.add(Store2Pic3);
		
		Store2Price1 = new JLabel("\u0E3F?");
		Store2Price1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store2Price1.setBounds(318, 258, 144, 22);
		Store2.add(Store2Price1);
		
		Store2Price2 = new JLabel("\u0E3F?");
		Store2Price2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store2Price2.setBounds(164, 258, 144, 22);
		Store2.add(Store2Price2);
		
		Store2Price3 = new JLabel("\u0E3F?");
		Store2Price3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store2Price3.setBounds(10, 258, 144, 22);
		Store2.add(Store2Price3);
		
		Store3 = new JPanel();
		Store3.setLayout(null);
		Store3.setBackground(Color.WHITE);
		Store3.setBounds(21, 316, 474, 287);
		StoreForYouPanel.add(Store3);
		
		brandStore3 = new JLabel("");
		brandStore3.setBackground(Color.WHITE);
		brandStore3.setBounds(10, 11, 79, 81);
		Store3.add(brandStore3);
		
		nameBrandStore3 = new JLabel("?");
		nameBrandStore3.setFont(new Font("Dubai", Font.PLAIN, 13));
		nameBrandStore3.setBounds(101, 11, 177, 22);
		Store3.add(nameBrandStore3);
		
		lblLazmallStore3 = new JLabel("");
		lblLazmallStore3.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/flagship.PNG")));
		lblLazmallStore3.setBounds(99, 44, 196, 22);
		Store3.add(lblLazmallStore3);
		
		Store3Pic1 = new ImagePanel();
		Store3Pic1.setBounds(10, 103, 144, 152);
		Store3.add(Store3Pic1);
		
		Store3Pic2 = new ImagePanel();
		Store3Pic2.setBounds(164, 103, 144, 152);
		Store3.add(Store3Pic2);
		
		Store3Pic3 = new ImagePanel();
		Store3Pic3.setBounds(318, 103, 144, 152);
		Store3.add(Store3Pic3);
		
		Store3Price1 = new JLabel("\u0E3F?");
		Store3Price1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store3Price1.setBounds(318, 258, 144, 22);
		Store3.add(Store3Price1);
		
		Store3Price2 = new JLabel("\u0E3F?");
		Store3Price2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store3Price2.setBounds(164, 258, 144, 22);
		Store3.add(Store3Price2);
		
		Store3Price3 = new JLabel("\u0E3F?");
		Store3Price3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store3Price3.setBounds(10, 258, 144, 22);
		Store3.add(Store3Price3);
		
		Store4 = new JPanel();
		Store4.setLayout(null);
		Store4.setBackground(Color.WHITE);
		Store4.setBounds(513, 316, 474, 287);
		StoreForYouPanel.add(Store4);
		
		brandStore4 = new JLabel("");
		brandStore4.setBackground(Color.WHITE);
		brandStore4.setBounds(10, 11, 79, 81);
		Store4.add(brandStore4);
		
		nameBrandStore4 = new JLabel("?");
		nameBrandStore4.setFont(new Font("Dubai", Font.PLAIN, 13));
		nameBrandStore4.setBounds(101, 11, 177, 22);
		Store4.add(nameBrandStore4);
		
		lblLazmallStore4 = new JLabel("");
		lblLazmallStore4.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/flagship.PNG")));
		lblLazmallStore4.setBounds(99, 44, 196, 22);
		Store4.add(lblLazmallStore4);
		
		Store4Pic1 = new ImagePanel();
		Store4Pic1.setBounds(10, 103, 144, 152);
		Store4.add(Store4Pic1);
		
		Store4Pic2 = new ImagePanel();
		Store4Pic2.setBounds(164, 103, 144, 152);
		Store4.add(Store4Pic2);
		
		Store4Pic3 = new ImagePanel();
		Store4Pic3.setBounds(318, 103, 144, 152);
		Store4.add(Store4Pic3);
		
		Store4Price1 = new JLabel("\u0E3F?");
		Store4Price1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store4Price1.setBounds(318, 258, 144, 22);
		Store4.add(Store4Price1);
		
		Store4Price2 = new JLabel("\u0E3F?");
		Store4Price2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store4Price2.setBounds(164, 258, 144, 22);
		Store4.add(Store4Price2);
		
		Store4Price3 = new JLabel("\u0E3F?");
		Store4Price3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Store4Price3.setBounds(10, 258, 144, 22);
		Store4.add(Store4Price3);
		
		JLabel Sports = new JLabel("");
		Sports.setVisible(false);
		Sports.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/SportNew.PNG")));
		Sports.setBounds(885, 478, 107, 106);
		Sub_ShowPanel.add(Sports);
		
		JLabel Home = new JLabel("");
		Home.setVisible(false);
		Home.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/home&LifestyleNEW.png")));
		Home.setBounds(762, 478, 122, 106);
		Sub_ShowPanel.add(Home);
		
		JLabel ElecDevice = new JLabel("");
		ElecDevice.setVisible(false);
		ElecDevice.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/electronicsDevicesNEW.png")));
		ElecDevice.setBounds(666, 478, 108, 106);
		Sub_ShowPanel.add(ElecDevice);
		
		JLabel Mother = new JLabel("");
		Mother.setVisible(false);
		Mother.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/mother&BabyNEW.png")));
		Mother.setBounds(558, 478, 108, 106);
		Sub_ShowPanel.add(Mother);
		
		JLabel Groces = new JLabel("");
		Groces.setVisible(false);
		Groces.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/groceriesNEW.png")));
		Groces.setBounds(450, 478, 108, 106);
		Sub_ShowPanel.add(Groces);
		
		JLabel Consumer = new JLabel("");
		Consumer.setVisible(false);
		Consumer.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/consumerAppNEW.png")));
		Consumer.setBounds(346, 478, 108, 106);
		Sub_ShowPanel.add(Consumer);
		
		JLabel Health = new JLabel("");
		Health.setVisible(false);
		Health.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/health&BeautyNEW.png")));
		Health.setBounds(237, 478, 108, 106);
		Sub_ShowPanel.add(Health);
		
		JLabel ElecAccess = new JLabel("");
		ElecAccess.setVisible(false);
		ElecAccess.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/electronicsAccessNEW.png")));
		ElecAccess.setBounds(129, 478, 108, 106);
		Sub_ShowPanel.add(ElecAccess);
		
		JLabel PickForU = new JLabel("");
		PickForU.setVisible(false);
		PickForU.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/PickForYouNEW.png")));
		PickForU.setBounds(21, 478, 108, 106);
		Sub_ShowPanel.add(PickForU);
		
		controlRowLabel.add(PickForU);
		controlRowLabel.add(ElecAccess);
		controlRowLabel.add(Health);
		controlRowLabel.add(Consumer);
		controlRowLabel.add(Groces);
		controlRowLabel.add(Mother);
		controlRowLabel.add(ElecDevice);
		controlRowLabel.add(Home);
		controlRowLabel.add(Sports);
		
		PackofPicBrands.add(brandStore1);
		PackofPicBrands.add(brandStore2);
		PackofPicBrands.add(brandStore3);
		PackofPicBrands.add(brandStore4);
		
		PackofNameBrands.add(nameBrandStore1);
		PackofNameBrands.add(nameBrandStore2);
		PackofNameBrands.add(nameBrandStore3);
		PackofNameBrands.add(nameBrandStore4);
		
		
		PackofStoresPics.add(Store1Pic1);  
		PackofStoresPics.add(Store1Pic2);  
		PackofStoresPics.add(Store1Pic3);  
		
		PackofStoresPics.add(Store2Pic1);  
		PackofStoresPics.add(Store2Pic2);  
		PackofStoresPics.add(Store2Pic3);  
		
		PackofStoresPics.add(Store3Pic1);  
		PackofStoresPics.add(Store3Pic2);  
		PackofStoresPics.add(Store3Pic3);  
		
		PackofStoresPics.add(Store4Pic1);  
		PackofStoresPics.add(Store4Pic2);  
		PackofStoresPics.add(Store4Pic3);  
			
		
		PackofStoresPrices.add(Store1Price1);
		PackofStoresPrices.add(Store1Price2);
		PackofStoresPrices.add(Store1Price3);
		
		PackofStoresPrices.add(Store2Price1);
		PackofStoresPrices.add(Store2Price2);
		PackofStoresPrices.add(Store2Price3);
		
		PackofStoresPrices.add(Store3Price1);
		PackofStoresPrices.add(Store3Price2);
		PackofStoresPrices.add(Store3Price3);
		
		PackofStoresPrices.add(Store4Price1);
		PackofStoresPrices.add(Store4Price2);
		PackofStoresPrices.add(Store4Price3);
		
		JLabel label_30 = new JLabel("Brand Events");
		label_30.setFont(new Font("Dubai", Font.PLAIN, 26));
		label_30.setBounds(21, 11, 188, 29);
		Sub_ShowPanel.add(label_30);
		
		JLabel BrandEvent1 = new JLabel("");
		BrandEvent1.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/brandEvent1new.png")));
		BrandEvent1.setBounds(21, 51, 308, 374);
		Sub_ShowPanel.add(BrandEvent1);
		
		JLabel BrandEvent2 = new JLabel("");
		BrandEvent2.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/brandEvent2new.png")));
		BrandEvent2.setBounds(350, 51, 308, 374);
		Sub_ShowPanel.add(BrandEvent2);
		
		JLabel BrandEvent3 = new JLabel("");
		BrandEvent3.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/brandEvent3new.png")));
		BrandEvent3.setBounds(679, 51, 308, 374);
		Sub_ShowPanel.add(BrandEvent3);
		
		JLabel label_34 = new JLabel("Stores For You");
		label_34.setFont(new Font("Dubai", Font.PLAIN, 26));
		label_34.setBounds(21, 451, 188, 29);
		Sub_ShowPanel.add(label_34);
		
		JPanel JustForYourPanel = new JPanel();
		JustForYourPanel.setBounds(0, 1243, 1015, 674);
		Sub_ShowPanel.add(JustForYourPanel);
		JustForYourPanel.setLayout(null);
		
		JLabel label_61 = new JLabel("Just For You");
		label_61.setFont(new Font("Dubai", Font.PLAIN, 26));
		label_61.setBounds(21, 22, 188, 29);
		JustForYourPanel.add(label_61);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(21, 67, 188, 282);
		JustForYourPanel.add(panel1);
		
		ImagePanel pic1 = new ImagePanel();
		pic1.setBackground(Color.LIGHT_GRAY);
		pic1.setBounds(0, 0, 188, 157);
		panel1.add(pic1);
		
		JLabel label_62 = new JLabel("\u0E19\u0E39\u0E42\u0E17\u0E23\u0E08\u0E35\u0E19\u0E48\u0E32 \u0E14\u0E35\u0E1E \u0E04\u0E25\u0E35\u0E19");
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_62.setBounds(10, 168, 168, 15);
		panel1.add(label_62);
		
		JLabel label_63 = new JLabel("149.00");
		label_63.setForeground(Color.RED);
		label_63.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_63.setBounds(33, 193, 60, 24);
		panel1.add(label_63);
		
		JLabel label_64 = new JLabel("\u0E3F");
		label_64.setForeground(Color.RED);
		label_64.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_64.setBounds(10, 203, 46, 14);
		panel1.add(label_64);
		
		JLabel label_65 = new JLabel("");
		label_65.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel1_sub.PNG")));
		label_65.setForeground(Color.GRAY);
		label_65.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_65.setBounds(6, 228, 89, 14);
		panel1.add(label_65);
		
		JLabel label_66 = new JLabel("");
		label_66.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview4_8.PNG")));
		label_66.setBounds(9, 253, 85, 18);
		panel1.add(label_66);
		
		JLabel label_67 = new JLabel("(105)");
		label_67.setForeground(Color.GRAY);
		label_67.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_67.setBounds(89, 253, 46, 14);
		panel1.add(label_67);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(219, 67, 188, 282);
		JustForYourPanel.add(panel2);
		
		ImagePanel pic2 = new ImagePanel();
		pic2.setBackground(Color.LIGHT_GRAY);
		pic2.setBounds(0, 0, 188, 157);
		panel2.add(pic2);
		
		JLabel lblBestsellerLoreal = new JLabel(" L'OREAL PARIS CLAY");
		lblBestsellerLoreal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBestsellerLoreal.setBounds(10, 168, 168, 14);
		panel2.add(lblBestsellerLoreal);
		
		JLabel label_69 = new JLabel("339.00");
		label_69.setForeground(Color.RED);
		label_69.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_69.setBounds(33, 193, 60, 24);
		panel2.add(label_69);
		
		JLabel label_70 = new JLabel("\u0E3F");
		label_70.setForeground(Color.RED);
		label_70.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_70.setBounds(10, 203, 46, 14);
		panel2.add(label_70);
		
		JLabel label_71 = new JLabel("");
		label_71.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel2_sub.PNG")));
		label_71.setForeground(Color.GRAY);
		label_71.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_71.setBounds(6, 228, 89, 14);
		panel2.add(label_71);
		
		JLabel label_72 = new JLabel("");
		label_72.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview4_8.PNG")));
		label_72.setBounds(9, 253, 78, 18);
		panel2.add(label_72);
		
		JLabel label_73 = new JLabel("(266)");
		label_73.setForeground(Color.GRAY);
		label_73.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_73.setBounds(89, 253, 46, 14);
		panel2.add(label_73);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(417, 67, 188, 282);
		JustForYourPanel.add(panel3);
		
		ImagePanel pic3 = new ImagePanel();
		pic3.setBackground(Color.LIGHT_GRAY);
		pic3.setBounds(0, 0, 188, 157);
		panel3.add(pic3);
		
		JLabel lblSpf = new JLabel("\u0E44\u0E1F\u0E19\u0E4C \u0E41\u0E1F\u0E23\u0E4C\u0E40\u0E19\u0E2A SPF20 PA++");
		lblSpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSpf.setBounds(10, 168, 168, 14);
		panel3.add(lblSpf);
		
		JLabel label_75 = new JLabel("399.00");
		label_75.setForeground(Color.RED);
		label_75.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_75.setBounds(33, 193, 60, 24);
		panel3.add(label_75);
		
		JLabel label_76 = new JLabel("\u0E3F");
		label_76.setForeground(Color.RED);
		label_76.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_76.setBounds(10, 203, 46, 14);
		panel3.add(label_76);
		
		JLabel label_77 = new JLabel("");
		label_77.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel3_sub.PNG")));
		label_77.setForeground(Color.GRAY);
		label_77.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_77.setBounds(6, 228, 89, 14);
		panel3.add(label_77);
		
		JLabel label_78 = new JLabel("");
		label_78.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview5.PNG")));
		label_78.setBounds(9, 253, 78, 18);
		panel3.add(label_78);
		
		JLabel label_79 = new JLabel("(3)");
		label_79.setForeground(Color.GRAY);
		label_79.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_79.setBounds(89, 253, 46, 14);
		panel3.add(label_79);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(615, 67, 188, 282);
		JustForYourPanel.add(panel4);
		
		ImagePanel pic4 = new ImagePanel();
		pic4.setBackground(Color.LIGHT_GRAY);
		pic4.setBounds(0, 0, 188, 157);
		panel4.add(pic4);
		
		JLabel lblNiveaHandCream = new JLabel("NIVEA HAND Cream");
		lblNiveaHandCream.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNiveaHandCream.setBounds(10, 168, 168, 14);
		panel4.add(lblNiveaHandCream);
		
		JLabel label_81 = new JLabel("59.00");
		label_81.setForeground(Color.RED);
		label_81.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_81.setBounds(33, 193, 60, 24);
		panel4.add(label_81);
		
		JLabel label_82 = new JLabel("\u0E3F");
		label_82.setForeground(Color.RED);
		label_82.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_82.setBounds(10, 203, 46, 14);
		panel4.add(label_82);
		
		JLabel label_84 = new JLabel("");
		label_84.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview5.PNG")));
		label_84.setBounds(9, 253, 78, 18);
		panel4.add(label_84);
		
		JLabel label_85 = new JLabel("(5)");
		label_85.setForeground(Color.GRAY);
		label_85.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_85.setBounds(89, 253, 46, 14);
		panel4.add(label_85);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(Color.WHITE);
		panel5.setBounds(813, 67, 188, 282);
		JustForYourPanel.add(panel5);
		
		ImagePanel pic5 = new ImagePanel();
		pic5.setBackground(Color.LIGHT_GRAY);
		pic5.setBounds(0, 0, 188, 157);
		panel5.add(pic5);
		
		JLabel lblWarrix = new JLabel("Warrix \u0E40\u0E2A\u0E37\u0E49\u0E2D\u0E40\u0E0A\u0E35\u0E22\u0E23\u0E4C\u0E1F\u0E38\u0E15\u0E1A\u0E2D\u0E25");
		lblWarrix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWarrix.setBounds(10, 168, 168, 14);
		panel5.add(lblWarrix);
		
		JLabel label_87 = new JLabel("390.00");
		label_87.setForeground(Color.RED);
		label_87.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_87.setBounds(33, 193, 60, 24);
		panel5.add(label_87);
		
		JLabel label_88 = new JLabel("\u0E3F");
		label_88.setForeground(Color.RED);
		label_88.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_88.setBounds(10, 203, 46, 14);
		panel5.add(label_88);
		
		JLabel label_90 = new JLabel("");
		label_90.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview4_8.PNG")));
		label_90.setBounds(9, 253, 78, 18);
		panel5.add(label_90);
		
		JLabel label_91 = new JLabel("(78)");
		label_91.setForeground(Color.GRAY);
		label_91.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_91.setBounds(89, 253, 46, 14);
		panel5.add(label_91);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBackground(Color.WHITE);
		panel6.setBounds(813, 364, 188, 282);
		JustForYourPanel.add(panel6);
		
		ImagePanel pic6 = new ImagePanel();
		pic6.setBackground(Color.LIGHT_GRAY);
		pic6.setBounds(0, 0, 188, 157);
		panel6.add(pic6);
		
		JLabel lblKnorrNatural_1 = new JLabel("Knorr Natural \u0E04\u0E19\u0E2D\u0E23\u0E4C\u0E04\u0E31\u0E1E\u0E42\u0E08\u0E35\u0E01");
		lblKnorrNatural_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKnorrNatural_1.setBounds(10, 168, 168, 14);
		panel6.add(lblKnorrNatural_1);
		
		JLabel label_93 = new JLabel("50.00");
		label_93.setForeground(Color.RED);
		label_93.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_93.setBounds(33, 193, 60, 24);
		panel6.add(label_93);
		
		JLabel label_94 = new JLabel("\u0E3F");
		label_94.setForeground(Color.RED);
		label_94.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_94.setBounds(10, 203, 46, 14);
		panel6.add(label_94);
		
		JLabel label_95 = new JLabel("");
		label_95.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel10_sub.PNG")));
		label_95.setForeground(Color.GRAY);
		label_95.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_95.setBounds(6, 228, 89, 14);
		panel6.add(label_95);
		
		JLabel label_96 = new JLabel("");
		label_96.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview5.PNG")));
		label_96.setBounds(9, 253, 78, 18);
		panel6.add(label_96);
		
		JLabel label_97 = new JLabel("(5)");
		label_97.setForeground(Color.GRAY);
		label_97.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_97.setBounds(89, 253, 46, 14);
		panel6.add(label_97);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBackground(Color.WHITE);
		panel7.setBounds(615, 364, 188, 282);
		JustForYourPanel.add(panel7);
		
		ImagePanel pic7 = new ImagePanel();
		pic7.setBackground(Color.LIGHT_GRAY);
		pic7.setBounds(0, 0, 188, 157);
		panel7.add(pic7);
		
		JLabel lblWhiskas = new JLabel("WHISKAS Cat Food Wet");
		lblWhiskas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhiskas.setBounds(10, 168, 168, 14);
		panel7.add(lblWhiskas);
		
		JLabel label_99 = new JLabel("155.00");
		label_99.setForeground(Color.RED);
		label_99.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_99.setBounds(33, 193, 60, 24);
		panel7.add(label_99);
		
		JLabel label_100 = new JLabel("\u0E3F");
		label_100.setForeground(Color.RED);
		label_100.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_100.setBounds(10, 203, 46, 14);
		panel7.add(label_100);
		
		JLabel label_101 = new JLabel("");
		label_101.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel_sub9.PNG")));
		label_101.setForeground(Color.GRAY);
		label_101.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_101.setBounds(6, 228, 89, 14);
		panel7.add(label_101);
		
		JLabel label_102 = new JLabel("");
		label_102.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview4_8.PNG")));
		label_102.setBounds(9, 253, 78, 18);
		panel7.add(label_102);
		
		JLabel label_103 = new JLabel("(380)");
		label_103.setForeground(Color.GRAY);
		label_103.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_103.setBounds(89, 253, 46, 14);
		panel7.add(label_103);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBackground(Color.WHITE);
		panel8.setBounds(417, 364, 188, 282);
		JustForYourPanel.add(panel8);
		
		ImagePanel pic8 = new ImagePanel();
		pic8.setBackground(Color.LIGHT_GRAY);
		pic8.setBounds(0, 0, 188, 157);
		panel8.add(pic8);
		
		JLabel lblCesar = new JLabel("Cesar \u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E2A\u0E38\u0E19\u0E31\u0E02\u0E0A\u0E19\u0E34\u0E14\u0E40\u0E1B\u0E35\u0E22\u0E01");
		lblCesar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCesar.setBounds(10, 168, 168, 14);
		panel8.add(lblCesar);
		
		JLabel label_105 = new JLabel("199.00");
		label_105.setForeground(Color.RED);
		label_105.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_105.setBounds(33, 193, 60, 24);
		panel8.add(label_105);
		
		JLabel label_106 = new JLabel("\u0E3F");
		label_106.setForeground(Color.RED);
		label_106.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_106.setBounds(10, 203, 46, 14);
		panel8.add(label_106);
		
		JLabel label_107 = new JLabel("");
		label_107.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel_sub8.PNG")));
		label_107.setForeground(Color.GRAY);
		label_107.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_107.setBounds(6, 228, 89, 14);
		panel8.add(label_107);
		
		JLabel label_108 = new JLabel("");
		label_108.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview3.PNG")));
		label_108.setBounds(9, 253, 78, 18);
		panel8.add(label_108);
		
		JLabel label_109 = new JLabel("(2)");
		label_109.setForeground(Color.GRAY);
		label_109.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_109.setBounds(89, 253, 46, 14);
		panel8.add(label_109);
		
		JPanel panel9 = new JPanel();
		panel9.setLayout(null);
		panel9.setBackground(Color.WHITE);
		panel9.setBounds(21, 364, 188, 282);
		JustForYourPanel.add(panel9);
		
		ImagePanel pic9 = new ImagePanel();
		pic9.setBackground(Color.LIGHT_GRAY);
		pic9.setBounds(0, 0, 188, 157);
		panel9.add(pic9);
		
		JLabel label_110 = new JLabel("\u0E44\u0E25\u0E1F\u0E4C\u0E23\u0E35 \u0E41\u0E1C\u0E48\u0E19\u0E40\u0E2A\u0E23\u0E34\u0E21\u0E0B\u0E36\u0E21\u0E0B\u0E31\u0E1A");
		label_110.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_110.setBounds(10, 168, 168, 14);
		panel9.add(label_110);
		
		JLabel label_111 = new JLabel("299.00");
		label_111.setForeground(Color.RED);
		label_111.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_111.setBounds(33, 193, 60, 24);
		panel9.add(label_111);
		
		JLabel label_112 = new JLabel("\u0E3F");
		label_112.setForeground(Color.RED);
		label_112.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_112.setBounds(10, 203, 46, 14);
		panel9.add(label_112);
		
		JLabel label_113 = new JLabel("");
		label_113.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel_sub6.PNG")));
		label_113.setForeground(Color.GRAY);
		label_113.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_113.setBounds(6, 228, 89, 14);
		panel9.add(label_113);
		
		JLabel label_114 = new JLabel("");
		label_114.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview4_8.PNG")));
		label_114.setBounds(9, 253, 78, 18);
		panel9.add(label_114);
		
		JLabel label_115 = new JLabel("(72)");
		label_115.setForeground(Color.GRAY);
		label_115.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_115.setBounds(89, 253, 46, 14);
		panel9.add(label_115);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBackground(Color.WHITE);
		panel10.setBounds(219, 364, 188, 282);
		JustForYourPanel.add(panel10);
		
		ImagePanel pic10 = new ImagePanel();
		pic10.setBackground(Color.LIGHT_GRAY);
		pic10.setBounds(0, 0, 188, 157);
		panel10.add(pic10);
		
		try {
			pic1.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel1.PNG")));
			pic2.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel2.PNG")));
			pic3.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel3.PNG")));
			pic4.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel4.PNG")));
			pic5.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel5.PNG")));
			pic6.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel6.PNG")));
			pic7.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel7.PNG")));
			pic8.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel8.PNG")));
			pic9.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel9.PNG")));
			pic10.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/JustForYou/panel10.PNG")));
			
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		JLabel lblKnorrNatural = new JLabel("ACER Gaming LED 23.8\"");
		lblKnorrNatural.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKnorrNatural.setBounds(10, 168, 168, 14);
		panel10.add(lblKnorrNatural);
		
		JLabel label_117 = new JLabel("4,590.00");
		label_117.setForeground(Color.RED);
		label_117.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_117.setBounds(33, 193, 70, 24);
		panel10.add(label_117);
		
		JLabel label_118 = new JLabel("\u0E3F");
		label_118.setForeground(Color.RED);
		label_118.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_118.setBounds(10, 203, 46, 14);
		panel10.add(label_118);
		
		JLabel label_119 = new JLabel("");
		label_119.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/JustForYou/panel_sub7.PNG")));
		label_119.setForeground(Color.GRAY);
		label_119.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_119.setBounds(6, 228, 89, 14);
		panel10.add(label_119);
		
		JLabel label_120 = new JLabel("");
		label_120.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/starReviewGrades/starReview4_5.PNG")));
		label_120.setBounds(9, 253, 78, 18);
		panel10.add(label_120);
		
		JLabel label_121 = new JLabel("(43)");
		label_121.setForeground(Color.GRAY);
		label_121.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_121.setBounds(89, 253, 46, 14);
		panel10.add(label_121);
		
		JPanel RowPanel = new JPanel();
		RowPanel.setBounds(21, 515, 973, 100);
		Sub_ShowPanel.add(RowPanel);
		RowPanel.setLayout(null);
		
		JLabel PickForUR = new JLabel("");
		PickForUR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,1);
				
				brandStore1.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Brands/grandsportSport.PNG")));
				brandStore2.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Brands/tvdirectHome.PNG")));
				brandStore3.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Brands/xiaomiConsumer_ElecAccess.PNG")));
				brandStore4.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Brands/hongthongGroce.PNG")));
			
				nameBrandStore1.setText("GRAND SPORT");
				nameBrandStore2.setText("TV Direct");
				nameBrandStore3.setText("Xiaomi");
				nameBrandStore4.setText("Hongthong Rice");
				
				try {
					Store1Pic1.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Sport/grandsportSport+355.PNG")));
					Store1Pic2.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Sport/grandsportSport+395.PNG")));
					Store1Pic3.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Sport/grandsportSport+590.PNG")));
				
					Store2Pic1.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Home/tvdirectHome+3990.PNG")));
					Store2Pic2.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Home/tvdirectHome+490.PNG")));
					Store2Pic3.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Home/tvdirectHome+99.PNG")));
					
					Store3Pic1.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Consumer/xiaomiConsumer+12990.PNG")));
					Store3Pic2.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Consumer/xiaomiConsumer+5990.PNG")));
					Store3Pic3.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Consumer/xiaomiConsumer+9390.PNG")));
					
					Store4Pic1.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Groceries/hongthongGroce+1160.PNG")));
					Store4Pic2.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Groceries/hongthongGroce+300.PNG")));
					Store4Pic3.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/Groceries/hongthongGroce+580.PNG")));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Store1Price1.setText("ß 355");
				Store1Price2.setText("ß 395");
				Store1Price3.setText("ß 590");
				
				Store2Price1.setText("ß 3990");
				Store2Price2.setText("ß 490");
				Store2Price3.setText("ß 99");
				
				Store3Price1.setText("ß 12990");
				Store3Price2.setText("ß 5990");
				Store3Price3.setText("ß 9390");
				
				Store4Price1.setText("ß 1160");
				Store4Price2.setText("ß 300");
				Store4Price3.setText("ß 580");
	
			}
		});
		PickForUR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Bar_Picks.png")));
		PickForUR.setBounds(0, 0, 108, 100);
		RowPanel.add(PickForUR);
		
		JLabel ElecAccessR = new JLabel("");
		ElecAccessR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,2);
				
				PicbrandLabels.clear();
				PicbrandLabels.add("microsoftElecAccess.PNG");
				PicbrandLabels.add("tescoHealth_Consumer_ElecAccess.PNG");
				PicbrandLabels.add("thaiBestGroce_ElecAccess_Mother.PNG");
				PicbrandLabels.add("xiaomiConsumer_ElecAccess.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("Microsoft");
				NamebrandLabels.add("Tesco Lotus");
				NamebrandLabels.add("ThailandBest");
				NamebrandLabels.add("Xiaomi");
				
				StorePics.clear();
				StorePics.add("microsoftElecAccess+3900.PNG");
				StorePics.add("microsoftElecAccess+5199.PNG");
				StorePics.add("microsoftElecAccess+5790.PNG");
				
				StorePics.add("tescoElecAccess+13990.PNG");
				StorePics.add("tescoElecAccess+2790.PNG");
				StorePics.add("tescoElecAccess+6590.PNG");
				
				StorePics.add("thaiBestElecAccess+1699.PNG");
				StorePics.add("thaiBestElecAccess+399.PNG");
				StorePics.add("thaiBestElecAccess+699.PNG");
				
				StorePics.add("xiaomiElecAccess+1350.PNG");
				StorePics.add("xiaomiElecAccess+990.PNG");
				StorePics.add("xiaomiElecAccess+999.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "ElecAccess");
			}
		});
		ElecAccessR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Bar_ElecAc.png")));
		ElecAccessR.setBounds(108, 0, 108, 100);
		RowPanel.add(ElecAccessR);
		
		JLabel HealthR = new JLabel("");
		HealthR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,3);
				
				PicbrandLabels.clear();
				PicbrandLabels.add("bscHealth.PNG");
				PicbrandLabels.add("lionGroce_Health_Mother.PNG");
				PicbrandLabels.add("tescoHealth_Consumer_ElecAccess.PNG");
				PicbrandLabels.add("watsonHealth_Mother_Sport.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("BSC");
				NamebrandLabels.add("Lion");
				NamebrandLabels.add("Tesco Lotus");
				NamebrandLabels.add("Watson");
				
				StorePics.clear();
				StorePics.add("bscHealth+159.PNG");
				StorePics.add("bscHealth+369.PNG");
				StorePics.add("bscHealth+550.PNG");
				
				StorePics.add("lionHealth+120.PNG");
				StorePics.add("lionHealth+189.PNG");
				StorePics.add("lionHealth+266.PNG");
				
				StorePics.add("tescoHealth+43.PNG");
				StorePics.add("tescoHealth+59.PNG");
				StorePics.add("tescoHealth+78.PNG");
				
				StorePics.add("watsonHealth+179.PNG");
				StorePics.add("watsonHealth+59.PNG");
				StorePics.add("watsonHealth+99.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "Health");
			}
		});
		HealthR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Barnew_Health.png")));
		HealthR.setBounds(216, 0, 108, 100);
		RowPanel.add(HealthR);
		
		JLabel ConsumerR = new JLabel("");
		ConsumerR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,4);

				PicbrandLabels.clear();
				PicbrandLabels.add("aconaticConsumer.PNG");
				PicbrandLabels.add("shopSmartGroce_Consumer_Sport.PNG");
				PicbrandLabels.add("tescoHealth_Consumer_ElecAccess.PNG");
				PicbrandLabels.add("xiaomiConsumer_ElecAccess.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("Aconatic");
				NamebrandLabels.add("His & Her Shopsmart");
				NamebrandLabels.add("Tesco Lotus");
				NamebrandLabels.add("Xiaomi");
				
				StorePics.clear();
				StorePics.add("aconaticConsumer+299.PNG");
				StorePics.add("aconaticConsumer+5990.PNG");
				StorePics.add("aconaticConsumer+9900.PNG");
				
				StorePics.add("shopSmartConsumer+1039.PNG");
				StorePics.add("shopSmartConsumer+690.PNG");
				StorePics.add("shopSmartConsumer+979.PNG");
				
				StorePics.add("tescoConsumer+15990.PNG");
				StorePics.add("tescoConsumer+3590.PNG");
				StorePics.add("tescoConsumer+630.PNG");
				
				StorePics.add("xiaomiConsumer+12990.PNG");
				StorePics.add("xiaomiConsumer+5990.PNG");
				StorePics.add("xiaomiConsumer+9390.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "Consumer");
			}
		});
		ConsumerR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Barnew_Consume.png")));
		ConsumerR.setBounds(325, 0, 103, 100);
		RowPanel.add(ConsumerR);
		
		JLabel GroceR = new JLabel("");
		GroceR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,5);

				PicbrandLabels.clear();
				PicbrandLabels.add("hongthongGroce.PNG");
				PicbrandLabels.add("lionGroce_Health_Mother.PNG");
				PicbrandLabels.add("shopSmartGroce_Consumer_Sport.PNG");
				PicbrandLabels.add("thaiBestGroce_ElecAccess_Mother.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("Hongthong Rice");
				NamebrandLabels.add("Lion");
				NamebrandLabels.add("His & Her Shopsmart");
				NamebrandLabels.add("ThaiBest");
				
				StorePics.clear();
				StorePics.add("hongthongGroce+1160.PNG");
				StorePics.add("hongthongGroce+300.PNG");
				StorePics.add("hongthongGroce+580.PNG");
				
				StorePics.add("lionGroce+185.PNG");
				StorePics.add("lionGroce+232.PNG");
				StorePics.add("lionGroce+87.PNG");
				
				StorePics.add("shopSmartGroce+349.PNG");
				StorePics.add("shopSmartGroce+389.PNG");
				StorePics.add("shopSmartGroce+479.PNG");
				
				StorePics.add("thaiBestGroce+125.PNG");
				StorePics.add("thaiBestGroce+320.PNG");
				StorePics.add("thaiBestGroce+62.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "Groceries");
			}
		});
		GroceR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Barnew_Groces.png")));
		GroceR.setBounds(429, 0, 108, 100);
		RowPanel.add(GroceR);
		
		JLabel MotherR = new JLabel("");
		MotherR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,6);

				PicbrandLabels.clear();
				PicbrandLabels.add("jjohnsonMother.PNG");
				PicbrandLabels.add("lionGroce_Health_Mother.PNG");
				PicbrandLabels.add("thaiBestGroce_ElecAccess_Mother.PNG");
				PicbrandLabels.add("watsonHealth_Mother_Sport.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("Johnson & Johnson");
				NamebrandLabels.add("Lion");
				NamebrandLabels.add("ThaiBest");
				NamebrandLabels.add("Watson");
				
				StorePics.clear();
				StorePics.add("jjohnsonMother+129.PNG");
				StorePics.add("jjohnsonMother+199.PNG");
				StorePics.add("jjohnsonMother+95.PNG");
				
				StorePics.add("lionMother+115.PNG");
				StorePics.add("lionMother+150.PNG");
				StorePics.add("lionMother+158.PNG");
				
				StorePics.add("thaiBestMother+157.PNG");
				StorePics.add("thaiBestMother+180.PNG");
				StorePics.add("thaiBestMother+85.PNG");
				
				StorePics.add("watsonMother+149.PNG");
				StorePics.add("watsonMother+179.PNG");
				StorePics.add("watsonMother+199.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "Mother");
			}
		});
		MotherR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Barnew_Mother.png")));
		MotherR.setBounds(537, 0, 108, 100);
		RowPanel.add(MotherR);
		
		JLabel ElecDeviceR = new JLabel("");
		ElecDeviceR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,7);

				PicbrandLabels.clear();
				PicbrandLabels.add("acerElecDev.PNG");
				PicbrandLabels.add("asusElecDev.PNG");
				PicbrandLabels.add("lenovoElecDev.PNG");
				PicbrandLabels.add("nikonElecDev.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("Acer");
				NamebrandLabels.add("Asus");
				NamebrandLabels.add("Lenovo");
				NamebrandLabels.add("Nikon");
				
				StorePics.clear();
				StorePics.add("acerElecDev+19990.PNG");
				StorePics.add("acerElecDev+22030.PNG");
				StorePics.add("acerElecDev+7290.PNG");
				
				StorePics.add("asusElecDev+10990.PNG");
				StorePics.add("asusElecDev+14990.PNG");
				StorePics.add("asusElecDev+27590.PNG");
				
				StorePics.add("lenovoElecDev+46590.PNG");
				StorePics.add("lenovoElecDev+910.PNG");
				StorePics.add("lenovoElecDev+9290.PNG");
				
				StorePics.add("nikonElecDev+2699.PNG");
				StorePics.add("nikonElecDev+6890.PNG");
				StorePics.add("nikonElecDev+8590.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "ElecDevice");
			}
		});
		ElecDeviceR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Barnew_ElecDev.png")));
		ElecDeviceR.setBounds(645, 0, 97, 100);
		RowPanel.add(ElecDeviceR);
		
		JLabel HomeR = new JLabel("");
		HomeR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,8);

				PicbrandLabels.clear();
				PicbrandLabels.add("narayaHome.PNG");
				PicbrandLabels.add("philipsHome.PNG");
				PicbrandLabels.add("sbdeckerHome.PNG");
				PicbrandLabels.add("tvdirectHome.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("Naraya");
				NamebrandLabels.add("Philips");
				NamebrandLabels.add("Stanley Black & Decker");
				NamebrandLabels.add("TV Direct");
				
				StorePics.clear();
				StorePics.add("nadayaHome+117.PNG");
				StorePics.add("nadayaHome+266.PNG");
				StorePics.add("nadayaHome+99.PNG");
				
				StorePics.add("philipsHome+1199.PNG");
				StorePics.add("philipsHome+390.PNG");
				StorePics.add("philipsHome+396.PNG");
				
				StorePics.add("sbdeckerHome+1990.PNG");
				StorePics.add("sbdeckerHome+4590.PNG");
				StorePics.add("sbdeckerHome+790.PNG");
				
				StorePics.add("tvdirectHome+3990.PNG");
				StorePics.add("tvdirectHome+490.PNG");
				StorePics.add("tvdirectHome+99.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "Home");
			}
		});
		HomeR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_Barnew_Home.png")));
		HomeR.setBounds(741, 0, 122, 100);
		RowPanel.add(HomeR);
		
		JLabel SportR = new JLabel("");
		SportR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ControlRowLabel(controlRowLabel,9);

				PicbrandLabels.clear();
				PicbrandLabels.add("grandsportSport.PNG");
				PicbrandLabels.add("shopSmartGroce_Consumer_Sport.PNG");
				PicbrandLabels.add("warrixSport.PNG");
				PicbrandLabels.add("watsonHealth_Mother_Sport.PNG");
				
				NamebrandLabels.clear();
				NamebrandLabels.add("GRAND SPORT");
				NamebrandLabels.add("His & Her Shopsmart");
				NamebrandLabels.add("Warrix");
				NamebrandLabels.add("Watson");
				
				StorePics.clear();
				StorePics.add("grandsportSport+355.PNG");
				StorePics.add("grandsportSport+395.PNG");
				StorePics.add("grandsportSport+590.PNG");
				
				StorePics.add("shopSmartSport+1280.PNG");
				StorePics.add("shopSmartSport+1290.PNG");
				StorePics.add("shopSmartSport+3999.PNG");
				
				StorePics.add("warrixSport+139.PNG");
				StorePics.add("warrixSport+149.PNG");
				StorePics.add("warrixSport+259.PNG");
				
				StorePics.add("watsonSport+110.PNG");
				StorePics.add("watsonSport+135.PNG");
				StorePics.add("watsonSport+180.PNG");
				
				StoresShowing(PicbrandLabels, NamebrandLabels, StorePics, "Sport");
			}
		});
		SportR.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/ScrollBarPics/ScrollH_BarNew_Sport.PNG")));
		SportR.setBounds(864, 0, 107, 99);
		RowPanel.add(SportR);
		
		
		
		JLabel bannerChange1 = new JLabel("");
		bannerChange1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner1n.png")));
			}
		});
		bannerChange1.setBounds(473, 267, 15, 25);
		ShowPanel.add(bannerChange1);
		bannerChange1.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChange6 = new JLabel("");
		bannerChange6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner6n.png")));
			}
		});
		bannerChange6.setBounds(598, 267, 15, 25);
		ShowPanel.add(bannerChange6);
		bannerChange6.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChange4 = new JLabel("");
		bannerChange4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner4n.png")));
			}
		});
		bannerChange4.setBounds(548, 267, 15, 25);
		ShowPanel.add(bannerChange4);
		bannerChange4.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChange3 = new JLabel("");
		bannerChange3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner3n.png")));
			}
		});
		bannerChange3.setBounds(523, 267, 15, 25);
		ShowPanel.add(bannerChange3);
		bannerChange3.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChange2 = new JLabel("");
		bannerChange2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner2n.png")));
			}
		});
		bannerChange2.setBounds(498, 267, 15, 25);
		ShowPanel.add(bannerChange2);
		bannerChange2.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/circle4.png")));
		
		JLabel bannerChange5 = new JLabel("");
		bannerChange5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner5n.png")));
			}
		});
		bannerChange5.setBounds(573, 267, 15, 25);
		ShowPanel.add(bannerChange5);
		bannerChange5.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/circle4.png")));
		
		banner = new JLabel("");
		banner.setBounds(0, -13, 1020, 304);
		ShowPanel.add(banner);
		banner.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/BigMall_banner1n.png")));
		
		JLabel BigMALLbanner = new JLabel("");
		BigMALLbanner.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/MallAuthenticR.png")));
		BigMALLbanner.setBounds(0, 290, 1015, 54);
		ShowPanel.add(BigMALLbanner);
		
		JPanel MenuBar = new JPanel();
		MenuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
			}
		});
		MenuBar.setBounds(0, 42, 1023, 162);
		MenuBar.setBackground(new Color(8, 54, 69));
		contentPane.add(MenuBar);
		MenuBar.setLayout(null);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home_LoggedIn open = new Home_LoggedIn(username,user_id);
				open.setVisible(true);
				dispose();
			}
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setBounds(10, 11, 108, 96);
		label.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/\u0E42\u0E25\u0E42\u0E01\u0E49\u0E2A\u0E35\u0E02\u0E32\u0E273.png")));
		MenuBar.add(label);
		
		textField = new JTextField();
		textField.setBounds(281, 40, 458, 55);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelShow.setVisible(false);
			}
		});
		MenuBar.add(textField);
		
		JLabel label_1 = new JLabel("SALE");
		label_1.setBounds(158, 40, 70, 40);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe WP Black", Font.BOLD, 24));
		MenuBar.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(736, 40, 53, 55);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 102, 51));
		MenuBar.add(panel_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/\u0E04\u0E49\u0E19\u0E2B\u0E32 \u0E2A\u0E35\u0E02\u0E32\u0E272.png")));
		label_2.setBounds(13, 3, 33, 51);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(836, 46, 44, 40);
		label_3.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/\u0E15\u0E23\u0E30\u0E01\u0E25\u0E49\u0E32\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E322.png")));
		MenuBar.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(108, 78, 115, 10);
		panel_2.setBackground(new Color(255, 102, 51));
		MenuBar.add(panel_2);
		
		JLabel label_4 = new JLabel("BIG");
		label_4.setBounds(107, 40, 53, 40);
		label_4.setForeground(new Color(255, 102, 51));
		label_4.setFont(new Font("Segoe WP Black", Font.BOLD, 24));
		label_4.setBackground(Color.WHITE);
		MenuBar.add(label_4);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/gblICON.PNG")));
		label_10.setBounds(425, 124, 30, 37);
		MenuBar.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/vchICON.PNG")));
		label_11.setBounds(615, 125, 30, 37);
		MenuBar.add(label_11);
		
		menuPuller = new JLabel("");
		menuPuller.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/menuPuller.png")));
		menuPuller.setBounds(174, 135, 19, 14);
		MenuBar.add(menuPuller);
		
		lblCatergories = new JLabel("Catergories");
		lblCatergories.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menuPuller.setVisible(false);
				CatergoriesPanel.setVisible(true);
				Sub_CategoriesPanel.setVisible(true);
				lblCatergories.setForeground(Color.BLACK);
			}
		});
		lblCatergories.setFont(new Font("Dubai", Font.BOLD, 16));
		lblCatergories.setForeground(Color.WHITE);
		lblCatergories.setBounds(76, 128, 84, 26);
		MenuBar.add(lblCatergories);
		
		JLabel lblBigMall = new JLabel("BigMall");
		lblBigMall.setForeground(Color.LIGHT_GRAY);
		lblBigMall.setFont(new Font("Dubai", Font.BOLD, 16));
		lblBigMall.setBounds(331, 128, 84, 26);
		MenuBar.add(lblBigMall);
		
		JLabel lblGlobalCollection = new JLabel("Global Collection");
		lblGlobalCollection.setForeground(Color.LIGHT_GRAY);
		lblGlobalCollection.setFont(new Font("Dubai", Font.BOLD, 16));
		lblGlobalCollection.setBounds(458, 128, 122, 26);
		MenuBar.add(lblGlobalCollection);
		
		JLabel lblVouchers = new JLabel("Vouchers");
		lblVouchers.setForeground(Color.LIGHT_GRAY);
		lblVouchers.setFont(new Font("Dubai", Font.BOLD, 16));
		lblVouchers.setBounds(650, 128, 122, 26);
		MenuBar.add(lblVouchers);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/bgmICON.PNG")));
		label_9.setBounds(291, 124, 30, 37);
		MenuBar.add(label_9);
		
		CatergoriesPanel = new JPanel();
		CatergoriesPanel.setBackground(Color.WHITE);
		CatergoriesPanel.setVisible(false);
		CatergoriesPanel.setBounds(55, 114, 198, 52);
		MenuBar.add(CatergoriesPanel);
		CatergoriesPanel.setLayout(null);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Image/menuPullerBLACK.png")));
		label_13.setBounds(119, 20, 19, 14);
		CatergoriesPanel.add(label_13);
		changeBanner();
		//end MenuLogin 2
	}
	public void changeBanner() {
		Timer timer = new Timer(5000, new ActionListener() {
			int count = 1;
			public void actionPerformed(ActionEvent e) {
				if(count == 1) {
					banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner1n.png")));
				}
				else if(count == 2) {
					banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner2n.png")));
				}
				else if(count == 3) {
					banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner3n.png")));
				}
				else if(count == 4) {
					banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner4n.png")));
				}
				else if(count == 5) {
					banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner5n.png")));
				}
				else if(count == 6) {
					banner.setIcon(new ImageIcon(Home.class.getResource("/Image/BigMall_banner6n.png")));
				}
				++count;
			}
		});
		timer.setInitialDelay(0);
	    timer.start();
	}
	public void ShowSubMenuPanel(List<JPanel> AllPanels,String[] TotalShows) {
		Kinds_Categories.setVisible(true);
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
	public void ControlRowLabel(List<JLabel> AllLabels,int idx_LabeltoShow) {
		for(int i=0;i<AllLabels.size();i++) {
			JLabel temp = (JLabel)AllLabels.get(i);
			if((i+1) == idx_LabeltoShow) {
				temp.setVisible(true);
				temp.setLocation(new Point(temp.getX(), 511));
			}
			else {
				temp.setVisible(false);
				temp.setLocation(new Point(temp.getX(), 478));
			}
		}
	}
	public void StoresShowing(List<String> PicbrandsLabel, List<String> NamebrandsLabel, 
			                  List<String> StorePics, String StoreName) {
		
		for(int i=0;i<4;i++) {
			JLabel temp = (JLabel)PackofPicBrands.get(i);
			temp.setIcon(new ImageIcon(BigMallLoggedIn.class.getResource("/Brands/"+PicbrandsLabel.get(i))));
		}
	
		for(int i=0;i<4;i++) {
			JLabel temp = (JLabel)PackofNameBrands.get(i);
			temp.setText(NamebrandsLabel.get(i));
		}
		
		try {
			int i = 0;
			for (Iterator<JPanel> iterator = PackofStoresPics.iterator(); iterator.hasNext();) {
				ImagePanel col = (ImagePanel)iterator.next();
				col.setImage((BufferedImage)ImageIO.read(BigMallLoggedIn.class.getResource("/"+StoreName+"/"+StorePics.get(i++))));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		int i = 0;
		for (Iterator<JLabel> iterator = PackofStoresPrices.iterator(); iterator.hasNext();) {
			JLabel col = (JLabel)iterator.next();			
			String wrd = StorePics.get(i++);
			col.setText("ß "+wrd.subSequence(wrd.indexOf("+")+1, wrd.indexOf(".")));
		}
	}
}
