package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClipTest {
	@Test
	public void testClipConstructorWithValidData() {
		Clip clip = new Clip("File Title", "Video Title", "Director", 2021, "Song Title", "Songwriter", 50, 1000);
		assertNotNull(clip);
		assertEquals("File Title", clip.getFileTitle());
		assertEquals("Video Title", clip.getVideoTitle());
		assertEquals("Director", clip.getDirector());
		assertEquals(2021, clip.getYear());
		assertEquals("Song Title", clip.getSongTitle());
		assertEquals("Songwriter", clip.getSongwriter());
		assertEquals(50, clip.getLikes());
		assertEquals(1000, clip.getViews());
	}
	
	@Test
	public void testGetCurrentRatingWithZeroViews() {
		Clip clip = new Clip();
		clip.setLikes(50);
		clip.setViews(0);
		assertEquals(0, clip.getCurrentRating(), 0.01);
	}
	@Test
	public void testGetCurrentRatingWithZeroLikes() {
		Clip clip = new Clip();
		clip.setLikes(0);
		clip.setViews(1000);
		assertEquals(0, clip.getCurrentRating(), 0.01);
	}
	@Test
	public void testGetCurrentRatingWithValidData() {
		Clip clip = new Clip();
		clip.setLikes(50);
		clip.setViews(1000);
		assertEquals(0.05, clip.getCurrentRating(), 0.01);
	}
	@Test
	public void testSetLikesWithValidData() {
		Clip clip = new Clip();
		clip.setLikes(100);
		assertEquals(100, clip.getLikes());
	}
	@Test
	public void testSetViewsWithValidData() {
		Clip clip = new Clip();
		clip.setViews(1000);
		assertEquals(1000, clip.getViews());
	}
	@Test
	public void testSetSongTitleWithValidData() {
		Clip clip = new Clip();
		clip.setSongTitle("New Song Title");
		assertEquals("New Song Title", clip.getSongTitle());
	}
	@Test
	public void testSetSongwriterWithValidData() {
		Clip clip = new Clip();
		clip.setSongwriter("New Songwriter");
		assertEquals("New Songwriter", clip.getSongwriter());
	}
}
