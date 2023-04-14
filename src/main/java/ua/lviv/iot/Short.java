package ua.lviv.iot;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)

public class Short extends Video {
	private int likes;

	Short() {
		super();
	}

	Short(final String fileTitle,
			final String videoTitle,
			final String director,
			final int year,
			final int likes) {
		super(fileTitle, videoTitle, director, year);
		this.likes = likes;
	}

	@Override
	public final float getCurrentRating() {
		return this.likes;
	}

	public String getHeaders() {
		return super.getHeaders() + ",likes";
	}

	public String toCSV() {
		return super.toCSV() + "," + this.likes;
	}
}
