package com.javaguys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Repository;
import com.blog.javaguys.user.User;
import java.sql.DatabaseMetaData;

@Repository
public class UserDaoImpl implements UserDao{
	
	
	public User getUserDetails(String userId) {
		
		User user = new User();
		
		//String connectionURL = "jdbc:sqlserver://192.168.10.156\\SQL2008;databaseName=userdb;integratedSecurity=true";
		
		Connection con = null;
		try {
			// con = DriverManager.getConnection (connectionURL,"sysfore","root ");
		    /*Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection (connectionURL,"root","root");
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from user where id="+userId);*/
			String connectionURL = "jdbc:mysql://localhost:3306/userdb";
			Class.forName("com.mysql.jdbc.Driver");
			  //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 con = DriverManager.getConnection(connectionURL,"root","root");
			 if (con != null) {
	              DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
	              System.out.println("Driver name: " + dm.getDriverName());
	              System.out.println("Driver version: " + dm.getDriverVersion());
	              System.out.println("Product name: " + dm.getDatabaseProductName());
	              System.out.println("Product version: " + dm.getDatabaseProductVersion());
	          }
			 
		      Statement stmt = con.createStatement();
		     ResultSet rs = stmt.executeQuery("select * from user where id =" + userId);
	     //ResultSet  rs = stmt.executeQuery("select * from dbo.user1 where id = '1'");
		 
		          while (rs.next())
		          {
		        	  
		        user.setUserId(rs.getString("id"));
		        user.setUserGender(rs.getString("gender"));
		        user.setUserName(rs.getString("name"));
		        user.setUserStatus(rs.getString("status"));
		          }
		}
		catch (SQLException e) {
		    e.printStackTrace();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
		    try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}

	public String saveUserDetails(User user) {
		/*String connectionURL = "jdbc:mysql://localhost:3306/userDB";
		
		Connection con = null;
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection (connectionURL,"root","root");
		    Statement stmt = con.createStatement();
		    int i = stmt.executeUpdate("insert into user values ('"+user.getUserId()+"','"+user.getUserName()+"','"+user.getUserGender()+"','"+user.getUserStatus()+"')");
		    System.out.println("Succeded !");
		}*/
		//String connectionURL = "jdbc:mysql://localhost:3306/userDB";
		 //String connectionURL = "jdbc:sqlserver://MYPC\\SQL2008;databaseName=MYDB";

		// connectionURL="jdbc:sqlserver://SYSFORE04-DELL\\SQL Server11.0.5343-SYSFORE04-DELL\\sysfore;databaseName=userdb;integratedSecurity=true";
	  
	 
		 //String connectionURL = "jdbc:sqlserver://192.168.10.156\\SQL2008;databaseName=userdb;integratedSecurity=true";
		 Connection con = null;
	   String connectionURL = "jdbc:mysql://localhost:3306/userdb";
	  try {
		  //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	      Class.forName("com.mysql.jdbc.Driver");
	      //con = DriverManager.getConnection(connectionURL,"sa","admin@2008");
	      con = DriverManager.getConnection(connectionURL,"root","root");
	      if (con != null) {
              DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
              System.out.println("Driver name: " + dm.getDriverName());
              System.out.println("Driver version: " + dm.getDriverVersion());
              System.out.println("Product name: " + dm.getDatabaseProductName());
              System.out.println("Product version: " + dm.getDatabaseProductVersion());
          }
	      System.out.println(con);
	        Statement stmt = con.createStatement();
	      System.out.println(user.getUserId());
	      int i = stmt.executeUpdate("insert into user values('"+user.getUserId()+"','"+user.getUserName()+"','"+user.getUserGender()+"','"+user.getUserStatus()+"')");
	      
	      System.out.println("Succeded !");
	  }
		catch (SQLException e) {
		    e.printStackTrace();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
		    try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user.getUserId();
	}

	
	
	
}
