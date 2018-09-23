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
import DatabaseAndTools.DataTableRenderer;
import DatabaseAndTools.ImagePanel;
import DatabaseAndTools.OpenFileFilter;

import javax.swing.UIManager;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JButton;
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

@SuppressWarnings("serial")
public class aDMIN extends JFrame {

	private JPanel contentPane;
	private JTextField txt_type_NP;
	private JTable NewProduct_tbl;
	ImagePanel img_NP;
	LinkedList<NewProductDB> listNP;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public aDMIN() {
		setTitle("ADMIN");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\ICON.png");
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 950, 644);
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
				int returnVal = fc.showOpenDialog(aDMIN.this);
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
					JOptionPane.showMessageDialog(aDMIN.this,"SAVE FINISH!!");
				}
				else {
					JOptionPane.showMessageDialog(aDMIN.this,"INSERT IMAGE!!");
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
		loadNewProduct();
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
}
