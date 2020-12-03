package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnection {
	static Connection con;
	public static void main(String []args)
	{
		DBConnection db=new DBConnection();
	db.getDataBaseConnection();
	

	


	}
	public static Connection getDataBaseConnection() {
		
		    String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
		    String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=supermarketmanagement";//数据源  ！！！注意若出现加载或者连接数据库失败一般是这里出现问题
		    String Name="sa";
		    String Pwd="liuliu666";
		  try{
		  Class.forName(driverName);
		  con=DriverManager.getConnection(dbURL,Name,Pwd);
		  System.out.println("连接数据库成功");
		  }catch(Exception e){
		   e.printStackTrace();
		     System.out.println("连接失败");
		     }
		    Statement stmt = null;
		    try {
		        stmt = con.createStatement();
		    } catch (SQLException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		
		return con;
		}
}
