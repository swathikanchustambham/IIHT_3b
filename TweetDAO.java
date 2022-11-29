package TweetModalLayer;

import java.sql.*;

import TweetControllerLayer.Tweet;
import TweetControllerLayer.User;
import TweetRepositoryLayer.TweetDBConnect;

public class TweetDAO {
	
	static PreparedStatement st = null;
    static Connection ct=TweetDBConnect.connectToDB();
	static ResultSet rs = null;	
	

	public static void userLogin(User user) throws SQLException {
		st = ct.prepareStatement("select userName from user where userId = ? and password = ?");
		st.setString(1, user.getUserId());
		st.setString(2, user.getPassword());
		rs = st.executeQuery();
		while (rs.next()) {
			System.out.println("Login in successful");
		}
	}

	public static void userRegister(User user) throws SQLException {
		st = ct.prepareStatement("insert into user values(?,?,?)");
		st.setString(1, user.getUserId());
		st.setString(3, user.getUserName());
		st.setString(2, user.getPassword());
		st.executeUpdate();		
			System.out.println("Account created");		
	}

	public static void postTweet(Tweet tweet, User user) throws SQLException {
		st = ct.prepareStatement("insert into tweet values(?,?,?)");
		st.setInt(1, tweet.getTweetId());
		st.setString(2, tweet.getTweetMsg());
		st.setString(3, user.getUserId());
	    st.executeQuery();
			System.out.println(tweet.getTweetMsg());
	}

	public static void viewMyTweets() throws SQLException {
		Tweet tweet = new Tweet();
		st = ct.prepareStatement("select tweetMsg from tweet where userId = ?");
		st.setString(1, tweet.getUserId());
		rs = st.executeQuery();
		while (rs.next()) {
			System.out.println(tweet.getTweetMsg());
		}
	}

	public static void viewAllTweets() throws SQLException {
		Tweet tweet = new Tweet();
		st = ct.prepareStatement("select tweetMsg from tweet");
		rs = st.executeQuery();
		while (rs.next()) {
			System.out.println(tweet.getTweetMsg());
		}
	}

	public static void viewAllUsers(User user) throws SQLException {
		st = ct.prepareStatement("select userName from user");
		rs = st.executeQuery();
		while (rs.next()) {
			System.out.println(user.getUserName());
		}
	}
}
