package ua.lviv.iot;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)

public class Short extends Video {
	private int likes;

	Short() {super();}
	Short(String fileTitle, 
			String videoTitle, 
			String director, 
			int year, 
			int likes) {
		super(fileTitle, videoTitle, director, year);
		this.likes = likes;
	}

	@Override
	public float getCurrentRating() {
		return this.likes;
	}
}
