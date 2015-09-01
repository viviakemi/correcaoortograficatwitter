package teste_vivi;

import org.junit.Test;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterPostingTest {

	//private static Logger LOG = Logger.getLogger(TestTwitterPosting.class);	

	@Test
	public void testPostingToTwitter() throws TwitterException{
		Twitter twitter = TwitterFactory.getSingleton();
		String message="\"A Visit to Transylvania\" by Euromaxx: Lifestyle Europe (DW) \n http://bit.ly/1cHB7MH";
		Status status = twitter.updateStatus(message);
	//	LOG.debug("Successfully updated status to " + status.getText());
	}

}
