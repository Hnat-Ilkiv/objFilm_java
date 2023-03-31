
package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)

public class Short extends Video {
	private int likes;

	Short() {}
	Short(String fileTitle, 
			String videoTitle, 
			String director, 
			int year, 
			int likes) {
		this.fileTitle = fileTitle;
		this.videoTitle = videoTitle;
		this.director = director;
		this.year = year;
		this.likes = likes;
	}

	@Override
	public float getCurrentRating() {
		return this.likes;
	}
}
