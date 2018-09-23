package Frame;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.Box;
import javax.swing.DefaultCellEditor;
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
import java.util.Enumeration;
import java.util.LinkedList;
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

@SuppressWarnings("serial")
public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table_1;
	LinkedList<NewProductDB> listImage = new LinkedList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
				            UIManager.getSystemLookAndFeelClassName());
					Home frame = new Home();
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int res = JOptionPane.showConfirmDialog(Home.this, "Are you sure to closing window?", "Confirm closing", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(res == JOptionPane.YES_OPTION) {
					dispose();
				}
				else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		setTitle("BIG SALE - Home");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\ICON.png");
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 688, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MenuBar = new JPanel();
		MenuBar.setBounds(0, 0, 672, 51);
		MenuBar.setBackground(new Color(8, 54, 69));
		contentPane.add(MenuBar);
		MenuBar.setLayout(null);
		
		JLabel taggingProduct_Bar = new JLabel("\u0E15\u0E34\u0E14\u0E15\u0E32\u0E21\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E32");
		taggingProduct_Bar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		taggingProduct_Bar.setBorder(UIManager.getBorder("MenuBar.border"));
		taggingProduct_Bar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		taggingProduct_Bar.setForeground(Color.WHITE);
		taggingProduct_Bar.setBounds(300, 11, 76, 23);
		MenuBar.add(taggingProduct_Bar);
		
		JLabel login_Bar = new JLabel("\u0E25\u0E07\u0E0A\u0E37\u0E48\u0E2D\u0E40\u0E02\u0E49\u0E32\u0E43\u0E0A\u0E49");
		login_Bar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		login_Bar.setForeground(Color.WHITE);
		login_Bar.setFont(new Font("Tahoma", Font.BOLD, 14));
		login_Bar.setBorder(UIManager.getBorder("MenuBar.border"));
		login_Bar.setBounds(404, 11, 76, 23);
		MenuBar.add(login_Bar);
		
		JLabel regsiter_Bar = new JLabel("\u0E2A\u0E21\u0E31\u0E04\u0E23\u0E2A\u0E21\u0E32\u0E0A\u0E34\u0E01");
		regsiter_Bar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		regsiter_Bar.setForeground(Color.WHITE);
		regsiter_Bar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		regsiter_Bar.setBorder(UIManager.getBorder("MenuBar.border"));
		regsiter_Bar.setBounds(507, 11, 73, 23);
		MenuBar.add(regsiter_Bar);
		
		JLabel about_Bar = new JLabel("");
		about_Bar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				about ab = new about();
				ab.setVisible(true);
			}
		});
		about_Bar.setBounds(640, 11, 22, 27);
		MenuBar.add(about_Bar);
		about_Bar.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\markz.png"));
		
		JPanel DiscoverBar = new JPanel();
		DiscoverBar.setBounds(0, 49, 672, 660);
		DiscoverBar.setBackground(new Color(0, 51, 102));
		contentPane.add(DiscoverBar);
		DiscoverBar.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\\u0E42\u0E25\u0E42\u0E01\u0E49\u0E2A\u0E35\u0E02\u0E32\u0E272.png"));
		label.setBounds(35, 17, 61, 50);
		DiscoverBar.add(label);
		
		JLabel lblBigSale = new JLabel("BIG SALE");
		lblBigSale.setFont(new Font("Trajan Pro", Font.BOLD, 20));
		lblBigSale.setForeground(Color.WHITE);
		lblBigSale.setBounds(95, 31, 102, 33);
		DiscoverBar.add(lblBigSale);
		
		textField = new JTextField();
		textField.setBounds(234, 31, 297, 33);
		DiscoverBar.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\\u0E15\u0E23\u0E30\u0E01\u0E25\u0E49\u0E32\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E322.png"));
		label_1.setBounds(630, 31, 32, 33);
		DiscoverBar.add(label_1);
		
		JPanel SearchButton = new JPanel();
		SearchButton.setBackground(new Color(255, 102, 0));
		SearchButton.setBounds(527, 31, 40, 33);
		DiscoverBar.add(SearchButton);
		SearchButton.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(10, 0, 32, 32);
		SearchButton.add(label_2);
		label_2.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\\u0E04\u0E49\u0E19\u0E2B\u0E32 \u0E2A\u0E35\u0E02\u0E32\u0E272.png"));
		
		JLabel Kinds = new JLabel("\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48 :");
		Kinds.setForeground(Color.WHITE);
		Kinds.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Kinds.setBounds(105, 85, 64, 17);
		DiscoverBar.add(Kinds);
		
		JLabel phone = new JLabel("\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C\u0E21\u0E37\u0E2D\u0E16\u0E37\u0E2D");
		phone.setForeground(Color.WHITE);
		phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phone.setBounds(185, 85, 102, 17);
		DiscoverBar.add(phone);
		
		JLabel maleBoot = new JLabel("\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E32\u0E1C\u0E49\u0E32\u0E43\u0E1A\u0E0A\u0E32\u0E22");
		maleBoot.setForeground(Color.WHITE);
		maleBoot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		maleBoot.setBounds(297, 85, 102, 17);
		DiscoverBar.add(maleBoot);
		
		JLabel harddisk = new JLabel("\u0E2E\u0E32\u0E23\u0E4C\u0E14\u0E14\u0E34\u0E2A\u0E01\u0E4C");
		harddisk.setForeground(Color.WHITE);
		harddisk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		harddisk.setBounds(424, 85, 70, 17);
		DiscoverBar.add(harddisk);
		
		JPanel ProductShowingPanel = new JPanel();
		ProductShowingPanel.setBounds(0, 113, 672, 514);
		DiscoverBar.add(ProductShowingPanel);
		ProductShowingPanel.setBackground(new Color(211, 211, 211));
		ProductShowingPanel.setLayout(null);
		
		JPanel KindsREDPanel = new JPanel();
		KindsREDPanel.setBackground(UIManager.getColor("Separator.background"));
		KindsREDPanel.setBounds(0, 50, 672, 150);
		ProductShowingPanel.add(KindsREDPanel);
		KindsREDPanel.setLayout(null);
		
		JPanel malebootPanel = new JPanel();
		malebootPanel.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		malebootPanel.setBackground(UIManager.getColor("Separator.background"));
		malebootPanel.setBounds(188, 11, 141, 120);
		KindsREDPanel.add(malebootPanel);
		malebootPanel.setLayout(null);
		
		JLabel maleBootPic = new JLabel("");
		maleBootPic.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E323.png"));
		maleBootPic.setBounds(23, 11, 108, 78);
		malebootPanel.add(maleBootPic);
		
		JLabel lbl_maleBoot = new JLabel("\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E32\u0E1C\u0E49\u0E32\u0E43\u0E1A\u0E0A\u0E32\u0E22");
		lbl_maleBoot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_maleBoot.setBounds(23, 95, 100, 14);
		malebootPanel.add(lbl_maleBoot);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(null);
		phonePanel.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		phonePanel.setBackground(UIManager.getColor("Separator.background"));
		phonePanel.setBounds(23, 11, 141, 120);
		KindsREDPanel.add(phonePanel);
		
		JLabel phonePic = new JLabel("");
		phonePic.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\\u0E42\u0E17\u0E23\u0E17\u0E31\u0E1E\u0E17\u0E4C3.png"));
		phonePic.setBounds(39, 11, 70, 74);
		phonePanel.add(phonePic);
		
		JLabel lbl_phone = new JLabel("\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C\u0E21\u0E37\u0E2D\u0E16\u0E37\u0E2D");
		lbl_phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_phone.setBounds(31, 95, 100, 14);
		phonePanel.add(lbl_phone);
		
		JPanel harddiskPanel = new JPanel();
		harddiskPanel.setLayout(null);
		harddiskPanel.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		harddiskPanel.setBackground(Color.WHITE);
		harddiskPanel.setBounds(355, 11, 141, 120);
		KindsREDPanel.add(harddiskPanel);
		
		JLabel hardDiskPic = new JLabel("");
		hardDiskPic.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\\u0E2E\u0E32\u0E23\u0E4C\u0E14\u0E14\u0E34\u0E2A\u0E01\u0E4C\u0E20\u0E32\u0E22\u0E19\u0E2D\u0E012.png"));
		hardDiskPic.setBounds(21, 11, 100, 75);
		harddiskPanel.add(hardDiskPic);
		
		JLabel lbl_hardDisk = new JLabel("\u0E2E\u0E32\u0E23\u0E4C\u0E14\u0E14\u0E34\u0E2A\u0E01\u0E4C");
		lbl_hardDisk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_hardDisk.setBounds(45, 97, 56, 14);
		harddiskPanel.add(lbl_hardDisk);
		
		JLabel KindsRED = new JLabel("\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48");
		KindsRED.setForeground(Color.RED);
		KindsRED.setFont(new Font("Tahoma", Font.PLAIN, 16));
		KindsRED.setBounds(10, 22, 69, 17);
		ProductShowingPanel.add(KindsRED);
		
		JLabel NewProductRED = new JLabel("\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E32\u0E43\u0E2B\u0E21\u0E48");
		NewProductRED.setForeground(Color.RED);
		NewProductRED.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NewProductRED.setBounds(10, 225, 69, 17);
		ProductShowingPanel.add(NewProductRED);
		
		JPanel NewProductREDPanel = new JPanel();
		NewProductREDPanel.setLayout(null);
		NewProductREDPanel.setBackground(Color.WHITE);
		NewProductREDPanel.setBounds(0, 253, 672, 234);
		ProductShowingPanel.add(NewProductREDPanel);
		
		JScrollPane spN = new JScrollPane();
		spN.setBounds(0, 11, 672, 212);
		NewProductREDPanel.add(spN);
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
				
			}
		});
		table_1.getTableHeader().setUI(null);
		spN.setViewportView(table_1);	
		loadData();
	}
	public void loadData() {
		listImage = NewProductManager.getAllNew_Product_Image();
		int allRowsImage = listImage.size()/4;
		if(listImage.size()%4 != 0) 
			++allRowsImage;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("A"); model.addColumn("B"); model.addColumn("C"); model.addColumn("D");

		for(int i=0;i<listImage.size();i++) {
			int c = 0;
			if((listImage.size()-1) - i <= 2) {
				if((listImage.size()-1) - i == 0) {
					model.addRow(new Object[]{listImage.get(i).getNewProduct_Img()});
				}
				else if((listImage.size()-1) - i == 1) {
					model.addRow(new Object[]{listImage.get(i).getNewProduct_Img(),
							listImage.get(i+1).getNewProduct_Img()});
				}
				else  {
					model.addRow(new Object[]{listImage.get(i).getNewProduct_Img(),
							listImage.get(i+1).getNewProduct_Img(),
							listImage.get(i+2).getNewProduct_Img()});
				}
				break;
			}
			else {
				c = i;
				model.addRow(new Object[]{listImage.get(c).getNewProduct_Img(),
						listImage.get(c+1).getNewProduct_Img(),
						listImage.get(c+2).getNewProduct_Img(),
						listImage.get(c+3).getNewProduct_Img()});
				i += 3;
			}
		}
		
		table_1.setModel(model);
		table_1.getColumn("A").setCellRenderer(new DataTableRenderer());
		table_1.getColumn("B").setCellRenderer(new DataTableRenderer());
		table_1.getColumn("C").setCellRenderer(new DataTableRenderer());
		table_1.getColumn("D").setCellRenderer(new DataTableRenderer());
		table_1.setRowHeight(135);
	}
}