package changegui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Login.logingui;
import Vip.VIPgui;
import buy.BuyGui2;
import buy.Buysearch;
import buy1.test1;
import db.DBConnection;

public class maingui extends JFrame {

	private JPanel contentPane;
	public static maingui framem = new maingui();
	/**
	 * Launch the application.
	 */
	public static void m1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					framem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void m2(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					framem.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public maingui() {

		DBConnection db=new DBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("会员服务");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VIPgui.v1(null);
			}
		});
		btnNewButton.setBounds(34, 45, 93, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 31, 142, 202);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("收银服务");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test1.t1(null);
				
			}
		});
		btnNewButton_1.setBounds(23, 59, 93, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("信息查询");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyGui2.b1(null);
			}
		});
		btnNewButton_2.setBounds(23, 102, 93, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("退货服务");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buysearch.t1(null);
			}
		});
		btnNewButton_5.setBounds(23, 148, 93, 23);
		panel.add(btnNewButton_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(162, 31, 262, 96);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("欢迎登陆");
		label.setBounds(56, 34, 150, 35);
		label.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_1.add(label);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(162, 137, 262, 96);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("连接数据库");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.getDataBaseConnection();
			}
		});
		btnNewButton_3.setBounds(10, 40, 93, 23);
		panel_2.add(btnNewButton_3);
		logingui lg=new logingui();
		JButton btnNewButton_4 = new JButton("退出登陆");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lg.l1(null);
				maingui.m2(null);
			}
		});
		btnNewButton_4.setBounds(145, 40, 93, 23);
		panel_2.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(maingui.class.getResource("/tupian/3.png")));
		lblNewLabel.setBounds(0, 10, 434, 251);
		contentPane.add(lblNewLabel);
	}
}
