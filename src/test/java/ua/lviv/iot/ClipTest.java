package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClipTest {
	@Test
	public void testGetCurrentRating() {
		Clip clip = new Clip();
		assertEquals(0.0, clip.getCurrentRating(), 0.0);

		clip.setLikes(10);
		clip.setViews(100);
		assertEquals(0.1, clip.getCurrentRating(), 0.1);
	}
}
