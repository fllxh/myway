package directorGZK;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.logingui;

public class mainSurface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static mainSurface frame = new mainSurface();
	
			public void run() {
				try {
					//mainSurface frame = new mainSurface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public mainSurface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u4ED3\u5E93\u7CFB\u7EDF");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(223, 32, 112, 55);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u60A8\u8981\u8FDB\u884C\u7684\u64CD\u4F5C");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setBounds(22, 135, 155, 18);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("\u5165\u5E93");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ruku frameru=new ruku();
				frameru.run();
				frame.dispose();
			}
		});
		button.setBounds(218, 177, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u51FA\u5E93");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chuku framechu=new chuku();
				framechu.run();
				frame.dispose();
			}
		});
		button_1.setBounds(218, 235, 93, 23);
		contentPane.add(button_1);
		logingui lg=new logingui();
		JButton button_2 = new JButton("\u67E5\u8BE2\u5E93\u5B58");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chaxun framecha=new chaxun();
				
				framecha.run();
				//framecha.clean();
				frame.dispose();
				
			}
		});
		button_2.setBounds(218, 287, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u8FD4\u56DE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lg.l1(null);
				frame.setVisible(false);
			}
		});
		button_3.setBounds(218, 399, 93, 23);
		contentPane.add(button_3);
	}
}
