package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)

public class Podcast extends Video {
	private String podcastHost;
	private String podcastTopic;
	private int likes;
	private int views;

	Podcast() {}
	Podcast(String fileTitle, 
			String videoTitle, 
			String director, 
			int year, 
			String podcastHost, 
			String podcastTopic, 
			int likes, 
			int views) {
		this.fileTitle = fileTitle;
		this.videoTitle = videoTitle;
		this.director = director;
		this.year = year;
		this.podcastHost = podcastHost;
		this.podcastTopic = podcastTopic;
		this.likes = likes;
		this.views = views;
	}

	@Override
	public float getCurrentRating() {
		return (this.views != 0) ? (float)this.likes / (float)this.views : 0;
	}
}
