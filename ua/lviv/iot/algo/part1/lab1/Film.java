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

public class Film extends Video {
	private String title;
	private String director;
	private int year;
	private int rating;
	private int marks;

	private static Film instance = new Film();

	public static Film getInstance() {
		return instance;
	}

	public void rate(int rating) {
		if (rating <= 1) {
			this.rating++;
		} else if (rating >= 10) {
			this.rating += 10;
		} else {
			this.rating += rating;
		}
		this.marks++;
	}

	public float getCurrentRating() {
		float currentRating = (this.marks != 0) ? this.rating / this.marks : 0;
		return currentRating;
	}
}
