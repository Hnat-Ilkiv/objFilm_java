package ua.lviv.iot.models;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClipTest {
    private Clip clip;

    @Before
    public void setup() {
        clip = new Clip("File Title", "Video Title", "Director", 2021, "Song Title", "Songwriter", 50, 1000);
    }

    @Test
    public void testClipConstructorWithValidData() {
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
        clip.setViews(0);
        assertEquals(0, clip.getCurrentRating(), 0.01);
    }

    @Test
    public void testGetCurrentRatingWithZeroLikes() {
        clip.setLikes(0);
        assertEquals(0, clip.getCurrentRating(), 0.01);
    }

    @Test
    public void testGetCurrentRatingWithValidData() {
        clip.setLikes(50);
        clip.setViews(1000);
        assertEquals(0.05, clip.getCurrentRating(), 0.01);
    }
}
