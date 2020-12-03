package sql;

import java.sql.*;

public class Test {

public static void main(String[] args) {
    update();

}


public static void update() {
    Connection connection=null;
    String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
    String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=supermarketmanagement";//数据源  ！！！注意若出现加载或者连接数据库失败一般是这里出现问题
    String Name="sa";
    String Pwd="liuliu666";
  try{
  Class.forName(driverName);
  connection=DriverManager.getConnection(dbURL,Name,Pwd);
  System.out.println("连接数据库成功");
  }catch(Exception e){
   e.printStackTrace();
     System.out.println("连接失败");
     }
    Statement stmt = null;
    try {
        stmt = connection.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    //增删改操作
    ResultSet set = null;
    String sql_2="select * from 员工信息表";
    int count_1 = 0;
     try {
		set=stmt.executeQuery(sql_2);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     
     // 获取数据
     try {
		while (set.next()) {

		     System.out.println("id:" + set.getString(1) + "\tscore:"
		             + set.getString(3));

		 }
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

    //关闭
    try {
        stmt.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        connection.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}