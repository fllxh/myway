package buy;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import buy1.payway;

import db.DBConnection;
import db.DBUtil;
import javax.swing.ImageIcon;




public class BuyGui2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	static BuyGui2 frameb = new BuyGui2();
	/**
	 * Launch the application.
	 */
	public static void b1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frameb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void b2(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frameb.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public BuyGui2() {
		final Vector<String> title=new Vector<String>();
		title.add("小票id");
		
		title.add("金额");
		
		title.add("应付");
		title.add("实付");
		
		title.add("找零");
		
		
		DBConnection db =new DBConnection();
	Connection con=null;
		setTitle("超市管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 518);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u4EA4\u6613\u5386\u53F2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(31, 22, 641, 377);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(115, 25, 138, 21);
		comboBox.setModel(new DefaultComboBoxModel(way.values()));
		panel_2.add(comboBox);
		
		
		
		table = new JTable();
		table.setBounds(10, 108, 619, 259);
		panel_2.add(table);
		
		
		textField = new JTextField();
		textField.setBounds(306, 25, 148, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("小票id");
		label_1.setBounds(10, 83, 95, 15);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("会员号");
		label_2.setBounds(135, 83, 95, 15);
		panel_2.add(label_2);
		
		JLabel label_5 = new JLabel("应付");
		label_5.setBounds(276, 83, 95, 15);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("实付");
		label_6.setBounds(390, 83, 95, 15);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("找零");
		label_7.setBounds(534, 83, 95, 15);
		panel_2.add(label_7);
		
		JLabel label = new JLabel("\u9009\u62E9\u67E5\u8BE2\u6761\u4EF6\uFF1A");
		label.setBounds(10, 28, 95, 15);
		panel_2.add(label);
		
		JButton button_1 = new JButton("查询");
		button_1.setBounds(536, 24, 93, 23);
		panel_2.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				switch((way)comboBox.getSelectedItem()) {
				case 会员号:{
					String s=textField.getText();
					Vector value=DBUtil.query(s);
					final DefaultTableModel model = new DefaultTableModel(value,title);
					table.setModel(model);
					{
						if(table.getRowCount()>0)
						{
							table.setRowSelectionInterval(0, 0);
						}
						table.addMouseListener(new MouseListener() {
							@Override
							public void mouseReleased(MouseEvent e) {
							}
							@Override
							public void mousePressed(MouseEvent e) {
								// TODO 自动生成的方法存根		
							}
							@Override
							public void mouseExited(MouseEvent e) {
								// TODO 自动生成的方法存根
							}
							@Override
							public void mouseEntered(MouseEvent e) {
								// TODO 自动生成的方法存根
							}
							@Override
							public void mouseClicked(MouseEvent e) {
								// TODO 自动生成的方法存根
							int row=table.getSelectedRow();
							String sid=table.getValueAt(row, 0).toString();
							String sname=table.getValueAt(row, 1).toString();
							String inprice=table.getValueAt(row, 2).toString();
							String ouprice=table.getValueAt(row, 3).toString();
							String save=table.getValueAt(row, 4).toString();
							String state=table.getValueAt(row, 5).toString();
							String note=table.getValueAt(row, 6).toString();
							

							}
						});

					}
				};
				break;
				case 小票号:{
					String s=textField.getText();
					Vector value=DBUtil.querys(s);
					final DefaultTableModel model = new DefaultTableModel(value,title);
					table.setModel(model);
					{
						if(table.getRowCount()>0)
						{
							table.setRowSelectionInterval(0, 0);
						}
						table.addMouseListener(new MouseListener() {
							@Override
							public void mouseReleased(MouseEvent e) {
							}
							@Override
							public void mousePressed(MouseEvent e) {
								// TODO 自动生成的方法存根		
							}
							@Override
							public void mouseExited(MouseEvent e) {
								// TODO 自动生成的方法存根
							}
							@Override
							public void mouseEntered(MouseEvent e) {
								// TODO 自动生成的方法存根
							}
							@Override
							public void mouseClicked(MouseEvent e) {
								// TODO 自动生成的方法存根
							int row=table.getSelectedRow();
							String sid=table.getValueAt(row, 0).toString();
							String sname=table.getValueAt(row, 1).toString();
							String inprice=table.getValueAt(row, 2).toString();
							String ouprice=table.getValueAt(row, 3).toString();
							String save=table.getValueAt(row, 4).toString();
							String state=table.getValueAt(row, 5).toString();
							String note=table.getValueAt(row, 6).toString();
							

							}
						});

					}
				};
				break;
				}
				
				
				
				
				
				
				
				
			}
		});
		
		
		
		
		
		JButton button_3 = new JButton("详细查询");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buysearch.t1(null);
			}
		});
		button_3.setBounds(553, 413, 93, 23);
		contentPane.add(button_3);
		
		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyGui2.b2(null);
			}
		});
		button.setBounds(41, 413, 93, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(BuyGui2.class.getResource("/tupian/4.png")));
		lblNewLabel.setBounds(0, 0, 716, 458);
		contentPane.add(lblNewLabel);
	}
}
