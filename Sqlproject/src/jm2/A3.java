package jm2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	static A3 frame = new A3();
			public void run() {
				try {
					//A3 frame = new A3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public A3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5458\u5DE5\u7BA1\u7406");
		label.setFont(new Font("����", Font.PLAIN, 27));
		label.setBounds(257, 0, 141, 115);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(71, 129, 129, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(438, 157, 121, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 206, 302, 249);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					textArea.setText("");
					textArea.append("Ա�����     ְ��               ����       �Ա�     ����        ����                      ��ϵ�绰\r\n" + 
							"10002         ǰ̨����Ա   ���ִ�	��          20	4000.0000          18162014041    \r\n" + 
							"10003         ǰ̨����Ա   �ִ�	��          22	4000.0000          18162014042    \r\n" + 
							"10004         ǰ̨����Ա   �߸�	��          20	4000.0000          18162014043    \r\n" + 
							"10005         ǰ̨����Ա   �ζ�	��          22	4000.0000          18162014044    \r\n" + 
							"10006         ǰ̨����Ա   ʷ��	��          20	4000.0000          18162014045    \r\n" + 
							"10007         ǰ̨����Ա   �޴�	��          20	4000.0000          18162014046    \r\n" + 
							"10008         ǰ̨����Ա   ���	��          20	4000.0000          18162014047    \r\n" + 
							"10009         ǰ̨����Ա   ̷��	��          20	4000.0000          18162014048    \r\n" + 
							"10010         ǰ̨����Ա   Ҷ����	��          20	4000.0000          18162014049    \r\n" + 
							"10011         ��̨����Ա   �طܷ�	��          20	4000.0000          18162014050    \r\n" + 
							"10012         ��̨����Ա   �ΰ�	��          20	4000.0000          18162014051    \r\n" + 
							"10013         ��̨����Ա   �¹��	��          20	4000.0000          18162014052    \r\n" + 
							"10014         ��̨����Ա   ����	��          20	4000.0000          18162014053\r\n" + 
							"10015         ��̨����Ա   л�ⶬ	��          20	4000.0000          18162014054\r\n" + 
							"10016         �־���           �Ƹ�	��          20	6000.0000          13807052404    \r\n" + 
							"10017         �־���           �ص���	��          20	6000.0000          13807052403    \r\n" + 
							"10018         ���þ���       ʷ����	��          20	8000.0000          13807052402    \r\n" + 
							"10019         �ܾ���           ����	��          20	10000.0000        13807052401    ");
				}
				if(textField.getText().equals("10003")) {
					textArea.setText("");
					textArea.append("Ա�����     ְ��               ����       �Ա�     ����        ����                      ��ϵ�绰\r\n" + 
							"10003         ǰ̨����Ա   �ִ�	��          22	4000.0000          18162014042    ");
				}
				if(textField.getText().equals("10011")) {
					textArea.setText("");
					textArea.append("Ա�����     ְ��               ����       �Ա�     ����        ����                      ��ϵ�绰\r\n" + 
							"10011         ��̨����Ա   �طܷ�	��          20	4000.0000          18162014050    ");
				}
				if(textField.getText().equals("10016")) {
					textArea.setText("");
					textArea.append("Ա�����     ְ��               ����       �Ա�     ����        ����                      ��ϵ�绰\r\n" + 
							"10016         �־���           �Ƹ�	��          20	6000.0000          13807052404    ");
				}
				if(textField.getText().equals("10019")) {
					textArea.setText("");
					textArea.append("Ա�����     ְ��               ����       �Ա�     ����        ����                      ��ϵ�绰\r\n" + 
							"10019         �ܾ���           ����	��          20	10000.0000        13807052401    ");
				}
			}
		});
		btnNewButton.setBounds(257, 128, 93, 23);
		contentPane.add(btnNewButton);
		
		JLabel label_1 = new JLabel("\u5458\u5DE5\u7F16\u53F7");
		label_1.setBounds(71, 104, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5458\u5DE5\u4FE1\u606F");
		label_2.setBounds(71, 181, 54, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(438, 213, 121, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(438, 269, 121, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(438, 331, 121, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(438, 431, 129, 24);
		contentPane.add(textArea_1);
		
		JButton button = new JButton("\u63D0\u4EA4\u7533\u8BF7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_4.getText().equals("")) {
					textArea_1.setText("");
					textArea_1.append("         ��Ϣ��ȫ\n");
				}
				if(textField_4.getText().equals("12312341234")) {
					textArea_1.setText("");
					textArea_1.append("         ����ɹ�\n");
				}
			}
		});
		button.setBounds(452, 376, 93, 23);
		contentPane.add(button);
		
		JLabel label_3 = new JLabel("\u62DB\u8058\u4FE1\u606F");
		label_3.setBounds(468, 104, 54, 15);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setBounds(468, 132, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5E74\u9F84");
		lblNewLabel_1.setBounds(468, 188, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6027\u522B");
		lblNewLabel_2.setBounds(468, 244, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel label_4 = new JLabel("\u7535\u8BDD");
		label_4.setBounds(468, 306, 54, 15);
		contentPane.add(label_4);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A0 framea=new A0();
				framea.run();
				frame.dispose();
			}
		});
		button_1.setBounds(397, 51, 93, 23);
		contentPane.add(button_1);
		
	}
}
