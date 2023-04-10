package ua.lviv.iot;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FilmTest {
	Film film;
	
	@Before
	public void setup() {
		film = new Film();
	}

	@Test
	public void testFilmConstructorWithValidData() {
		film = new Film("File Title", "Video Title", "Director", 2021, 8, 5);
		assertNotNull(film);
		assertEquals("File Title", film.getFileTitle());
		assertEquals("Video Title", film.getVideoTitle());
		assertEquals("Director", film.getDirector());
		assertEquals(2021, film.getYear());
		assertEquals(8, film.getRating());
		assertEquals(5, film.getMarks());
	}
	
	@Test
	public void testRateWithValidData() {
		film.rate(7);
		assertEquals(7, film.getRating());
		assertEquals(1, film.getMarks());
	}
	@Test
	public void testRateWithInvalidDataLessThanOne() {
		film.rate(-1);
		assertEquals(1, film.getRating());
		assertEquals(1, film.getMarks());
	}
	
	@Test
	public void testRateWithInvalidDataGreaterThanTen() {
		film.rate(11);
		assertEquals(10, film.getRating());
		assertEquals(1, film.getMarks());
	}
	
	@Test
	public void testGetCurrentRatingWithZeroMarksAndRating() {
		assertEquals(0, film.getCurrentRating(), 0.01);
	}
	
	@Test
	public void testGetCurrentRatingWithValidData() {
		film.rate(5);
		film.rate(8);
		assertEquals(6.5, film.getCurrentRating(), 0.01);
	}
}
