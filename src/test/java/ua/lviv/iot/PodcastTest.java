package ua.lviv.iot;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class PodcastTest {
	private Podcast podcast;

	@Before
	public void setup() {
		podcast = new Podcast("fileTitle", "videoTitle", "director", 2022, "podcastHost", "podcastTopic", 5, 10);
	}

	@Test
	public void testPodcastDefaultConstructor() {
		podcast = new Podcast();
		assertNull(podcast.getFileTitle());
		assertNull(podcast.getVideoTitle());
		assertNull(podcast.getDirector());
		assertEquals(0, podcast.getYear());
		assertNull(podcast.getPodcastHost());
		assertNull(podcast.getPodcastTopic());
		assertEquals(0, podcast.getLikes());
		assertEquals(0, podcast.getViews());
	}
	
	@Test
	public void testPodcastParameterizedConstructor() {
		assertEquals("fileTitle", podcast.getFileTitle());
		assertEquals("videoTitle", podcast.getVideoTitle());
		assertEquals("director", podcast.getDirector());
		assertEquals(2022, podcast.getYear());
		assertEquals("podcastHost", podcast.getPodcastHost());
		assertEquals("podcastTopic", podcast.getPodcastTopic());
		assertEquals(5, podcast.getLikes());
		assertEquals(10, podcast.getViews());
	}
	
	@Test
	public void testGetCurrentRatingWhenViewsNotZero() { 
		float currentRating = podcast.getCurrentRating();
		assertEquals(0.5f, currentRating, 0.001f);
	}
	
	@Test
	public void testGetCurrentRatingWhenViewsZero() {
		podcast.setViews(0);
		float currentRating = podcast.getCurrentRating();
		assertEquals(0.0f, currentRating, 0.001f);
	}
}
