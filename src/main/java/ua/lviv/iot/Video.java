package ua.lviv.iot;

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

	public String getHeaders() {
		return "fileTitle,videoTitle,director,year";
	}

	public String toCSV() {
		return this.fileTitle + "," + this.videoTitle + "," + this.director + "," + this.year;
	}
}
