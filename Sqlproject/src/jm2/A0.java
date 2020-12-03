package jm2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.logingui;

public class A0 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static A0 frame = new A0();

			public void run() {
				try {
					//A0 frame = new A0();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public A0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u540E\u53F0\u7BA1\u7406\u83DC\u5355");
		label.setFont(new Font("����", Font.PLAIN, 27));
		label.setBounds(129, 8, 199, 50);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u5546\u54C1\u7BA1\u7406");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1 frames=new A1();
				frames.run();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(68, 106, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8FDB\u8D27\u7BA1\u7406");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A2 framej=new A2();
				framej.run();
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(256, 106, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5458\u5DE5\u7BA1\u7406");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A3 framey=new A3();
				framey.run();
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(69, 166, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u5BA1\u6838\u7BA1\u7406");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A4 framesh=new A4();
				framesh.run();
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(257, 167, 93, 23);
		contentPane.add(btnNewButton_3);
		logingui lg=new logingui();
		JButton btnNewButton_4 = new JButton("\u9000\u51FA");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				lg.l1(null);
			}
		});
		btnNewButton_4.setBounds(162, 223, 93, 23);
		contentPane.add(btnNewButton_4);
	}

}
