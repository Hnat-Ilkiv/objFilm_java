package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FilmTest {
	@Test
	public void testFilmConstructorWithValidData() {
		Film film = new Film("File Title", "Video Title", "Director", 2021, 8, 5);
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
		Film film = new Film();
		film.rate(7);
		assertEquals(7, film.getRating());
		assertEquals(1, film.getMarks());
	}
	@Test
	public void testRateWithInvalidDataLessThanOne() {
		Film film = new Film();
		film.rate(-1);
		assertEquals(1, film.getRating());
		assertEquals(1, film.getMarks());
	}
	@Test
	public void testRateWithInvalidDataGreaterThanTen() {
		Film film = new Film();
		film.rate(11);
		assertEquals(10, film.getRating());
		assertEquals(1, film.getMarks());
	}
	@Test
	public void testGetCurrentRatingWithZeroMarksAndRating() {
		Film film = new Film();
		assertEquals(0, film.getCurrentRating(), 0.01);
	}
	@Test
	public void testGetCurrentRatingWithValidData() {
		Film film = new Film();
		film.rate(5);
		film.rate(8);
		assertEquals(6.5, film.getCurrentRating(), 0.01);
	}
	    @Test
    public void testSetRating() {
        Film film = new Film();
        film.setRating(8);
        assertEquals(8, film.getRating());
    }
	    @Test
    public void testSetMarks() {
        Film film = new Film();
        film.setMarks(10);
        assertEquals(10, film.getMarks());
    }
}
