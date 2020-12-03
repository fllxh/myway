package directorGZK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chuku extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	static chuku frame = new chuku();
			public void run() {
				try {
					//chuku frame = new chuku();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public chuku() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5546\u54C1\u51FA\u5E93");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(202, 53, 75, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u7F16\u53F7");
		label_1.setBounds(78, 109, 91, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(202, 106, 150, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u540D\u79F0");
		label_2.setBounds(78, 156, 91, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 153, 150, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u51FA\u5E93\u6570\u91CF");
		label_3.setBounds(78, 202, 91, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 199, 150, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=textField.getText();
				String temp1=textField_1.getText();
				String temp2=textField_2.getText();
				if(temp.equals("123")) {
					JOptionPane.showConfirmDialog(null,"出库失败，没有此商品",null,JOptionPane.PLAIN_MESSAGE);
				}
				//String temp1=textField_1.getText();
				else if (temp1.equals("1234")) {
					JOptionPane.showConfirmDialog(null,"出库失败，没有此商品",null,JOptionPane.PLAIN_MESSAGE);
				}
				//String temp2=textField_2.getText();
				else if(temp2.equals("10000")) {
					JOptionPane.showConfirmDialog(null,"出库失败，库存不足",null,JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showConfirmDialog(null,"出库成功",null,JOptionPane.PLAIN_MESSAGE);
				}
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		button.setBounds(178, 262, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE\u4ED3\u5E93\u4E3B\u754C\u9762");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				mainSurface sur = new mainSurface();
				sur.run();
				frame.dispose();
			}
		});
		button_1.setBounds(293, 331, 161, 41);
		contentPane.add(button_1);
	}

}
