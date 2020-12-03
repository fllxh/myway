package Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import back.back;
import changegui.maingui;
import db.DBConnection;
import db.DBUtil;
import directorGZK.Main1;
import jm2.Main2;



public class logingui extends JFrame {
	private JPanel contentPane1;
	private JTextField textField;
	private JTextField textField_1;
	static logingui framelg = new logingui();


	/**
	 * Launch the application.
	 */
	public static void l1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					framelg.setVisible(true);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void l2(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					framelg.setVisible(false);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public logingui() {
DBUtil du=new DBUtil();
		
		
		setTitle("登录界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 424);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.CYAN);
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("数据库");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("连接");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=DBConnection.getDataBaseConnection();
				if(con!=null) {
					JOptionPane.showMessageDialog(null, "Database Connect Successfully!");
				}
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("断开");
		menu.add(menuItem_1);
		contentPane1 = new JPanel();
		contentPane1.setBackground(Color.WHITE);
		contentPane1.setForeground(Color.WHITE);
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(273, 153, 130, 26);
		contentPane1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(273, 189, 130, 26);
		contentPane1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("登录");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back bk=new back();
				Main2 m2=new Main2();
				String s=textField.getText();
				String s1=textField_1.getText();
				String type=null;
				try {
					type=du.denglu(s, s1).trim();
					System.out.println(type);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(type);
				if(type.equals("前台"))
				{	
				maingui.framem.setVisible(true);
				
				logingui.l2(null);
				
				}
				else if(type.equals("特殊")) {
					bk.b1(null);
					logingui.l2(null);
				}
				else if(type.equals("其他")) {
					m2.main2(null);
					logingui.l2(null);
				}
				else if(type.equals("仓库")) {
					Main1.main1(null);
					logingui.l2(null);
				}
				
				}
			});
		button.setBackground(Color.WHITE);
		button.setBounds(307, 288, 68, 26);
		contentPane1.add(button);
		
		
		JLabel label = new JLabel("帐号");
		label.setBounds(190, 157, 61, 16);
		contentPane1.add(label);
		
		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(190, 193, 61, 16);
		contentPane1.add(label_1);
		
		JLabel label_2 = new JLabel("超市管理系统");
		label_2.setFont(new Font("Wawati TC", Font.PLAIN, 25));
		label_2.setBounds(264, 92, 160, 26);
		contentPane1.add(label_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(logingui.class.getResource("/tupian/3.png")));
		lblNewLabel.setBounds(0, 0, 646, 372);
		contentPane1.add(lblNewLabel);
	}

}
