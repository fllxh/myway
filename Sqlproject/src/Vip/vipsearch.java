package Vip;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import buy.way;
import change.changeuti;

import db.DBConnection;
import db.DBUtil;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;


public class vipsearch extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnNewButton_1;
	static vipsearch frame2 = new vipsearch();
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JPanel panel;
	private JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void t1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void t2(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public vipsearch() {
		
		final Vector<String> title=new Vector<String>();
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		
		
		
		changeuti ci=new changeuti();
		
		
		Vector value=new Vector();
		
		
		JTextField f1=new JTextField(4);
		JTextField f2=new JTextField(10);
		JTextField f3=new JTextField(6);
		JTextField f4=new JTextField(6);
		JTextField f5=new JTextField(6);
		JTextField f6=new JTextField(4);
		JTextField f7=new JTextField(10);

		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 197, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		table = new JTable();
		table.setBounds(22, 96, 348, 206);
		contentPane.add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(273, 30, 76, 21);
		comboBox.setModel(new DefaultComboBoxModel(way1.values()));
		contentPane.add(comboBox);
		
		int a=0;
		DBConnection db=new DBConnection();
		btnNewButton_1 = new JButton("查询");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				

				switch((way1)comboBox.getSelectedItem()) {
				case 名字:{
					
					String s=textField.getText();
					System.out.println(1);
					Vector value=viputil.selectname(s);
					System.out.println(s);
					DefaultTableModel model = new DefaultTableModel(value,title);
					
						
							
							
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
										
									

									}
								});

							}
						
					
				};
				break;
				case 会员号:{
					
					String s=textField.getText();
					
					Vector value=viputil.selectname1(s);
					DefaultTableModel model = new DefaultTableModel(value,title);
					
							
							
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
										
									

									}
								});

							}
						
					
					
				};
				break;
				}
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(273, 338, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.setBounds(22, 341, 93, 23);
		contentPane.add(btnNewButton_2);
		
		label = new JLabel("会员号");
		label.setBounds(32, 80, 54, 15);
		contentPane.add(label);
		
		panel = new JPanel();
		panel.setBounds(10, 60, 371, 268);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label_1 = new JLabel("姓名");
		label_1.setBounds(105, 20, 24, 15);
		panel.add(label_1);
		
		label_2 = new JLabel("消费额");
		label_2.setBounds(193, 20, 54, 15);
		panel.add(label_2);
		
		label_3 = new JLabel("密码");
		label_3.setBounds(274, 20, 54, 15);
		panel.add(label_3);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(vipsearch.class.getResource("/tupian/4.png")));
		lblNewLabel.setBounds(0, 10, 391, 365);
		contentPane.add(lblNewLabel);
		
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vipsearch.t2(null);
				
				
			}
		});
		
		
	}
}
