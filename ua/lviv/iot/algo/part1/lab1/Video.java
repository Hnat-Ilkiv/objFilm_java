package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public abstract class Video {
	protected String fileTitle;
	protected String videoTitle;
	protected String director;
	protected int year;

	public abstract float getCurrentRating();

	public int getYear() {
		return year;
	}
}
