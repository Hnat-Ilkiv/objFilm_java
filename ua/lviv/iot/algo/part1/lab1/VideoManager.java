package ua.lviv.iot.algo.part1.lab1;

import java.util.List;
import java.util.ArrayList;

public class VideoManager {
	public static void main(String... args) {
		List<Video> videos = new ArrayList<Video>();

		videos.add(new Film());
		videos.add(new Film("Up in the Air", "Jason Reitman", 2009, 2288309, 309231));
		videos.add(Film.getInstance());
		videos.add(Film.getInstance());

		videos.add(new Clip());
		videos.add(new Clip("Brighton In The Rain", "Robert Campbell & Jonathan Dykes", 1600, 6020));

		for (Video video : videos) {
			System.out.println(video);
		}
	}
}