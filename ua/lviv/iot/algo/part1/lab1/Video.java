package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public abstract class Video {
	private String fileTitle;
	private String videoTitle;
	private String director;
	private int year;

	public abstract float getCurrentRating();
}
