package ua.lviv.iot;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class Film extends Video {
	private int rating;
	private int marks;

	Film() {super();}

	Film(String fileTitle, 
			String videoTitle, 
			String director, 
			int year, 
			int rating, 
			int marks) {
		super(fileTitle, videoTitle, director, year);
		this.rating = rating;
		this.marks = marks;
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

	@Override
	public float getCurrentRating() {
		return (this.marks != 0) ? (float)this.rating / (float)this.marks : 0;
	}
}
