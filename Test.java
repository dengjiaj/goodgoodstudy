package test;

import java.sql.*;   

public class Test {  
  
public static void main(String[] srg) {  
  
   String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //����JDBC����  

   String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=YCZMJK"; //���ӷ����������ݿ�YCZMJK  

   String userName = "sa";   //Ĭ���û���  
  
   String userPwd = "123456";   //����  

   Connection dbConn;  

   try {  
  
   Class.forName(driverName);  
  
   dbConn = DriverManager.getConnection(dbURL, userName, userPwd);  
   Statement stat = dbConn.createStatement();
   System.out.println("Connection Successful!");   //������ӳɹ� ����̨���Connection Successful!  
	String sql = "insert into localuser(username,passwd)VALUES('hhhh','123456')";  //SQL��ѯ����
	int i= stat.executeUpdate(sql);
	System.out.println("�ɹ����"+i+"��");
   } catch (Exception e) {  

   e.printStackTrace();  
  
   }  
   
  
}  
  
}