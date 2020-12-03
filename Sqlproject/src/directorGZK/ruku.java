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

public class ruku extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	static ruku frame = new ruku();
	
		
			public void run() {
				try {
					//ruku frame = new ruku();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	

	/**
	 * Create the frame.
	 */
	public ruku() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5546\u54C1\u5165\u5E93");
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setBounds(224, 36, 102, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u7F16\u53F7");
		label_1.setBounds(72, 143, 131, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(212, 140, 150, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u540D\u79F0");
		label_2.setBounds(72, 182, 107, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 179, 150, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u5165\u5E93\u91CF");
		label_3.setBounds(72, 218, 119, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 215, 150, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u8FDB\u4EF7");
		label_4.setBounds(96, 255, 107, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u8FDB\u4EF7");
		label_5.setBounds(95, 255, 54, 15);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 252, 150, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_6 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u96F6\u552E\u4EF7");
		label_6.setBounds(95, 289, 108, 15);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(212, 286, 150, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null,"入库成功",null,JOptionPane.PLAIN_MESSAGE);
			}
		});
		button.setBounds(201, 342, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE\u4ED3\u5E93\u4E3B\u754C\u9762");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainSurface sur = new mainSurface();
				sur.run();
				frame.dispose();
			}
		});
		button_1.setBounds(348, 448, 138, 23);
		contentPane.add(button_1);
	}
}
