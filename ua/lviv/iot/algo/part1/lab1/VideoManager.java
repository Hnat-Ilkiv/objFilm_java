package ua.lviv.iot.algo.part1.lab1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class VideoManager {
	private List<Video> videos = new ArrayList<Video>();

	public void addVideo(final Video video) {
		videos.add(video);
	}

	public List<Video> getVideos() {return videos;}

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

	public static void main(String... args) {
		VideoManager myVideoManager = new VideoManager();

		myVideoManager.addVideo(new Film("film_the-social-dilemma.mkv", "The Social Dilemma", "Jeff Orlowski", 2020, 80000, 100000));
		myVideoManager.addVideo(new Film("film_up-in-the-air.mkv", "Jason Reitman", "Up in the Air", 2009, 2288309, 309231));
		myVideoManager.addVideo(new Clip());
		myVideoManager.addVideo(new Clip("clip_your-name.flac", "Your Name", "Radwips", 2016, "Dream lantern", "Radwips", 153000, 500000));
		myVideoManager.addVideo(new Podcast());
		myVideoManager.addVideo(new Podcast("podcast_how-to-live.mp4", "How to live?", "Mark", 2017, "Ivan", "life", 1234, 12345));
		myVideoManager.addVideo(new Short());
		myVideoManager.addVideo(new Short("short_tick-tock.avi", "Tick Tock", "jfid3748", 2023, 94763));

		System.out.println("Print all fideos in manager:"); 
		for (Video video : myVideoManager.getVideos()) {
			System.out.println(video.toString());
		}

		System.out.println("\nFind all videos created in:");
		for (Video video : myVideoManager.findAllVideosCreatedIn(2020)) {
			System.out.println(video.toString());
		}

		System.out.println("\nFind all videos with higher rating then:");
		for (Video video : myVideoManager.findAllVideosWithHigherRatingThen(7)) {
			System.out.println(video.toString());
		}
	}
}
