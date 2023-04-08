package ua.lviv.iot;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString(callSuper = true)

public class Podcast extends Video {
	private String podcastHost;
	private String podcastTopic;
	private int likes;
	private int views;

	Podcast() {super();}
	Podcast(String fileTitle, 
			String videoTitle, 
			String director, 
			int year, 
			String podcastHost, 
			String podcastTopic, 
			int likes, 
			int views) {
		super(fileTitle, videoTitle, director, year);
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
