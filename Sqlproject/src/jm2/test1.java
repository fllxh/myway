package jm2;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test1() {
		final Vector<String> title=new Vector<String>();
		title.add("id");
		
		title.add("商品");
		
		title.add("条码");
		title.add("规格");
		title.add("品牌");
		title.add("单位");
		Vector value=DBUtil.query();
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(33, 99, 710, 435);
		contentPane.add(table);
		final DefaultTableModel model = new DefaultTableModel(value,title);
		table.setModel(model);
		{
			if(table.getRowCount()>0)
			{
				table.setRowSelectionInterval(0, 0);
			}
			table.addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent e) {
				}
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO 自动生成的方法存根		
				}
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO 自动生成的方法存根
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO 自动生成的方法存根
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO 自动生成的方法存根
				int row=table.getSelectedRow();
				String sid=table.getValueAt(row, 0).toString();
				String sname=table.getValueAt(row, 1).toString();
				String inprice=table.getValueAt(row, 2).toString();
				String ouprice=table.getValueAt(row, 3).toString();
				String save=table.getValueAt(row, 4).toString();
				String state=table.getValueAt(row, 5).toString();
				String note=table.getValueAt(row, 6).toString();
				
				}
			});

		}
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(337, 67, 93, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(92, 68, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(619, 68, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
