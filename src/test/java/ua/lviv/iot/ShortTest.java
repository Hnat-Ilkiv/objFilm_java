package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShortTest {
	@Test
	public void testGetCurrentRating() {
		Short shorrt = new Short();
		shorrt.setLikes(10);
		assertEquals(10, shorrt.getCurrentRating(), 0.0);
	}
}
