package buy;

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
import javax.swing.JOptionPane;
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
import java.awt.Color;


public class Buysearch extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnNewButton_1;
	static Buysearch frame2 = new Buysearch();
	private JButton btnNewButton;
	private JTextField textField_1;
	private JLabel label_1;
	private JButton btnNewButton_2;
	private JLabel lblid;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
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
	
	public Buysearch() {
		
		final Vector<String> title=new Vector<String>();
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		
		
		

		
		
		Vector value=new Vector();
		
		
		JTextField f1=new JTextField(4);
		JTextField f2=new JTextField(10);
		JTextField f3=new JTextField(6);
		JTextField f4=new JTextField(6);
		JTextField f5=new JTextField(6);
		JTextField f6=new JTextField(4);
		JTextField f7=new JTextField(10);

		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 49, 161, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		table = new JTable();
		table.setBounds(22, 96, 590, 124);
		contentPane.add(table);
		
		int a=0;
		DBConnection db=new DBConnection();
		btnNewButton_1 = new JButton("查询");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText().trim();
				
				
				DBUtil du=new DBUtil();
				Vector value=du.details(s);
				
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
										String ouprice1=table.getValueAt(row, 4).toString();
										
									

									}
								});

							}
						
					
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(506, 48, 93, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
		JLabel label = new JLabel("小票编号");
		label.setForeground(Color.WHITE);
		label.setBounds(22, 23, 95, 15);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 49, 161, 21);
		contentPane.add(textField_1);
		
		DBUtil du=new DBUtil();
		btnNewButton = new JButton("退货");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gid=textField_1.getText();
				String s=textField.getText();
				String pay=du.selectpay(s);
				if(pay.trim().equals("0.0000"))
					JOptionPane.showMessageDialog(null, "你已经退货过了，你没机会了");
				else
				du.detlesum(s, gid);
			}
		});
		btnNewButton.setBounds(519, 230, 93, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("关闭");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buysearch.t2(null);
			}
		});
		btnNewButton_2.setBounds(32, 230, 93, 23);
		contentPane.add(btnNewButton_2);
		
		
		
		label_1 = new JLabel("货物号");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(271, 23, 36, 15);
		contentPane.add(label_1);
		
		lblid = new JLabel("小票id");
		lblid.setBounds(32, 80, 54, 15);
		contentPane.add(lblid);
		
		label_2 = new JLabel("货物名称");
		label_2.setBounds(139, 80, 54, 15);
		contentPane.add(label_2);
		
		label_3 = new JLabel("货物单价");
		label_3.setBounds(379, 80, 54, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("货物数量");
		label_4.setBounds(496, 81, 54, 15);
		contentPane.add(label_4);
		
		label_5 = new JLabel("货物id");
		label_5.setBounds(265, 80, 54, 15);
		contentPane.add(label_5);
		
		panel = new JPanel();
		panel.setBounds(10, 76, 602, 177);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Buysearch.class.getResource("/tupian/4.png")));
		lblNewLabel.setBounds(0, -2, 653, 267);
		contentPane.add(lblNewLabel);
		
		
	}
}
