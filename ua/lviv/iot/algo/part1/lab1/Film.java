package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Film {
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
		float currentRating = this.rating / this.marks;
		return currentRating;
	}

	public static void main(String[] args) {
		Film[] films;
		films = new Film[4];

		films[0] = new Film();
		films[1] = new Film("Avengers: Endgame", "Anthony & Joe Russo", 2019, 10080000, 1200000);
		films[2] = Film.getInstance();
		films[3] = Film.getInstance();

		for (int i = 0; i < films.length; i++) {
			System.out.println(films[i]);
		}
	}
}
