package directorGZK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chaxun extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	
	//private String[][] data = {{"123456","安慕希","50","70","80"}};
    String[][] data = {{"","","","",""}};
	private String[] dataTitle = {"商品编号","商品名称","库存量","入库价格","零售价"};
	private JTable table;
	
	private int temp=0;

	/**
	 * Launch the application.
	 */
	static chaxun frame = new chaxun();
			public void run() {
				try {
					//chaxun frame = new chaxun();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public chaxun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5E93\u5B58\u67E5\u8BE2");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(233, 40, 188, 46);
		contentPane.add(label);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 184, 493, 302);
		contentPane.add(scrollPane);
		
		JLabel label_1 = new JLabel("\u8F93\u5165\u5546\u54C1\u7F16\u53F7\u67E5\u8BE2");
		label_1.setBounds(57, 102, 120, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(26, 135, 120, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp1=textField.getText();
				if(temp1.equals("123")) {
					JOptionPane.showConfirmDialog(null,"没有匹配",null,JOptionPane.PLAIN_MESSAGE);
				}
				else{
					String[][] data = {{"123456","安慕希","50","70","80"}};
					table = new JTable(data,dataTitle);
					scrollPane.setViewportView(table);
				}
				textField.setText("");
				
			}
		});
	
		button.setBounds(156, 134, 93, 23);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("\u8F93\u5165\u5546\u54C1\u540D\u79F0\u67E5\u8BE2");
		label_2.setBounds(354, 102, 104, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 135, 114, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_1 = new JButton("\u67E5\u8BE2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp2=textField_1.getText();
				if(temp2.equals("1234")) {
					JOptionPane.showConfirmDialog(null,"没有匹配",null,JOptionPane.PLAIN_MESSAGE);
				}
				else {
				String[][] data = {{"123456","安慕希","30","70","80"},
				           
				};
		table = new JTable(data,dataTitle);
		scrollPane.setViewportView(table);
			}
				textField_1.setText("");}
		});
		button_1.setBounds(432, 134, 93, 23);
		contentPane.add(button_1);
		
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBounds(26, 184, 493, 302);
		//contentPane.add(scrollPane);
		
		table = new JTable(data,dataTitle);
		scrollPane.setViewportView(table);
		
	
		
		JButton button_2 = new JButton("\u67E5\u8BE2\u6240\u6709\u5E93\u5B58");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp==0) {
				String[][] data = {{"11111","百岁山","50","2","3"},
						           {"22222","农夫山泉","80","1","1.5"},
						           {"33333","恒大冰泉","100","5","4"}
						};
				table = new JTable(data,dataTitle);
				scrollPane.setViewportView(table);
				temp=1;
				}
				else if(temp==1) {
					String[][] data =  {{"11111","百岁山","50","2","3"},
					           {"22222","农夫山泉","80","1","1.5"},
					           {"33333","恒大冰泉","100","5","4"},
					           {"123456","安慕希","50","70","80"}
					};
					table = new JTable(data,dataTitle);
					scrollPane.setViewportView(table);
					temp=2;
				}
				else if(temp==2) {
					String[][] data =  {{"11111","百岁山","50","2","3"},
					           {"22222","农夫山泉","80","1","1.5"},
					           {"33333","恒大冰泉","100","5","4"},
					           {"123456","安慕希","30","70","80"}
					};
					table = new JTable(data,dataTitle);
					scrollPane.setViewportView(table);
					temp=3;
				}
				else if(temp==3) {
					String[][] data = {{"11111","百岁山","50","2","3"},
					           {"22222","农夫山泉","80","1","1.5"},
					           {"33333","恒大冰泉","100","5","4"},
					           {"123456","安慕希","30","70","80"}
					};
			table = new JTable(data,dataTitle);
			scrollPane.setViewportView(table);
				}
			}
		});
		button_2.setBounds(32, 40, 145, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u8FD4\u56DE\u4ED3\u5E93\u4E3B\u754C\u9762");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] data = {{"","","","",""}};
			       table = new JTable(data,dataTitle);
			       scrollPane.setViewportView(table);
			       textField.setText("");
			       textField_1.setText("");
				mainSurface sur=new mainSurface();
				frame.dispose();
				sur.run();
				
				
			}
		});
		button_3.setBounds(391, 496, 134, 23);
		contentPane.add(button_3);
	}
	
}
