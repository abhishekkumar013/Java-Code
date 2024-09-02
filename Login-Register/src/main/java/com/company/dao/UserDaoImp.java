package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		String query="SELECT * FROM users WHERE username =? AND password=?";
		try (Connection connection=DBUtil.getConnection(); 
			
			PreparedStatement preparedstatement=connection.prepareStatement(query)){
			preparedstatement.setString(1, username);
			preparedstatement.setString(2, password);
			
			ResultSet resultset=preparedstatement.executeQuery();
//			System.out.println("Query run ho raha");
			return resultset.next();
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
