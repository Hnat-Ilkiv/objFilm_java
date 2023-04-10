package ua.lviv.iot;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class VideoManager {
	private List<Video> videos = new ArrayList<Video>();

	public void addVideo(final Video video) {
		videos.add(video);
	}

	public List<Video> getVideos() {
		return new ArrayList<Video>(this.videos);
	}

	public List<Video> findAllVideosCreatedIn(int year) {
		return videos.stream().
			filter(video -> video.getYear() == year).
			collect(Collectors.toList());
	}

	public List<Video> findAllVideosWithHigherRatingThen(int currentRating) {
		return videos.stream().
			filter(video -> video.getCurrentRating() >= currentRating).
			collect(Collectors.toList());
	}
}
