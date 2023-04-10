package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class ShortTest {
	@Test
	public void testShortDefaultConstructor() {
		Short shortVideo = new Short();
		assertNull(shortVideo.getFileTitle());
		assertNull(shortVideo.getVideoTitle());
		assertNull(shortVideo.getDirector());
		assertEquals(0, shortVideo.getYear());
		assertEquals(0, shortVideo.getLikes());
	}
	
	@Test
	public void testShortParameterizedConstructor() {
		Short shortVideo = new Short("fileTitle", "videoTitle", "director", 2022, 5);
		assertEquals("fileTitle", shortVideo.getFileTitle());
		assertEquals("videoTitle", shortVideo.getVideoTitle());
		assertEquals("director", shortVideo.getDirector());
		assertEquals(2022, shortVideo.getYear());
		assertEquals(5, shortVideo.getLikes());
	}
	
	@Test
	public void testGetCurrentRating() {
		Short shortVideo = new Short("fileTitle", "videoTitle", "director", 2022, 5);
		float currentRating = shortVideo.getCurrentRating();
		assertEquals(5.0f, currentRating, 0.001f);
	}
	
	@Test
	public void testSetLikes() {
		Short shortVideo = new Short();
		shortVideo.setLikes(10);
		assertEquals(10, shortVideo.getLikes());
	}
}
