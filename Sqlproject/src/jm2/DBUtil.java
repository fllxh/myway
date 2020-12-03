package jm2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DBUtil {
	static DBConnection db=new DBConnection();
	public static Vector query()
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

}
