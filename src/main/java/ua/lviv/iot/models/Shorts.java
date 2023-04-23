package ua.lviv.iot.models;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Shorts extends Video {
    private int likes;

    public Shorts() {
        super();
    }

    public Shorts(final String fileTitle,
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

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",likes";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.likes;
    }
}
