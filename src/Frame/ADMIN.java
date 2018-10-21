package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import DataManager.NewProductDB;
import DataManager.NewProductManager;
import DataManager.OrderProductDB;
import DataManager.OrderProductManager;
import DataManager.ProductManager;
import DatabaseAndTools.DataTableRenderer;
import DatabaseAndTools.ImagePanel;
import DatabaseAndTools.OpenFileFilter;

import javax.swing.UIManager;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ADMIN extends JFrame {

	private JPanel contentPane;
	private JTextField txt_type_NP;
	private JTable NewProduct_tbl;
	ImagePanel img_NP;
	LinkedList<NewProductDB> listNP;
	LinkedList<OrderProductDB> orderMyAccount;
	private JTextField txt_productId;
	private JTextField temail;
	private JTextField tpriceall;
	private JTextField torderid;
	private JTextField tproductid;
	private JTextField tproductcount;
	private JTextField textField;
	ImageIcon img1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
				            UIManager.getSystemLookAndFeelClassName());
					ADMIN frame = new ADMIN("Mr. ...");
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
	public ADMIN(String username) {
		setTitle("BIG SALE - Home");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage(Home.class.getResource("/Image/ICON.png"));
	    setIconImage(icons);
		setTitle("ADMIN BIG SALE - Add Product");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 34, 950, 621);
		contentPane.add(tabbedPane);
		
		JPanel addProduct = new JPanel();
		tabbedPane.addTab("Add New Product", null, addProduct, null);
		addProduct.setLayout(null);
		
		JPanel FormPanel = new JPanel();
		FormPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Form ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		FormPanel.setBounds(10, 11, 349, 470);
		addProduct.add(FormPanel);
		FormPanel.setLayout(null);
		
		txt_type_NP = new JTextField();
		txt_type_NP.setBounds(76, 35, 244, 30);
		FormPanel.add(txt_type_NP);
		txt_type_NP.setColumns(10);
		
		JLabel lblType = new JLabel("Type ");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(20, 41, 40, 19);
		FormPanel.add(lblType);
		
		img_NP = new ImagePanel();
		img_NP.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		img_NP.setBounds(76, 98, 244, 219);
		FormPanel.add(img_NP);
		
		JLabel lblImage = new JLabel("Image");
		lblImage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblImage.setBounds(20, 98, 46, 19);
		FormPanel.add(lblImage);
		
		JButton btnBrowse_NP = new JButton("Browse");
		btnBrowse_NP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				fc.addChoosableFileFilter(new OpenFileFilter("jpg","Photo in JPG format"));
				fc.addChoosableFileFilter(new OpenFileFilter("png","Photo in PNG format"));
				fc.addChoosableFileFilter(new OpenFileFilter("jpeg","Photo in JPEG format"));
				fc.setAcceptAllFileFilterUsed(false);
				int returnVal = fc.showOpenDialog(ADMIN.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					try {
						BufferedImage buffimg = ImageIO.read(f);
						BufferedImage newbuffimg = new BufferedImage(buffimg.getWidth(),
								buffimg.getHeight(), BufferedImage.TYPE_INT_RGB);
						
						newbuffimg.createGraphics().drawImage(buffimg, 0, 0, Color.WHITE, null);
						img_NP.setImage(newbuffimg);
					} catch (IOException eX) {
						eX.printStackTrace();
					}
				}
			}
		});
		btnBrowse_NP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBrowse_NP.setBounds(76, 346, 105, 30);
		FormPanel.add(btnBrowse_NP);
		
		JButton btnAdd_NP = new JButton("Add");
		btnAdd_NP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				NewProductDB x;
				if(txt_type_NP.getText().trim().length() <= 0) 
					x = new NewProductDB((BufferedImage)img_NP.getImage(), txt_type_NP.getText().trim());
				else 
					x = new NewProductDB((BufferedImage)img_NP.getImage(), txt_type_NP.getText().trim());
				if(ImagePanel.isDraw) {
					NewProductManager.saveNew_Product(x);			
					JOptionPane.showMessageDialog(ADMIN.this,"SAVE FINISH!!");
				}
				else {
					JOptionPane.showMessageDialog(ADMIN.this,"INSERT IMAGE!!");
					return;
				}
//				ClearFields(new JComponent[]{txt_id_PM, comboBox_Type, txt_name_PM, txt_remark_PM, spinnerQTY_PMD});
//				detail_listPMD.clear();
				loadNewProduct();
			}
		});
		btnAdd_NP.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd_NP.setBounds(76, 398, 105, 30);
		FormPanel.add(btnAdd_NP);
		
		JPanel ViewPanel = new JPanel();
		ViewPanel.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		ViewPanel.setBounds(366, 11, 569, 594);
		addProduct.add(ViewPanel);
		ViewPanel.setLayout(null);
		
		JScrollPane NewProduct_SCP = new JScrollPane();
		NewProduct_SCP.setBounds(10, 22, 549, 561);
		ViewPanel.add(NewProduct_SCP);
		
		NewProduct_tbl = new JTable();
		NewProduct_SCP.setViewportView(NewProduct_tbl);
		tabbedPane.setEnabledAt(0, true);
		
		JPanel addOrder = new JPanel();
		tabbedPane.addTab("New tab", null, addOrder, null);
		
		JLabel lblusername = new JLabel("~Unknow~");
		lblusername.setForeground(Color.DARK_GRAY);
		lblusername.setFont(new Font("CS ChatThai", Font.PLAIN, 24));
		lblusername.setBounds(51, 13, 192, 16);
		lblusername.setText(username);
		contentPane.add(lblusername);
		
		JLabel label = new JLabel("\u0E2D\u0E2D\u0E01\u0E08\u0E32\u0E01\u0E23\u0E30\u0E1A\u0E1A");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int res = JOptionPane.showConfirmDialog(ADMIN.this, "คุณแน่ใจที่จะออกจากระบบหรือไม่?", "Log out", JOptionPane.YES_NO_OPTION);
				if(res == JOptionPane.YES_OPTION) {
					Home nw = new Home();
					nw.setVisible(true);
					dispose();
				}
				else {
					setVisible(true);
				}
			}
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setForeground(Color.BLUE);
		label.setFont(new Font("CS ChatThai", Font.PLAIN, 24));
		label.setBounds(253, 13, 111, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0E04\u0E38\u0E13 : ");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 24));
		label_1.setBounds(10, 13, 40, 16);
		contentPane.add(label_1);
		loadNewProduct();

		tabbedPane.addTab("addimage", null, addOrder, null);
		addOrder.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(472, 5, 1, 1);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Form ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		addOrder.add(panel);
		
		txt_productId = new JTextField();
		txt_productId.setColumns(10);
		txt_productId.setBounds(91, 90, 244, 30);
		addOrder.add(txt_productId);
		
		JLabel lblProductid = new JLabel("Product_id");
		lblProductid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProductid.setBounds(10, 95, 71, 19);
		addOrder.add(lblProductid);
		
		ImagePanel imagePanel = new ImagePanel();
		imagePanel.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		imagePanel.setBounds(88, 145, 244, 219);
		addOrder.add(imagePanel);
		
		JLabel label_3 = new JLabel("Image");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(32, 145, 46, 19);
		addOrder.add(label_3);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.addChoosableFileFilter(new OpenFileFilter("jpg","Photo in JPG format"));
				fc.addChoosableFileFilter(new OpenFileFilter("png","Photo in PNG format"));
				fc.addChoosableFileFilter(new OpenFileFilter("jpeg","Photo in JPEG format"));
				fc.setAcceptAllFileFilterUsed(false);
				int returnVal = fc.showOpenDialog(ADMIN.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					try {
						BufferedImage buffimg = ImageIO.read(f);
						BufferedImage newbuffimg = new BufferedImage(buffimg.getWidth(),
								buffimg.getHeight(), BufferedImage.TYPE_INT_RGB);
						
						newbuffimg.createGraphics().drawImage(buffimg, 0, 0, Color.WHITE, null);
						imagePanel.setImage(newbuffimg);
					} catch (IOException eX) {
						eX.printStackTrace();
					}
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(91, 375, 105, 30);
		addOrder.add(button);
		
		JButton btnAdd = new JButton("addimage");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewProductDB x;
				if(txt_productId.getText().trim().length()<1) {
					JOptionPane.showMessageDialog(ADMIN.this,"Product_id");
				}
				else{
					x = new NewProductDB((BufferedImage)imagePanel.getImage(), txt_productId.getText().trim());
					if(ImagePanel.isDraw) {
						ProductManager.saveTable_imageproduct(x);			
						JOptionPane.showMessageDialog(ADMIN.this,"SAVE FINISH!!");
					}
					else {
						JOptionPane.showMessageDialog(ADMIN.this,"INSERT IMAGE!!");
						return;
					};
				}
				
				/*
						
				NewProductDB x;
				if(txt_type_NP.getText().trim().length() <= 0) 
					x = new NewProductDB((BufferedImage)img_NP.getImage(), txt_type_NP.getText().trim());
				else 
					x = new NewProductDB((BufferedImage)img_NP.getImage(), txt_type_NP.getText().trim());
				if(ImagePanel.isDraw) {
					NewProductManager.saveNew_Product(x);			
					JOptionPane.showMessageDialog(aDMIN.this,"SAVE FINISH!!");
				}
				else {
					JOptionPane.showMessageDialog(aDMIN.this,"INSERT IMAGE!!");
					return;
				}
				loadNewProduct();
				*/
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdd.setBounds(91, 420, 105, 30);
		addOrder.add(btnAdd);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-mail");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 62, 106, 43);
		panel_1.add(lblNewLabel);
		
		temail = new JTextField();
		temail.setBounds(115, 62, 382, 35);
		panel_1.add(temail);
		temail.setColumns(10);
		
		JLabel lblPriceall = new JLabel("PriceAll");
		lblPriceall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPriceall.setBounds(29, 116, 106, 43);
		panel_1.add(lblPriceall);
		
		tpriceall = new JTextField();
		tpriceall.setEditable(false);
		tpriceall.setColumns(10);
		tpriceall.setBounds(115, 116, 382, 35);
		panel_1.add(tpriceall);
		
		torderid = new JTextField();
		torderid.setBounds(280, 204, 197, 35);
		panel_1.add(torderid);
		torderid.setColumns(10);
		
		JLabel lblOrderid = new JLabel("order_id");
		lblOrderid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOrderid.setBounds(134, 196, 106, 43);
		panel_1.add(lblOrderid);
		
		JLabel lblProductid_1 = new JLabel("\tproduct_id");
		lblProductid_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProductid_1.setBounds(134, 278, 106, 43);
		panel_1.add(lblProductid_1);
		
		JLabel lblProductcount = new JLabel("product_count");
		lblProductcount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProductcount.setBounds(115, 357, 144, 43);
		panel_1.add(lblProductcount);
		
		tproductid = new JTextField();
		tproductid.setColumns(10);
		tproductid.setBounds(280, 293, 197, 35);
		panel_1.add(tproductid);
		
		tproductcount = new JTextField();
		tproductcount.setColumns(10);
		tproductcount.setBounds(280, 372, 197, 35);
		panel_1.add(tproductcount);
		
		JLabel label_2 = new JLabel("PriceAll");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(134, 441, 106, 43);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(280, 449, 197, 35);
		panel_1.add(textField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(578, 76, 89, 23);
		panel_1.add(btnNewButton);
	}
	public void loadNewProduct() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Image");
		model.addColumn("Type");
		for(NewProductDB pb : listNP = NewProductManager.getAllNew_Product()) {
			model.addRow(new Object[]{pb.getNewProduct_ID(), pb.getNewProduct_Img(), pb.getNewProduct_Type()});
		}
	
		NewProduct_tbl.setModel(model);
		NewProduct_tbl.getColumn("Image").setCellRenderer(new DataTableRenderer());
		DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)NewProduct_tbl.getDefaultRenderer(Object.class);
	    renderer.setHorizontalAlignment( SwingConstants.CENTER );
		NewProduct_tbl.setRowHeight(120);
		
	
	}
	public Image bufferedImagetoImage(BufferedImage bi) {
	    return Toolkit.getDefaultToolkit().createImage(bi.getSource());
	}
}
