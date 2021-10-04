package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface implDao {
	//連線方法java8
	static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3307/gjuncompany?useUnicode=true&characterEncoding=UTF-8";
		String user="root";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//新增create
	
	public void add(Object o);

	//查詢 read
	
	
	//修改 update
	
	
	//刪除 delete

}
