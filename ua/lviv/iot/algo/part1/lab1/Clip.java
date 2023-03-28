package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)

public class Clip extends Video {
	private String songTitle;
	private String songwriter;
	private int likes;
	private int views;

	Clip() {}
	Clip(String fileTitle, String videoTitle, String director, int year, 
			String songTitle, String songwriter, int likes, int views) {
		this.fileTitle = fileTitle;
		this.videoTitle = videoTitle;
		this.director = director;
		this.year = year;
		this.songTitle = songTitle;
		this.songwriter = songwriter;
		this.likes = likes;
		this.views = views;
	}

	@Override
	public float getCurrentRating() {
		return (this.views != 0) ? (float)this.likes / (float)this.views : 0;
	}
}
