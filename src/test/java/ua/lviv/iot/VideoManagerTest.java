package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class VideoManagerTest {
/*
		Film film = new Film();
		Clip clip = new Clip();
		Podcast podcast = new Podcast();
		Short shorts = new Short();
*/

	@Test
	public void testAddVideo() {
		Film film = new Film();
		VideoManager manager = new VideoManager();
		manager.addVideo(film);
		List<Video> videosManager = manager.getVideos();
		List<Video> videos = new ArrayList<Video>(Arrays.asList(film));

		assertEquals(videos.get(0), videosManager.get(0));
		assertArrayEquals(videos.toArray(), videosManager.toArray());
	}

	@Test
	public void testFindAllVideosCreatedIn() {
		Film film = new Film();
		Clip clip = new Clip();
		Podcast podcast = new Podcast();
		Short shorts = new Short();
		List<Video> videos = new ArrayList<Video>(Arrays.asList(film, clip, podcast,shorts));
		
		VideoManager manager = new VideoManager();
		manager.addVideo(film);
		manager.addVideo(clip);
		manager.addVideo(podcast);
		manager.addVideo(shorts);
		
		List<Video> result = manager.findAllVideosCreatedIn(0);
		assertArrayEquals(videos.toArray(), result.toArray());
	}
	
		@Test
	public void testFindAllVideosWithHigherRatingThen() {
		Film film = new Film();
		Clip clip = new Clip();
		Podcast podcast = new Podcast();
		Short shorts = new Short();
		List<Video> videos = new ArrayList<Video>(Arrays.asList(film, clip, podcast,shorts));
		
		VideoManager manager = new VideoManager();
		manager.addVideo(film);
		manager.addVideo(clip);
		manager.addVideo(podcast);
		manager.addVideo(shorts);
		
		List<Video> result = manager.findAllVideosWithHigherRatingThen(0);
		assertArrayEquals(videos.toArray(), result.toArray());
	}
}
