package ua.lviv.iot;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class ShortTest {
	private Short shortVideo;

	@Before
	public void setup() {
		shortVideo = new Short("fileTitle", "videoTitle", "director", 2022, 5);
	}

	@Test
	public void testShortDefaultConstructor() {
		shortVideo = new Short();
		assertNull(shortVideo.getFileTitle());
		assertNull(shortVideo.getVideoTitle());
		assertNull(shortVideo.getDirector());
		assertEquals(0, shortVideo.getYear());
		assertEquals(0, shortVideo.getLikes());
	}
	
	@Test
	public void testShortParameterizedConstructor() {
		assertEquals("fileTitle", shortVideo.getFileTitle());
		assertEquals("videoTitle", shortVideo.getVideoTitle());
		assertEquals("director", shortVideo.getDirector());
		assertEquals(2022, shortVideo.getYear());
		assertEquals(5, shortVideo.getLikes());
	}
	
	@Test
	public void testGetCurrentRating() {
		float currentRating = shortVideo.getCurrentRating();
		assertEquals(5.0f, currentRating, 0.001f);
	}
}
