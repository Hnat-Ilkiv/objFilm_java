package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Clip extends Video {
	private String songTitle;
	private String songwriter;
	private int likes;
	private int views;

	public float getCurrentRating() {
		float currentRating = (this.views != 0) ? this.likes / this.views : 0;
		return currentRating;
	}
}
