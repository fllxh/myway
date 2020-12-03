package back;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Login.logingui;
import db.DBUtil;

public class back extends JFrame {
	public static back frame = new back();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void b1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
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
					
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public back() {
		
		
		DBUtil du=new DBUtil();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(55, 79, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 54, 133, 163);
		panel.setBorder(new TitledBorder(null, "注册", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("密码");
		label.setBounds(46, 10, 54, 15);
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(34, 106, 69, 21);
		comboBox.setModel(new DefaultComboBoxModel(type.values()));
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(192, 54, 152, 163);
		contentPane.add(panel_1);
		panel_1.setBorder(new TitledBorder(null, "修改", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(43, 28, 66, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(43, 114, 66, 21);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("账号");
		label_1.setBounds(55, 10, 54, 15);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("新密码");
		label_2.setBounds(55, 97, 54, 15);
		panel_1.add(label_2);
		
		
		
		
		JButton btnNewButton = new JButton("执行");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1=textField.getText();
				String s= comboBox.getSelectedItem().toString();
				try {
					du.zhuce(p1, s);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(46, 227, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("执行");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField_2.getText();
				String p=textField_3.getText();
				if(s.equals("00001"))
					JOptionPane.showMessageDialog(null, "不允许修改");
				else
				du.updatep(s, p);
			}
		});
		btnNewButton_1.setBounds(218, 227, 93, 23);
		contentPane.add(btnNewButton_1);
		logingui lg=new logingui();
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lg.l1(null);
				back.b2(null);
			}
		});
		btnNewButton_2.setBounds(251, 310, 93, 23);
		contentPane.add(btnNewButton_2);
	}

}
