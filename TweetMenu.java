package TweetControllerLayer;
import java.sql.SQLException;
import java.util.Scanner;

import TweetModalLayer.TweetDAO;

public class TweetMenu {
	
	public static void menuForGuestUser() throws SQLException {
		System.out.println("1 Login" + "\t" + "2 Register" + "3 Forgot password");

		Scanner sc=new Scanner(System.in);		
		 //int s=sc.nextInt();
		 String option=sc.nextLine();
		 
		 User user=new User();
		
		switch (option) {
		case "Login":
			if (option.equalsIgnoreCase("Login")) {
				System.out.println("EmailId : ");
				String userId=sc.nextLine();
                user.setUserId(userId);
				System.out.println("Password");
				String password=sc.nextLine();
				user.setPassword(password);
				TweetDAO.userLogin(user);
			}
		case "Register":
			if (option.equalsIgnoreCase("Register")) {
				System.out.println("First Name : ");
				String firstName=sc.nextLine();
				user.setUserName(firstName);
				System.out.println("EmailId : ");
				String userId=sc.nextLine();
				user.setUserId(userId);
				System.out.println("Password");
				String password=sc.nextLine();
				user.setPassword(password);
				TweetDAO.userRegister(user);
			}
		case "Forgot Password":
			if (option.equalsIgnoreCase("Forgot Password")) {
				String password=sc.nextLine();
				user.setPassword(password);
			}
		}
	}

	public static void menuForLoggedInUser(User user, Tweet tweet) throws SQLException {
		Scanner sc = new Scanner(System.in);
	    String option = sc.nextLine();
		//int s = sc.nextInt();
		switch (option) {
		case "1":
			if (option.equalsIgnoreCase("post a tweet")) {
				String tweetMsg = sc.next();
				tweet.setTweetMsg(tweetMsg);
				TweetDAO.postTweet(tweet, user);
				break;
			}
		case "2":
			if (option.equalsIgnoreCase("view my tweets")) {
				TweetDAO.viewMyTweets();
				break;
			}
		case "3":
			if (option.equalsIgnoreCase("view all tweets")) {
				TweetDAO.viewAllTweets();
				break;
			}
		case "4":
			if (option.equalsIgnoreCase("view all users")) {
				TweetDAO.viewAllUsers(user);
				break;
			}
		case "5":
			if (option.equalsIgnoreCase("Logout")) {
				break;
			}
		}
	}

	public static void main(String args[]) throws SQLException {
		User user = new User();
		Tweet tweet = new Tweet();
		menuForGuestUser();
		menuForLoggedInUser(user, tweet);
	}
}