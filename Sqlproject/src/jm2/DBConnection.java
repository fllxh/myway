package jm2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	static Connection con;
	
	public static Connection getDataBaseConnection() {
		    String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL���ݿ�����
		    String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=supermarketmanagement";//����Դ  ������ע�������ּ��ػ����������ݿ�ʧ��һ���������������
		    String Name="u2";
		    String Pwd="";
		  try{
		  Class.forName(driverName);
		  con=DriverManager.getConnection(dbURL,Name,Pwd);
		  System.out.println("�������ݿ�ɹ�");
		  }catch(Exception e){
		   e.printStackTrace();
		     System.out.println("����ʧ��");
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
