package Vip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;

import db.DBConnection;

public class viputil {
	static DBConnection db=new DBConnection();
	public static Vector selectname(String s) {
		try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 会员信息表 where 会员姓名='"+s+"'");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()&&rs.getRow()>0)
			{
				Vector row=new Vector();
				for(int col=1;col<=4;col++)
				{
					
						row.add(String.valueOf(rs.getString(col)));
					
				}
				vector.add(row);
			}
			return vector;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public static Vector selectname1(String s) {
		try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 会员信息表 where 会员卡号="+s+"");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()&&rs.getRow()>0)
			{
				Vector row=new Vector();
				for(int col=1;col<=4;col++)
				{
					
						row.add(String.valueOf(rs.getString(col)));
					
				}
				vector.add(row);
			}
			return vector;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static String selectid() {
		try {
			
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select TOP 1 * from 会员信息表 order by 会员卡号 desc");
			ResultSet rs=ps.executeQuery();
			String s=new String();
			while(rs.next()&&rs.getRow()>0)
			{
				
				for(int col=1;col<=4;col++)
				{
					if(col==1)
					 s=rs.getString(col);
					
				}
				int i = Integer.parseInt( s ); 
				i++;
				String str = String.format("%07d", i); 
				return str;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
			return null;
		}
		return null;
		
	}
	
	 public void zhuce(String p1,String username) throws SQLException {
	        
	         
		 Connection conn=db.getDataBaseConnection();
	            String password = p1;
	            String id = viputil.selectid();
	            int count = 0;
	            double d=0.00;
	            Statement state=null;
	            try {
	    			state = conn.createStatement();
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	            String sql="insert into 会员信息表  values('"+id+"','"+username+"',"+d+",'"+p1+"',null)";
	            try {
	    			 count = state.executeUpdate(sql);
	    			 
	    			 count++;
	    		} catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	            if (count>0){
	            	JOptionPane.showMessageDialog(null, "注册成功\n你的会员号为："+id);
	                
	            }else {
	            	JOptionPane.showMessageDialog(null, "注册失败");
	            }
	            
	            
	         
	          
	            
	            
	        }
	 
	    }

