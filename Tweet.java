package TweetControllerLayer;

public class Tweet {
	private int tweetId;
	private String tweetMsg;
	private String userId;
	public int getTweetId() {
		return tweetId;
	}
	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}
	public String getTweetMsg() {
		return tweetMsg;
	}
	public void setTweetMsg(String tweetMsg) {
		this.tweetMsg = tweetMsg;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
