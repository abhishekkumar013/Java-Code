package Dbconnect;

import java.sql.Connection;
import java.sql.DriverManager ;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	

	public void createdatabse(String db) {
		try {
	        String url = "jdbc:mysql://localhost:3306";
	        String username = "root";
	        String password = "";

	        Connection conn = DriverManager.getConnection(url, username, password);
	        System.out.println("Connection Successfully");

	        // Here you can create a statement and execute SQL queries
	        Statement stm=conn.createStatement();
	        String query="create database "+db;
	        stm.execute(query);
	        System.out.println("Db Created ");
	        // Close the connection
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
	}

	public void createTable(String db) {
		try {
	        String url = "jdbc:mysql://localhost:3306/";
	        String username = "root";
	        String password = "";

	        Connection conn = DriverManager.getConnection(url+db, username, password);
	        System.out.println("Connection Successfully");

	        // Here you can create a statement and execute SQL queries
	        Statement stm=conn.createStatement();
	        String query="create table  student(sid int(3), sname varchar(20), marks varchar(20))";
	        stm.execute(query);
	        System.out.println("Table Created ");
	        // Close the connection
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
	}

	public void createData(String db) {
		try {
	        String url = "jdbc:mysql://localhost:3306/";
	        String username = "root";
	        String password = "";

	        Connection conn = DriverManager.getConnection(url+db, username, password);
	        System.out.println("Connection Successfully");

	        // Here you can create a statement and execute SQL queries
//	        Statement stm=conn.createStatement();
	        
//	        String query="INSERT into student VALUES (2,'Ritesh','98')";
	        
	        String query="INSERT into student  (sid,sname,marks) VALUES (?,?,?)";
	        
	        PreparedStatement pstm=conn.prepareStatement(query);
	        
	        pstm.setInt(1,3);
	        pstm.setString(2, "Neha");
	        pstm.setString(3, "98");
	        
//	        stm.execute(query);
	        pstm.execute();
	        
	        System.out.println("Data Created ");
	        // Close the connection
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
	}

	public void readData(String db) {
		try {
	        String url = "jdbc:mysql://localhost:3306/";
	        String username = "root";
	        String password = "";

	        Connection conn = DriverManager.getConnection(url+db, username, password);
	        System.out.println("Connection Successfully");

	        // Here you can create a statement and execute SQL queries
	        Statement stm=conn.createStatement();   
	        
	        String query="Select * from student";
	        
//	        stm.execute(query);
	        ResultSet res=stm.executeQuery(query);
	        System.out.println("Id   Name    Marks");
	        while(res.next()) {
	        	System.out.print(res.getInt(1)+"   ");
	        	System.out.print(res.getString(2)+"   ");
	        	System.out.print(res.getString(3)+"   ");
	        	System.out.println();
	        }
	        System.out.println("Read Successfully "+ res);
	        
	        // Close the connection
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
	}

	public void updateData(String db) {
		try {
	        String url = "jdbc:mysql://localhost:3306/";
	        String username = "root";
	        String password = "";

	        Connection conn = DriverManager.getConnection(url+db, username, password);
	        System.out.println("Connection Successfully");

	        // Here you can create a statement and execute SQL queries
	        
	        String query="UPDATE  student set sname=? where sid=?";
	        
	        PreparedStatement pstm=conn.prepareStatement(query);
	        
	        pstm.setInt(2,3);
	        pstm.setString(1, "Siddhi");
	        
	        pstm.execute();
	        
	        System.out.println("Data Updated ");
	        
	        
	        // Close the connection
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
	}

	public void deleteData(String db) {
		try {
	        String url = "jdbc:mysql://localhost:3306/";
	        String username = "root";
	        String password = "";

	        Connection conn = DriverManager.getConnection(url+db, username, password);
	        System.out.println("Connection Successfully");

	        // Here you can create a statement and execute SQL queries
	        
	        String query="DELETE from   student  where sid=?";
	        
	        PreparedStatement pstm=conn.prepareStatement(query);
	        
	        pstm.setInt(1,3);
	       
	        
	        pstm.execute();
	        
	        System.out.println("Data DELETED ");
	        
	        
	        // Close the connection
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
	}
}
