package ua.lviv.iot;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;


public class VideoManagerTest {
	VideoManager videoManager;
	Video video1;
	Video video2;
	Video video3;
	Video video;
	
	@Before
	public void setup() {
		videoManager = new VideoManager();
		video1 = new Film("file1", "title1", "director1", 2021, 200, 50);
		video2 = new Clip("file2", "title2", "director2", 2022, "songtitle", "songwriter", 500, 650);
		video3 = new Podcast("file3", "title3", "director3", 2021, "podcasthost", "podcasttopic", 800, 930);
		video = new Short();
	}

	@Test
	public void testAddVideo() {
		videoManager.addVideo(video);
		assertEquals(1, videoManager.getVideos().size());
	}

	@Test
	public void testFindAllVideosCreatedIn() {
		videoManager.addVideo(video1);
		videoManager.addVideo(video2);
		videoManager.addVideo(video3);
		List<Video> videos = videoManager.findAllVideosCreatedIn(2021);
		assertEquals(2, videos.size());
		assertTrue(videos.contains(video1));
		assertTrue(videos.contains(video3));
	}
	
	@Test
	public void testFindAllVideosWithHigherRatingThen() {
		videoManager.addVideo(video1);
		videoManager.addVideo(video2);
		videoManager.addVideo(video3);
		List<Video> videos = videoManager.findAllVideosWithHigherRatingThen(4);
		assertEquals(1, videos.size());
		assertTrue(videos.contains(video1));
	}
}
