package jm2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;

public class A1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	static A1 frame = new A1();
			public void run() {
				try {
					//A1 frame = new A1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public A1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 211, 315, 333);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		textField = new JTextField();
		textField.setBounds(38, 87, 134, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(38, 139, 134, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(426, 87, 134, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(426, 139, 134, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("10060")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10060         谷维素片（乙类）             1.5000         415\n");
				}
				if(textField.getText().equals("10060")&&textField_2.getText().equals("10060")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10060         谷维素片（乙类）             2.0000         415\n");
				}
				if(textField.getText().equals("10082")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10082         陈村米线香菇鸡汁面         1.5000         768\n");
				}
				if(textField.getText().equals("10110")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10110         华美奇之脆米通                 6.0000         825\n");
				}
				if(textField.getText().equals("10129")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10129         华美曲奇小8角罐              18.0000       1000\n");
				}
				if(textField.getText().equals("10148")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10148         达利好吃点芝麻苏打饼     2.9000         980\n");
				}
				if(textField.getText().equals("10269")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10269         阿尔卑斯巧克力味             2.5000         1000\n");
				}
				if(textField.getText().equals("10338")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10338         阿尔卑斯卡布奇诺咖啡     2.0000         1000\n");
				}
				if(textField.getText().equals("10400")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10400         农夫山泉                              2.0000         1000\n");
				}
			}
		});
		btnNewButton.setBounds(237, 86, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u8BE2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("谷维素片")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10060         谷维素片（乙类）             1.5000         415\n");
				}
				if(textField_1.getText().equals("达利好吃点")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10148         达利好吃点芝麻苏打饼     2.9000         980\n");
				}
				if(textField_1.getText().equals("阿尔卑斯")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10269         阿尔卑斯巧克力味             2.5000         1000\n");
					textArea.append("10338         阿尔卑斯卡布奇诺咖啡     2.0000         1000\n");
					textArea.append("11655         阿尔卑斯糖                         1.8000         1000\n");
				}
				if(textField_1.getText().equals("达利")) {
					textArea.setText("");
					textArea.append("商品编号     商品名称                             商品单价     商品库存\n");
					textArea.append("10148         达利好吃点芝麻苏打饼     2.9000         980\n");
					textArea.append("11320         达利可比克香辣味薯片     3.5000         631\n");
					textArea.append("11776         达利高钙字母饼                 5.0000         722\n");
					textArea.append("12055         达利无糖芝麻酥                 3.5000         1000\n");
					textArea.append("12278         达利雪饼                             5.0000         671\n");
					textArea.append("12799         达利南瓜酥                         3.5000         1000\n");
					textArea.append("12980         达利早茶饼                         5.0000         1000\n");
				}
			}
		});
		btnNewButton_1.setBounds(237, 138, 93, 23);
		contentPane.add(btnNewButton_1);
		
		
		JLabel label = new JLabel("\u5546\u54C1\u7F16\u53F7");
		label.setBounds(78, 62, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5546\u54C1\u540D\u79F0");
		label_1.setBounds(78, 118, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5546\u54C1\u4FE1\u606F");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(164, 181, 94, 21);
		contentPane.add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(383, 255, 177, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(383, 323, 177, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(383, 391, 177, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(383, 463, 177, 21);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5546\u54C1\u7F16\u53F7");
		label_3.setBounds(459, 62, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u4FEE\u6539\u4EF7\u683C");
		label_4.setBounds(459, 118, 54, 15);
		contentPane.add(label_4);
		
		JButton button = new JButton("\u4FEE\u6539\u4FE1\u606F");
		button.setBounds(589, 102, 93, 35);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\u5546\u54C1\u7F16\u53F7");
		lblNewLabel.setBounds(401, 230, 54, 15);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.CYAN);
		textArea_1.setBounds(451, 521, 215, 23);
		contentPane.add(textArea_1);
		
		JButton btnNewButton_2 = new JButton("\u6DFB\u52A0\u5546\u54C1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_4.getText().equals("10129")) {
					textArea_1.setText("");
					textArea_1.append("     编号重复\n");
				}
				if(textField_4.getText().equals("10400")) {
					textArea_1.setText("");
					textArea_1.append("     信息不全\n");
				}
				if(textField_4.getText().equals("10400")&&textField_6.getText().equals("1000")) {
					textArea_1.setText("");
					textArea_1.append("     添加成功\n");
				}
			}
		});
		btnNewButton_2.setBounds(589, 353, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u540D\u79F0");
		lblNewLabel_1.setBounds(401, 298, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u5E93\u5B58");
		lblNewLabel_2.setBounds(401, 366, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5546\u54C1\u4EF7\u683C");
		lblNewLabel_3.setBounds(401, 438, 54, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_5 = new JLabel("\u5546\u54C1\u7BA1\u7406");
		label_5.setFont(new Font("宋体", Font.PLAIN, 27));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(315, -31, 157, 94);
		contentPane.add(label_5);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A0 framea=new A0();
				framea.run();
				frame.dispose();
			}
		});
		button_1.setBounds(451, 10, 93, 23);
		contentPane.add(button_1);
		

	}
}
