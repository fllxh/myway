package jm2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	static A2 frame = new A2();
			public void run() {
				try {
					//A2 frame = new A2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public A2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8FDB\u8D27\u8BA1\u5212");
		label.setFont(new Font("宋体", Font.PLAIN, 27));
		label.setBounds(309, 0, 157, 88);
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 163, 281, 316);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(415, 300, 306, 179);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnNewButton = new JButton("\u67E5\u770B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.append("商品编号     商品名称                             商品单价     商品库存\r\n" + 
						"10060          谷维素片（乙类）            1.5000         415\r\n" + 
						"13742          香脆腰果饼                        3.5000         210\r\n" + 
						"14334          乐而雅日网丝薄                5.0000         192\r\n" + 
						"14801          达葵家乡鸡味薯片            3.5000         337\r\n" + 
						"14829          乐事牛肉味薯片                3.5000         96\r\n" + 
						"15870          惠通香辣三丝                    7.0000         104\r\n" + 
						"15897          达葵草莓威化                    5.5000         210\r\n" + 
						"15964          陈村粉鱼香肉丝面            3.0000         106\r\n" + 
						"15968          乐事蕃茄味薯片                3.5000         77\r\n" + 
						"16030          苏珍丝印雨伞                    16.0000       26\r\n" + 
						"16049          丽丽蕃茄味薯片                4.0000         223\r\n" + 
						"16063          思高海棉百洁布                20.0000       97\r\n" + 
						"17069          丽丽烧肉味薯片                4.0000         117\r\n" + 
						"17084          玛丽办公硬抄                    2.5000         210\r\n" + 
						"18094           喜力啤酒                           24.0000       46\r\n" + 
						"19130           碧柔深层透亮洗面乳       55.0000       21\r\n" + 
						"19168           好吃点消化饼                   5.5000         396\r\n" + 
						"19178           好吃点腰果饼                   5.5000         317\r\n" + 
						"19180           金牌卷心酥                       7.5000         119");
			}
		});
		btnNewButton.setBounds(234, 107, 93, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(433, 136, 157, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(433, 191, 157, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u786E\u5B9A");
		btnNewButton_1.setBounds(626, 190, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u5546\u54C1\u7F16\u53F7");
		lblNewLabel.setBounds(433, 111, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8FDB\u8D27\u4EF6\u6570");
		lblNewLabel_1.setBounds(433, 167, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4EA7\u770B\u7F3A\u8D27\u5546\u54C1");
		lblNewLabel_2.setBounds(80, 111, 93, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("\u67E5\u770B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					textArea_1.setText("");
					textArea_1.append("商品编号     商品名称                             进货数量\r\n" + 
							"13742         香脆腰果饼                         500\r\n" + 
							"14829         乐事牛肉味薯片                 500\r\n" + 
							"15964         陈村粉鱼香肉丝                 400\n");
				}
				if(textField.getText().equals("16030")) {
					textArea_1.setText("");
					textArea_1.append("商品编号     商品名称                             进货数量\r\n" + 
							"13742         香脆腰果饼                         500\r\n" + 
							"14829         乐事牛肉味薯片                 500\r\n" + 
							"15964         陈村粉鱼香肉丝                 400\r\n" + 
							"16030         苏珍丝印雨伞                     200");
				}
				if(textField.getText().equals("18094")) {
					textArea_1.setText("");
					textArea_1.append("商品编号     商品名称                             进货数量\r\n" + 
							"13742         香脆腰果饼                         500\r\n" + 
							"14829         乐事牛肉味薯片                 500\r\n" + 
							"15964         陈村粉鱼香肉丝                 400\r\n" + 
							"16030         苏珍丝印雨伞                     200\r\n" + 
							"18094         喜力啤酒                             300");
				}
			}
		});
		btnNewButton_2.setBounds(626, 257, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel label_1 = new JLabel("\u4EA7\u770B\u8FDB\u8D27\u8BA1\u5212");
		label_1.setBounds(448, 261, 93, 15);
		contentPane.add(label_1);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A0 framea=new A0();
				framea.run();
				frame.dispose();
			}
		});
		button.setBounds(465, 38, 93, 23);
		contentPane.add(button);
		
		
	}
}
