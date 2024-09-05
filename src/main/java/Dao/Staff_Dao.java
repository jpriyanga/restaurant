package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Bean.Staff_Bean;



public class Staff_Dao {
	
	private String jdbcURL="jdbc:mysql://127.0.0.1:3306/?user=root";
	private String jdbcUsername="root";
	private String jdbcPassword="#J@pre%914*priya&";
	
	//queries
	//"INSERT INTO student (name,address,telephone) values (?,?));";
	
	//in below case we use insertion,selection by id and selection all
	private static final String INSERT_USERS_SQL = "INSERT INTO register" +" ((name,email,password,usertype) VALUES (?,?,?,?));";
	//private static final String SELECT_USER_BY_ID = "select id,name,address,telephone from student where id =?";
	//private static final String SELECT_ALL_USERS = "select from student";
	public Staff_Dao() {
	}
	
	//set of connection
	protected Connection getConnection() {
		Connection connection= null;
		
		try {
			Class.forName(".com.mysql.jdbc.driver");
			
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername,jdbcPassword);
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;	
	}
	
	//In below statement the name near the InsertUser should be the name of the bean class (for an example here this is Student_Dao so, the bean class for this is Student_Bean)
	public void InsertUser(Staff_Bean std)throws SQLException{
		try (Connection connection=getConnection();
		PreparedStatement preparedstatement=connection .prepareStatement(INSERT_USERS_SQL)){
			
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
	
	//public Employee_Bean SelectUser (int id) {
		//Employee_Bean std = null;
		
		//try (Connection connection=getConnection();
				//PreparedStatement preparedstatement=connection .prepareStatement(SELECT_USER_BY_ID);){
				//preparedstatement.setInt(1, id);
				//System.out.println(preparedstatement);
				
				//ResultSet rs = preparedstatement.executeQuery();
				
				//while
	//}
	
	


	private void printSQLException(SQLException e) {
		System.err.println("Message:"+ e.getMessage());
		
	}
}


