package ua.lviv.iot;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class VideoManager {
	private List<Video> videos = new ArrayList<Video>();

	public final void addVideo(final Video video) {
		videos.add(video);
	}

	public final List<Video> getVideos() {
		return new ArrayList<Video>(this.videos);
	}

	public final List<Video> findAllVideosCreatedIn(final int year) {
		return videos.stream().
			filter(video -> video.getYear() == year).
			collect(Collectors.toList());
	}

	public final List<Video> findAllVideosWithHigherRatingThen(final int currentRating) {
		return videos.stream().
			filter(video -> video.getCurrentRating() >= currentRating).
			collect(Collectors.toList());
	}

	public List<Video> getSortedVideosList() {
		return videos.stream()
				.sorted(Comparator.comparingInt(video -> {
					if (video instanceof Film) {
						return 0;
					} else if (video instanceof Clip) {
						return 1;
					} else if (video instanceof Podcast) {
						return 2;
					} else if (video instanceof Short) {
						return 3;
					} else {
						return 4;
					}
				}))
				.toList();
	}
}
