package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Bean.Register_Bean;

public class Register_Dao {
	
	private String jdbcURL="jdbc:mysql://localhost:3306/work";
	private String jdbcUsername="root";
	private String jdbcPassword="#J@pre%914*priya&";

	private static final String INSERT_USERS_SQL ="INSERT INTO register (name, email, password, usertype)"+"VALUES(?,?,?,?)";

	public Register_Dao() {
	}
	
	protected Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/work", "root", "#J@pre%914*priya&");
			
		  
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;	
	}
	
	public void InsertUser(Register_Bean std)throws SQLException{
		try (Connection connection=getConnection();
		PreparedStatement preparedstatement=connection .prepareStatement(INSERT_USERS_SQL)){
			System.out.println(INSERT_USERS_SQL);
			preparedstatement.setString(1,std.getName());
			preparedstatement.setString(2,std.getEmail());
			preparedstatement.setString(3,std.getPassword());
			preparedstatement.setString(4,std.getUsertype());
			preparedstatement.executeUpdate();
		}
		//Database update above
		catch (SQLException e) {
			System.out.println("not insert");
			printSQLException(e);
		}
	}
	
	private void printSQLException(SQLException e) {
		System.err.println("Message:"+ e.getMessage());
		
	}
}


