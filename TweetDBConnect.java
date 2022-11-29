package TweetRepositoryLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TweetDBConnect {
	public static Connection connectToDB() 
	{
		Connection ct=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweetdb1?autoReconnect=true&useSSL=false", "root", "pass@word1");
		
		System.out.println("connected to Data Base");
		}
		catch(Exception e) {
			System.out.println("not connected");
		}
		return ct;
	}
	
}
