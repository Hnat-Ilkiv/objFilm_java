package ua.lviv.iot.models;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Podcast extends Video {
    private String podcastHost;
    private String podcastTopic;
    private int likes;
    private int views;

    public Podcast() {
        super();
    }

    public Podcast(final String fileTitle,
                   final String videoTitle,
                   final String director,
                   final int year,
                   final String podcastHost,
                   final String podcastTopic,
                   final int likes,
                   final int views) {
        super(fileTitle, videoTitle, director, year);
        this.podcastHost = podcastHost;
        this.podcastTopic = podcastTopic;
        this.likes = likes;
        this.views = views;
    }

    @Override
    public final float getCurrentRating() {
        return (this.views != 0) ? (float) this.likes / (float) this.views : 0;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",podcastHost,podcastTopic,likes,views";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.podcastHost + "," + this.podcastHost + "," + this.likes + "," + this.views;
    }
}
