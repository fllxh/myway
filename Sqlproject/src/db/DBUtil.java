package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;

import Vip.viputil;

public class DBUtil {
	static DBConnection db=new DBConnection();
	
	
	
	  public  String  denglu(String username,String password) throws SQLException {
	        
		  Connection con=db.getDataBaseConnection();
	        String sql = "select id,password from 登录表 where id=? and password=?";
	        PreparedStatement ptmt = con.prepareStatement(sql);
	        ptmt.setString(1, username);
	        ptmt.setString(2, password);
	        ResultSet rs = ptmt.executeQuery();
	        //从登录用户给出的账号密码来检测查询在数据库表中是否存在相同的账号密码
	        if (rs.next()) {
	        	JOptionPane.showMessageDialog(null, "登录成功！");
	        	String sql1 = "select type from 登录表 where id='"+username+"'";
	        	PreparedStatement ps=con.prepareStatement("select type from 登录表 where id ='"+username+"' ");
				ResultSet rs1=ps.executeQuery();
				String s = "s";
				while(rs1.next()&&rs1.getRow()>0)
				{
					
					
						
						s=	String.valueOf(rs1.getString(1));
						
					
					
				}
				
	            return s;
	        } else {
	        	JOptionPane.showMessageDialog(null, "姓名或密码错误！\n请重新登录：");
	            return null;
	            
	        }
	 
	    }
	  
	  
	  public String zhuce(String p1,String s) throws SQLException {
	        
	         DBUtil du=new DBUtil();
			 Connection conn=db.getDataBaseConnection();
		            String password = p1;
		            String sid=null;
		            String id = du.selectid();
		            int count = 0;
		            double d=0.00;
		            Statement state=null;
		            try {
		    			state = conn.createStatement();
		    		} catch (SQLException e) {
		    			// TODO Auto-generated catch block
		    			e.printStackTrace();
		    		}
		            String sql="insert into 登录表  values('"+id+"','"+p1+"','"+s+"')";
		            try {
		    			 count = state.executeUpdate(sql);
		    			 
		    			 count++;
		    		} catch (SQLException e1) {
		    			// TODO Auto-generated catch block
		    			e1.printStackTrace();
		    		}
		            if (count>0){
		            	JOptionPane.showMessageDialog(null, "注册成功\n你的账号是"+id+"\n你的密码是"+p1);
		                
		            }else {
		            	JOptionPane.showMessageDialog(null, "注册失败");
		            }
					return sid;
		            
		            
		         
		          
		            
		            
		        }
	
	  
	  public  String selectid() {
			try {
				
				Connection conn=db.getDataBaseConnection();
				PreparedStatement ps=conn.prepareStatement("select TOP 1 * from 登录表  order by id desc");
				ResultSet rs=ps.executeQuery();
				String s=new String();
				while(rs.next()&&rs.getRow()>0)
				{
					
					for(int col=1;col<=4;col++)
					{
						if(col==1)
						 s=rs.getString(col);
						
					}
					int i = Integer.parseInt( s.trim() ); 
					i++;
					String str = String.format("%05d", i); 
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
	
	
	public static Vector query(String s)
    {
  	  try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 小票信息表 where 会员号 ='"+s+"' ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()&&rs.getRow()>0)
			{
				Vector row=new Vector();
				for(int col=1;col<=7;col++)
				{
					if(col!=3&&col!=4)
					{
						row.add(String.valueOf(rs.getString(col)));
					}
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
	
	
	
	public static Vector querys(String s)
    {
  	  try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 小票信息表 where 小票编号 ='"+s+"' ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()&&rs.getRow()>0)
			{
				Vector row=new Vector();
				for(int col=1;col<=7;col++)
				{
					if(col!=3&&col!=4)
					{
						row.add(String.valueOf(rs.getString(col)));
					}
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
	
	public static Vector query1()
    {
  	  try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 商品信息表 ");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()&&rs.getRow()>0)
			{
				Vector row=new Vector();
				for(int col=1;col<=rs.getMetaData().getColumnCount();col++)
				{
					if(col==1||col==2||col==5)
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
	
	public  Vector rowline(int s,int t)
    {int b=0;
  	  try {
  		Vector row=new Vector();
		Connection conn=db.getDataBaseConnection();
  		  
  		PreparedStatement ps1=conn.prepareStatement("select *  from 商品销售表  where 商品编号="+s+" ");
		ResultSet rs1=ps1.executeQuery();
		String sname = null;
		
		while(rs1.next()&&rs1.getRow()>0)
		{
			
		
				
			sname=String.valueOf(rs1.getString(2));
			b=rs1.getInt(2)	;	
				
			
	
		}
			PreparedStatement ps=conn.prepareStatement("select * from 商品信息表  where 商品编号="+s+" ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()&&rs.getRow()>0)
			{
				for(int col=1;col<=2;col++)
				{
						row.add(String.valueOf(rs.getString(col)));
					
				}
				
			}
			row.add(sname);
			row.add(t);
			row.add(t*b);
			int summ=t*b;
			return row;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
			return null;
		}
    }
	
	public static int sunm1()
    {
		int sum = 0;
  	  try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 商品信息表 ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()&&rs.getRow()>0)
			{
				Vector row=new Vector();
				for(int col=1;col<=rs.getMetaData().getColumnCount();col++)
				{
					if(col==1||col==2||col==5)
						row.add(String.valueOf(rs.getString(col)));
					
				}
				vector.add(row);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
			return sum;
		}
	return sum;
    }
	
	
	public  int selectname2(String s) {
		try {
			Vector vector=new Vector();
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select * from 会员信息表 where 会员卡号='"+s+"'");
			ResultSet rs=ps.executeQuery();
			Vector row=new Vector();
			while(rs.next()&&rs.getRow()>0)
			{
				
				for(int col=1;col<=4;col++)
				{
					
						row.add(String.valueOf(rs.getString(col)));
					
				}
				
			}
			if(row.elementAt(1)!=null)
			return 1;
			
				return 0;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "会员账号错误");
			
			return 0;
		}
		
	}
	
	public String xinsert(String vip,int n) throws SQLException {
        
		DBUtil du=new DBUtil();
		 Connection conn=db.getDataBaseConnection();
		 String sid=du.getspid();
	         
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
	            double needpay=n;
	            double countdsc=0;
	            if(vip.trim().equals(""))
	            {
	            	vip="";
	            	needpay=n;
	            }
	            else
	            {
	            	needpay= (needpay*0.99);
	            	countdsc= (n*0.01);
	            }
	            String sql="insert into 小票信息表  values('"+sid+"','"+vip+"',"+n+","+countdsc+","+needpay+",null,null,null,null)";
	            try {
	    			 count = state.executeUpdate(sql);
	    			 
	    			 count++;
	    		} catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	            if (count>0){
	            	JOptionPane.showMessageDialog(null, "小票结算中");
	                return sid;
	            }else {
	            	JOptionPane.showMessageDialog(null, "错误请重启");
	            	return null;
	            }
	            
	            
	         
	          
	            
	            
	        }
	 
	
	
	
	
	public void addsid(int n,String sid) {
		DBUtil du=new DBUtil();
		 Connection con=db.getDataBaseConnection();
    	Statement stmt=null;
    	ResultSet rs=null;	
    	double pay=du.searchneedpay(sid);
    	double paback=n-pay;
    	String time=du.gettime();
  		try {
  			stmt=con.createStatement();
  			stmt.executeUpdate("update 小票信息表 set 实付= "+n+", 找零="+paback+",日期='"+time+"',收银员编号=10001 where 小票编号 = '"+sid+"'"  );
  			
  		} catch (SQLException e) {
  			// TODO Auto-generated catch block
  			JOptionPane.showMessageDialog(null, "失败!");
  			e.printStackTrace();
  		}
      }
	
	
	public static double searchneedpay(String s)
    {
  	  try {
			
			Connection conn=db.getDataBaseConnection();
			PreparedStatement ps=conn.prepareStatement("select 应付 from 小票信息表 where 小票编号 = '"+s+"' ");
			ResultSet rs=ps.executeQuery();
			Double needpay=(double) 0;
			while(rs.next()&&rs.getRow()>0)
			{
				
				for(int col=1;col<=rs.getMetaData().getColumnCount();col++)
				{
					
						
						needpay = Double.parseDouble(rs.getString(col));
				}
				
			}
			return needpay;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
			return 0.00;
		}
    }
	
	
	
	
	
public void xdinsert(String sid,String gid,double price,int number) throws SQLException {
        
		DBUtil du=new DBUtil();
		 Connection conn=db.getDataBaseConnection();
		 
	            int count = 0;
	           
	            Statement state=null;
	            try {
	    			state = conn.createStatement();
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	            String sql="insert into 小票清单信息表  values('"+sid+"','"+gid+"',"+price+","+number+")";
	            try {
	    			 count = state.executeUpdate(sql);
	    			 
	    			 count++;
	    		} catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	            if (count>0){
	            	
	              
	            }else {
	            	JOptionPane.showMessageDialog(null, "注册失败");
	            	
	            }

	        }
	
	


public static Vector details(String s) {
	try {
		Vector vector=new Vector();
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 小票清单信息表 where 小票编号 ='"+s+"' ");
		ResultSet rs=ps.executeQuery();
		
		DBUtil du=new DBUtil();
	
		
		while(rs.next()&&rs.getRow()>0)
		{	
			Vector row=new Vector();
			String name1=du.selectgoodname(String.valueOf(rs.getString(2)));
			row.add(name1);
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



public String selectpay(String s) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 小票信息表  where 小票编号='"+s+"' ");
		ResultSet rs=ps.executeQuery();
		
		String s1=new String();
		while(rs.next()&&rs.getRow()>0)
		{
			
			String vip=String.valueOf(rs.getString(6));
				
			
			 
			return vip;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		return null;
	}
	return null;
	
}


public String selectgoodname(String id) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 商品信息表 where 商品编号='"+id+"'");
		ResultSet rs=ps.executeQuery();
		String s=new String();
		while(rs.next()&&rs.getRow()>0)
		{
			
			for(int col=1;col<=4;col++)
			{
				if(col==2)
				 s=rs.getString(col);
				
			}
			 
			return s;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		return "x";
	}
	return "";
	
}



public double detle1(String s,String gid) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 小票清单信息表 where 小票编号 ='"+s+"' and 商品编号='"+gid+"'");
		ResultSet rs=ps.executeQuery();
		String s1=new String();
		while(rs.next()&&rs.getRow()>0)
		{
			
			
				
			double price = rs.getDouble(3); 
			int number = rs.getInt(4); 
			double sum=price*number;
			 
			return sum;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		return 0.00;
	}
	return 0.00;
	
}


public String detle2(String s) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 小票信息表  where 小票编号='"+s+"' ");
		ResultSet rs=ps.executeQuery();
		
		String s1=new String();
		while(rs.next()&&rs.getRow()>0)
		{
			
			String vip=String.valueOf(rs.getString(2));
				
			
			 
			return vip;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		return null;
	}
	return null;
	
}

public void detle3(String s,String gid) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("delete from 小票清单信息表 where 小票编号 ='"+s+"' and 商品编号='"+gid+"'");
		ps.execute();
		
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		
	}
	
	
}

public void detle4(String s,String gid) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps2=conn.prepareStatement("update 小票信息表 set 实付=0 where 小票编号='"+s+"'  ");
		ps2.execute();
		
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		
	}
	
	
}

public void detle5(double sum,String vip) {
	try {
	
		Connection conn=db.getDataBaseConnection();
		
		
		PreparedStatement ps3=conn.prepareStatement("update 会员信息表 set 消费总额=消费总额-"+sum+" where 会员卡号='"+vip+"'  ");
		ps3.execute();
			
		
		JOptionPane.showMessageDialog(null, "退货成功");
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "删除失败");
		e.printStackTrace();
		return;
	}
	
}


public void detlesum(String s,String gid) {
	
	
		Connection conn=db.getDataBaseConnection();
		DBUtil du=new DBUtil();
		double sum=du.detle1(s, gid);
		String vip=du.detle2(s);
		du.detle3(s, gid);
		du.detle4(s, gid);
		du.detle5(sum, vip);
		
	
	
}


public String senameid(String s) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 员工信息表  where 员工姓名='"+s+"' ");
		ResultSet rs=ps.executeQuery();
		
		String s1=new String();
		while(rs.next()&&rs.getRow()>0)
		{
			
			String vip=String.valueOf(rs.getString(1));
				
			
			 
			return vip;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		return null;
	}
	return null;
	
}


public String selecttype(String s) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps=conn.prepareStatement("select * from 登录表  where id='"+s+"' ");
		ResultSet rs=ps.executeQuery();
		
		String s1=new String();
		while(rs.next()&&rs.getRow()>0)
		{
			
			String vip=String.valueOf(rs.getString(3));
				
			
			 
			return vip;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		return null;
	}
	return null;
	
}


public void updatep(String s,String p) {
	try {
		
		Connection conn=db.getDataBaseConnection();
		PreparedStatement ps2=conn.prepareStatement("update 登录表 set password='"+p+"' where id='"+s+"'  ");
		ps2.execute();
		JOptionPane.showMessageDialog(null, "修改成功");
		
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "查询失败");
		e.printStackTrace();
		
	}
	
	
}

public String toString(String sid){
    StringBuilder sb = new StringBuilder();
    
    Connection conn=db.getDataBaseConnection();
    DBUtil du=new DBUtil();
    try {
		Vector vector=new Vector();
		
		PreparedStatement ps=conn.prepareStatement("select * from 小票清单信息表 where 小票编号 ='"+sid+"' ");
		ResultSet rs=ps.executeQuery();
		
		
	
		sb.append("***********************消费单*********************").append("\n")
        .append("编号\t单价     数量     金额\t名称").append("\n");
		while(rs.next()&&rs.getRow()>0)
		{	
			Double needpay=(double) 0;
			
			for(int col=2;col<=4;col++)
			{
				
				sb.append(String.format("%1$-10s",String.valueOf(rs.getString(col).trim())));
					
			}

			
			String name1=du.selectgoodname(String.valueOf(rs.getString(2)));
			needpay=rs.getDouble(3)*rs.getInt(4);
			sb.append(needpay+"  ");
			sb.append(String.format("%1$-20s",name1.trim())).append("\n");
		}
		
		}
		 catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "查询失败");
				e.printStackTrace();
			
			}
		
    sb.append("\n");
    sb.append("----------------------------------------------").append("\n");
    sb.append("小票编号            会员号       总金额     优惠        应付         实付\t  找零     日期\t\t   操作员").append("\n");
try {
			
			PreparedStatement ps1=conn.prepareStatement("select * from 小票信息表 where 小票编号 = '"+sid+"' ");
			ResultSet rs1=ps1.executeQuery();
			
			while(rs1.next()&&rs1.getRow()>0)
			{
				
				for(int col=1;col<=rs1.getMetaData().getColumnCount();col++)
				{
					
						
						sb.append(rs1.getString(col).trim()).append("  ");
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "查询失败");
			e.printStackTrace();
		
		}
    
            return sb.toString();
}



	
public String getspid() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmms");//设置日期格式
		
	
		
		
		return df.format(new Date());
	}
	public String gettime() {
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date());
	}

}
