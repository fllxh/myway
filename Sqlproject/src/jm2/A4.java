package jm2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	static A4 frame = new A4();
			public void run() {
				try {
					//A4 frame = new A4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public A4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5BA1\u6838\u7BA1\u7406");
		label.setFont(new Font("����", Font.PLAIN, 27));
		label.setBounds(321, 10, 153, 79);
		contentPane.add(label);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 134, 324, 206);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(425, 134, 322, 206);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(111, 370, 93, 23);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(498, 370, 93, 21);
		contentPane.add(textArea_3);
		
		JButton button = new JButton("\u8FDB\u8D27\u7533\u8BF7\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					textArea.setText("");
					textArea.append("������    ��Ʒ���     ��Ʒ����                             ��������         ������\r\n" + 
							"001             13742         ���������                         500                  ͨ��\r\n" + 
							"002             14829         ����ţ��ζ��Ƭ                 500                  ��\r\n" + 
							"003             15964         �´��������˿                 400                  ͨ��\r\n" + 
							"004             16030         ����˿ӡ��ɡ                     200                  ��\r\n" + 
							"005             18094         ϲ��ơ��                             300                  ��");
				}
				if(textField.getText().equals("004")) {
					textArea.setText("");
					textArea.append("������    ��Ʒ���     ��Ʒ����                             ��������         ������\r\n" + 
							"001             13742         ���������                         500                  ͨ��\r\n" + 
							"002             14829         ����ţ��ζ��Ƭ                 500                  ��\r\n" + 
							"003             15964         �´��������˿                 400                  ͨ��\r\n" + 
							"004             16030         ����˿ӡ��ɡ                     200                  ��\r\n" + 
							"005             18094         ϲ��ơ��                             300                  ��");
				}
				if(textField.getText().equals("005")) {
					textArea.setText("");
					textArea.append("������    ��Ʒ���     ��Ʒ����                             ��������         ������\r\n" + 
							"001             13742         ���������                         500                  ͨ��\r\n" + 
							"002             14829         ����ţ��ζ��Ƭ                 500                  ��\r\n" + 
							"003             15964         �´��������˿                 400                  ͨ��\r\n" + 
							"004             16030         ����˿ӡ��ɡ                     200                  ��\r\n" + 
							"005             18094         ϲ��ơ��                             300                  ͨ��");
				}
			}
		});
		button.setBounds(139, 101, 122, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u62DB\u8058\u7533\u8BF7\u67E5\u8BE2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("")) {
					textArea_1.setText("");
					textArea_1.append("������     ����         ����      �Ա�       �绰                     ������\r\n" + 
							"001              ̷��         20         ��           18162014048    ͨ��\r\n" + 
							"002              Ҷ����     20         ��           18162014049    ͨ��\r\n" + 
							"003              ����         30         ��           18160231896    ��\r\n" + 
							"004              ����         20         ��           12312341234    ��");
				}
				if(textField_1.getText().equals("003")) {
					textArea_1.setText("");
					textArea_1.append("������     ����         ����      �Ա�       �绰                     ������\r\n" + 
							"001              ̷��         20         ��           18162014048    ͨ��\r\n" + 
							"002              Ҷ����     20         ��           18162014049    ͨ��\r\n" + 
							"003              ����         30         ��           18160231896    �ܾ�\r\n" + 
							"004              ����         20         ��           12312341234    ��");
				}
				if(textField_1.getText().equals("004")) {
					textArea_1.setText("");
					textArea_1.append("������     ����         ����      �Ա�       �绰                     ������\r\n" + 
							"001              ̷��         20         ��           18162014048    ͨ��\r\n" + 
							"002              Ҷ����     20         ��           18162014049    ͨ��\r\n" + 
							"003              ����         30         ��           18160231896    �ܾ�\r\n" + 
							"004              ����         20         ��           12312341234    ͨ��");
				}
			}
		});
		button_1.setBounds(518, 101, 122, 23);
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(42, 414, 144, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u540C\u610F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textArea_2.setText("");
					textArea_2.append("    �����ɹ�");
			}
		});
		btnNewButton.setBounds(236, 370, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5426\u51B3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("001")) {
					textArea_2.setText("");
					textArea_2.append("    ����ʧ��");
				}
				else {
					textArea_2.setText("");
					textArea_2.append("    �����ɹ�");
				}
			}
		});
		btnNewButton_1.setBounds(236, 413, 93, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(425, 414, 153, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\u540C\u610F");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_3.setText("");
				textArea_3.append("    �����ɹ�");
			}
		});
		btnNewButton_2.setBounds(623, 370, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u5426\u51B3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("001")) {
					textArea_3.setText("");
					textArea_3.append("    ����ʧ��");
				}
				else {
					textArea_3.setText("");
					textArea_3.append("    �����ɹ�");
				}
			}
		});
		btnNewButton_3.setBounds(623, 413, 93, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel label_1 = new JLabel("\u7533\u8BF7\u7F16\u53F7");
		label_1.setBounds(42, 374, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u7533\u8BF7\u7F16\u53F7");
		label_2.setBounds(425, 374, 54, 15);
		contentPane.add(label_2);
		
		JButton button_2 = new JButton("\u8FD4\u56DE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A0 framea=new A0();
				framea.run();
				frame.dispose();
			}
		});
		button_2.setBounds(467, 43, 93, 23);
		contentPane.add(button_2);
		
		
		
	}

}
