package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FilmTest {
	@Test
	public void testRate() {
		Film film = new Film();
		film.rate(0);
		assertEquals(1, film.getRating());
		assertEquals(1, film.getMarks());
		
		film.rate(9);
		assertEquals(10, film.getRating());
		assertEquals(2, film.getMarks());

		film.rate(20);
		assertEquals(20, film.getRating());
		assertEquals(3, film.getMarks());
	}

	@Test
	public void testGetCurrentRating() {
		Film film = new Film();
		assertEquals(0.0, film.getCurrentRating(), 0.0);

		film.rate(6);
		film.rate(7);
		film.rate(8);
		assertEquals(7.0, film.getCurrentRating(), 0.0);
	}
}
