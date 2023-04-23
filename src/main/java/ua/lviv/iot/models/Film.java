package ua.lviv.iot.models;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Film extends Video {
    public static final int MIN_RATTING = 1;
    public static final int MAX_PATTING = 10;

    private int rating;
    private int marks;

    public Film() {
        super();
    }

    public Film(final String fileTitle,
                final String videoTitle,
                final String director,
                final int year,
                final int rating,
                final int marks) {
        super(fileTitle, videoTitle, director, year);
        this.rating = rating;
        this.marks = marks;
    }

    public final void rate(final int rating) {
        if (rating <= MIN_RATTING) {
            this.rating++;
        } else if (rating >= MAX_PATTING) {
            this.rating += MAX_PATTING;
        } else {
            this.rating += rating;
        }
        this.marks++;
    }

    @Override
    public final float getCurrentRating() {
        return (this.marks != 0) ? (float) this.rating / (float) this.marks : 0;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",rating,marks";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.rating + "," + this.marks;
    }
}
