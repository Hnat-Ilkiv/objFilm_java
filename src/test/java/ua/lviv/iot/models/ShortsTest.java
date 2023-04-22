package ua.lviv.iot.models;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShortsTest {
    private Shorts shortVideo;

    @Before
    public void setup() {
        shortVideo = new Shorts("fileTitle", "videoTitle", "director", 2022, 5);
    }

    @Test
    public void testShortDefaultConstructor() {
        shortVideo = new Shorts();
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
