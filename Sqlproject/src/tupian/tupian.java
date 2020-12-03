package tupian;
import javax.swing.*;
public class tupian {
	
	
		static public void main(String args[])
		{
			JFrame frame;
			frame=new JFrame();
			frame.setBounds(0,0,600,600);
			ImageIcon image=new ImageIcon("1.PNG");
			JLabel label=new JLabel(image);
			frame.setLayout(null);
			frame.add(label);
			label.setBounds(0,0,500,312);
			frame.setVisible(true);
			frame.setResizable(false);
			javax.swing.ImageIcon icon = new javax.swing.ImageIcon("/1.png");//可选择本地图片
			javax.swing.JLabel jla= new javax.swing.JLabel(icon);
			java.awt.Dimension dm0=new java.awt.Dimension(280,200);
			
		}
	}


