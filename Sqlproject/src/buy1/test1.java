package buy1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import change.changeuti;
import db.DBConnection;
import db.DBUtil;
import javax.swing.ImageIcon;


public class test1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JTextField textField_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	static test1 frame3 = new test1();
	static int sum;
	static String  sid;
	private JTextField textField_2;
	private JLabel lblid;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JButton button;
	private JPanel panel;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void t1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame3.setVisible(true);
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
					
					frame3.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public test1() {
		
		final Vector<String> title=new Vector<String>();
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		title.add("小票id");
		
		
		List<Integer> l = new ArrayList<Integer>();

		
		
		Vector value=new Vector();
		
		
		JTextField f1=new JTextField(4);
		JTextField f2=new JTextField(10);
		JTextField f3=new JTextField(6);
		JTextField f4=new JTextField(6);
		JTextField f5=new JTextField(6);
		JTextField f6=new JTextField(4);
		JTextField f7=new JTextField(10);

		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(398, 47, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(130, 47, 146, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_3 = new JButton("删除");
		btnNewButton_3.setBounds(543, 46, 93, 23);
		contentPane.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 47, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		table = new JTable();
		table.setBounds(130, 93, 615, 206);
		contentPane.add(table);
		
	
		
		
		int a=0;
		DBUtil du=new DBUtil();
		DBConnection db=new DBConnection();
		btnNewButton_1 = new JButton("添加");
		btnNewButton_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				int b=0;
				int c=0;
				String d=null;
				if(textField_1.getText().length()==0) {
					
						JOptionPane.showMessageDialog(null, "请输入数量！");}
				else {
				b = Integer.valueOf(textField.getText()).intValue();
				c = Integer.valueOf(textField_1.getText()).intValue();
				
					
				
				textField.setText("");
				textField_1.setText("");
				
				
				String ssid=String.valueOf(b);
				
				value.add(du.rowline(b,c));
				
				String gname=du.selectgoodname(ssid);
				
				
					
				
				
				
				
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
									String save=table.getValueAt(row, 4).toString();
									String state=table.getValueAt(row, 5).toString();
									String note=table.getValueAt(row, 6).toString();
								

								}
							});

						}
						l.add( (Integer) du.rowline(b,c).elementAt(4));
				
					}
				
				}
				});
				
		
		btnNewButton_1.setBounds(655, 46, 93, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel(value,title);
				value.remove(model.getRowCount()-1);
				table = new JTable();
				table.setBounds(130, 93, 615, 206);
				contentPane.add(table);
				
				
				
				l.remove(l.size()-1);
				
				
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
				
				
			}
		});
		
		
		
		
		JLabel label = new JLabel("商品id");
		label.setBounds(129, 22, 95, 15);
		contentPane.add(label);
		
		
		
		JLabel label_1 = new JLabel("数量");
		label_1.setBounds(304, 22, 95, 15);
		contentPane.add(label_1);
		
		JButton btnNewButton_2 = new JButton("清空");
		btnNewButton_2.setBounds(493, 335, 93, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("提交");
		btnNewButton_4.setBounds(371, 335, 93, 23);
		contentPane.add(btnNewButton_4);
		
		
		
		JLabel label_2 = new JLabel("会员号");
		label_2.setBounds(398, 22, 54, 15);
		contentPane.add(label_2);
		
		lblid = new JLabel("商品id");
		lblid.setBounds(130, 78, 54, 15);
		contentPane.add(lblid);
		
		label_3 = new JLabel("商品名称");
		label_3.setBounds(254, 78, 54, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("商品单价");
		label_4.setBounds(377, 78, 54, 15);
		contentPane.add(label_4);
		
		label_5 = new JLabel("商品数量");
		label_5.setBounds(508, 78, 54, 15);
		contentPane.add(label_5);
		
		label_6 = new JLabel("商品总价");
		label_6.setBounds(623, 78, 54, 15);
		contentPane.add(label_6);
		
		button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test1.t2(null);
			}
		});
		button.setBounds(652, 335, 93, 23);
		contentPane.add(button);
		
		panel = new JPanel();
		panel.setBounds(95, 22, 693, 303);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(test1.class.getResource("/tupian/4.png")));
		lblNewLabel.setBounds(0, 0, 834, 385);
		contentPane.add(lblNewLabel);
		
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBUtil db=new DBUtil();
				String d="";
				
				if(textField_2.getText().trim().length()!=0 )
				{
					if(du.selectname2(textField_2.getText())==1)
					{
						d = textField_2.getText();
					}
					else
						d="";
				}
				else
					d="";
				TableModel tm = table.getModel();
				
				for (int i = 0; i < l.size(); i++) {
					sum=sum+l.get(i);
				}
				
				
				
				
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				
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
								String save=table.getValueAt(row, 4).toString();
								String state=table.getValueAt(row, 5).toString();
								String note=table.getValueAt(row, 6).toString();
							

							}
						});

					}
					
					
					
					
					try {
						sid=db.xinsert(d, sum);
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "插入失败");
					}
					
					
					for (int i = 0; i < l.size(); i++) {
						Object valueid = tm.getValueAt(i, 0); 
						
						Object valueprice = tm.getValueAt(i, 2); 
						Object valuenumber = tm.getValueAt(i, 3); 
						
						String a=String.valueOf(valueid);
						
						String b=String.valueOf(valueprice);
						String c=String.valueOf(valuenumber);
						int number = Integer.parseInt( c ); 
						Double price = Double.parseDouble( b );
						try {
							du.xdinsert(sid, a.trim(), price, number);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					
					
				
				
				payway.runa(null);
				test1.t2(null);
				
			}
		});
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel(value,title);
				value.removeAllElements();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");

				model = new DefaultTableModel(value,title);
				
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
			
				
				
			}
		});
		
		
	}
}
