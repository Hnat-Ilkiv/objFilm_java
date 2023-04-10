package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;


public class VideoManagerTest {
@Test
public void testAddVideo() {
    Video video = new Short();
    VideoManager videoManager = new VideoManager();
    videoManager.addVideo(video);
    assertEquals(1, videoManager.getVideos().size());
}

@Test
public void testFindAllVideosCreatedIn() {
    VideoManager videoManager = new VideoManager();
    Video video1 = new Film("file1", "title1", "director1", 2021, 200, 50);
    Video video2 = new Clip("file2", "title2", "director2", 2022, "songtitle", "songwriter", 500, 650);
    Video video3 = new Podcast("file3", "title3", "director3", 2021, "podcasthost", "podcasttopic", 800, 930);
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
    VideoManager videoManager = new VideoManager();
    Video video1 = new Film("file1", "title1", "director1", 2021, 200, 50);
    Video video2 = new Clip("file2", "title2", "director2", 2022, "songtitle", "songwriter", 500, 650);
    Video video3 = new Podcast("file3", "title3", "director3", 2021, "podcasthost", "podcasttopic", 800, 930);
    videoManager.addVideo(video1);
    videoManager.addVideo(video2);
    videoManager.addVideo(video3);
    List<Video> videos = videoManager.findAllVideosWithHigherRatingThen(4);
    assertEquals(1, videos.size());
    assertTrue(videos.contains(video1));
}

}
