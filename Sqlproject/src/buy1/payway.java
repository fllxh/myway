package buy1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import db.DBUtil;
import xsl.filetet;

public class payway extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JPanel panel_1;
	private JButton btnNewButton;
	static JTextField textField;
	private JTextField textField_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnNewButton_1;
	static payway frame1 = new payway();
	/**
	 * Launch the application.
	 */
	static int sum1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_2;
	public static  void runa(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sum1=test1.sum;
					
					frame1 = new payway();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static  void runb(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public payway() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 134, 854, 420);
		panel.setBorder(new TitledBorder(null, "扫码付款", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 35, 434, 385);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(payway.class.getResource("/tupian/1.png")));
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(454, 35, 365, 354);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(payway.class.getResource("/tupian/2.png")));
		
		label_1 = new JLabel("微信");
		label_1.setBounds(629, 10, 54, 15);
		panel.add(label_1);
		
		label = new JLabel("支付宝");
		label.setBounds(168, 10, 54, 15);
		panel.add(label);
		
		panel_1 = new JPanel();
		panel_1.setBounds(42, 31, 589, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		
		
		textField = new JTextField();
		textField.setBounds(74, 37, 66, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 37, 66, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		
		label_2 = new JLabel("应付");
		label_2.setBounds(10, 40, 54, 15);
		panel_1.add(label_2);
		
		label_3 = new JLabel("实付");
		label_3.setBounds(206, 40, 54, 15);
		panel_1.add(label_3);
		
		btnNewButton = new JButton("支付完成");
		btnNewButton.setBounds(465, 36, 93, 23);
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("返回");
		btnNewButton_1.setBounds(705, 89, 93, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("刷新");
		btnNewButton_2.setBounds(705, 45, 93, 23);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(payway.class.getResource("/tupian/4.png")));
		lblNewLabel_2.setBounds(0, 6, 864, 536);
		contentPane.add(lblNewLabel_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(String.valueOf(sum1));
				
				
			}
		});
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test1 t1=new test1();
				sum1=0;
				test1.sum=0;
				t1.t1(null);
				payway.runb(null);
				
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBUtil du=new DBUtil();
				filetet fi=new filetet();
				int b=0;
				 b = Integer.valueOf(textField_1.getText()).intValue();
				 int c=b-sum1;
				 du.addsid(b, test1.sid);
				 String s=du.toString(test1.sid);
				 fi.test(s);
				JOptionPane.showMessageDialog(null, "小票号"+test1.sid+"\n找零"+c);
				
			}
		});
		
		
	}
}
