package Vip;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import changegui.maingui;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VIPgui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static VIPgui frame3 = new VIPgui();
	/**
	 * Launch the application.
	 */
	public static void v1(String[] args) {
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
	public static void v2(String[] args) {
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
	public VIPgui() {
		viputil v1=new viputil();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 22, 144, 214);
		panel.setBorder(new TitledBorder(null, "注册界面", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(39, 70, 66, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(39, 151, 66, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("姓名");
		label.setBounds(51, 47, 54, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(51, 126, 54, 15);
		panel.add(label_1);
		
		JButton btnNewButton = new JButton("建立");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textField_1.getText();
				String s2=textField.getText();
				try {
					v1.zhuce(s,s2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(194, 90, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VIPgui.v2(null);
			}
		});
		btnNewButton_1.setBounds(246, 213, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("查询");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vipsearch.t1(null);
			}
		});
		btnNewButton_2.setBounds(312, 90, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(175, 49, 249, 87);
		panel_1.setBorder(new TitledBorder(null, "会员服务", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VIPgui.class.getResource("/tupian/3.png")));
		lblNewLabel.setBounds(0, 10, 424, 241);
		contentPane.add(lblNewLabel);
	}

}
