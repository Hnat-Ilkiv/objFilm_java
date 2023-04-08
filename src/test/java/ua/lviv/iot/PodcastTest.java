package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PodcastTest {
	@Test
	public void testGetCurrentRating() {
		Podcast podcast = new Podcast();
		assertEquals(0.0, podcast.getCurrentRating(), 0.0);

		podcast.setLikes(10);
		podcast.setViews(100);
		assertEquals(0.1, podcast.getCurrentRating(), 0.1);
	}
}
