package ua.lviv.iot.models;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Clip extends Video {
    private String songTitle;
    private String songwriter;
    private int likes;
    private int views;

    public Clip() {
        super();
    }

    public Clip(final String fileTitle,
                final String videoTitle,
                final String director,
                final int year,
                final String songTitle,
                final String songwriter,
                final int likes,
                final int views) {
        super(fileTitle, videoTitle, director, year);
        this.songTitle = songTitle;
        this.songwriter = songwriter;
        this.likes = likes;
        this.views = views;
    }

    @Override
    public final float getCurrentRating() {
        return (this.views != 0) ? (float) this.likes / (float) this.views : 0;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",songTitle,songwriter,likes,views";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.songTitle + "," + this.songwriter + "," + this.likes + "," + this.views;
    }
}
